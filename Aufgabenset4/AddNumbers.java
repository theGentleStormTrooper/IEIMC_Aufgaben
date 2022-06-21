package Aufgabenset4;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		for (int i=0; i<10; i++) {
			System.out.println("Geben Sie eine Zahl ein:");
			sum += input.nextInt();
		}
		System.out.println();
		System.out.println("Die Summe ist: " + sum);
		
	}
	
}
