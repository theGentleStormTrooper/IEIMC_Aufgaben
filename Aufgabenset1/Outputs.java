package Aufgabenset1;

public class Outputs {

	public static void main(String[] args) {
		
		// Aufgabe 4 - Ausgaben

		//1a

		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");

		//1b

		System.out.print("*\n");
		System.out.print("**\n");
		System.out.print("***\n");
		System.out.print("****");

		//1c

		System.out.print("*\n**\n***\n****");

		//2a)
		
		System.out.println("1 2 3 4");
			
		//2b)

		System.out.print("\n");

		//3
		System.out.println("Zahl\tQuadrat\tHoch 3");
		for (int i=0; i<11; i++) {
			System.out.println(i + "\t" + i*i + "\t" + i*i*i);
		}

	}

}
