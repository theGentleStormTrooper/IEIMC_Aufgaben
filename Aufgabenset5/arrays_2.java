package Aufgabenset5;
import java.util.Scanner;

public class arrays_2 {
	


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String [] words = new String[10];
		
		for (int i=0; i<10; i++) {
			System.out.println("Geben sie das " + (i+1) + "te Wort ein.");
			words[i] = input.next();
		}
		System.out.println("THx!");
		System.out.println();
		
		for (int i=0; i<10; i++) {
			System.out.println(words[9-i]);
		}

	}

}
