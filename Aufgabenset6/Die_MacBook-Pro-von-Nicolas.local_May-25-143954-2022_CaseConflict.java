package Aufgabenset6;
import java.util.Random;

public class Die {
	
	int [] results = new int[5];
	int number = 0;
	
	public Die(_number) {
		number = _number;
		for (int i=0; i<results.length; i++) {
			results[i] = 0;
		}
	}
	
	
	
	int throwDie() {
		Random random = new Random();
		int randomNumber = random.nextInt(6);
		results[randomNumber]++;
		return randomNumber;
	}
	
	void showResults() {
		for (int i=0; i<6; i++) {
			System.out.println("Zahl: Anzahl würfe");
			System.out.print((i+1) + " : ");
			System.out.println(results[i]);
		}
	
	}

	public static void main(String[] args) {
	

	}

}
