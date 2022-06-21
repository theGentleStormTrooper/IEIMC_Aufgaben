package Aufgabenset6;

public class Funpark {
	
	//test3
	
	int [] train;
	int [] track;

	int buffer;
	
	
	
	public Funpark(int [] _passengers, int [] _track) {

		train =	_passengers;
		track = _track;
		System.out.print("Ihr Track besteht aus ");
		System.out.print(countBlackTunnel(track));
		System.out.print(" schwarzen Tunneln und ");
		System.out.print(countWhiteTunnel(track));
		System.out.println(" weissen Tunneln. ");
		System.out.println();
	}
	
	int countBlackTunnel(int [] _track) {
		int returnValue = 0;
		for (int i=0; i<_track.length; i++) {
			returnValue += _track[i];
		}
		return returnValue;
	
	}
	
	int countWhiteTunnel(int [] _track) {
		int returnValue = _track.length - countBlackTunnel(_track);
		return returnValue;
	}
	
	void blackTunnel() { //reihenfolge umkehren
		int [] buff = new int[train.length];
		for (int i=0, j=train.length - 1; i<train.length; i++, j--) {
			buff[i] = train[j];
		}
		train = buff;
	}
	
	void whiteTunnel() { //erster und letzter vertauschen
		buffer = train[0];
		train[0] = train[train.length -1];
		train[train.length -1] = buffer;
	}
	
	void printTrain() {
		for (int i=0; i<train.length; i++) {
			System.out.print(train[i]);
			
		}
		System.out.println();
	}
	
	public void rideTrack() {
		for (int i=0; i<track.length; i++) {
			if (track[i] == 0) {
				whiteTunnel();
			}
			else {
				blackTunnel();
			}
		}
		
	}

	public static void main(String[] args) {
		
		int [] zug1 = {1,2,3,4,5,6,7,8,9};
		int [] zug2 = {1,2,3,4,5,6,7,8,9,10,11,12};
		int [] track1 = {0,1,0,0,0,1,0,1,0,1};
		Funpark park1 = new Funpark(zug1, track1);
		park1.printTrain();
		park1.rideTrack();
		park1.printTrain();
	}
	
	

}
