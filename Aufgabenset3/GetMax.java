package Aufgabenset3;
import java.util.Scanner;

public class GetMax {
	
	static Scanner input = new Scanner(System.in);
	
	static int a = 0;
	static int b = 0;
	static int c = 0;
	static int maxValue;
	
	static void getNumbers() {
		System.out.println("Geben Sie die erste Zahl ein:");
		a = input.nextInt();
		
		
		System.out.println("Geben Sie die zweite Zahl ein:");
		b = input.nextInt();
		
		System.out.println("Geben Sie die dritte Zahl ein:");
		c = input.nextInt();
	}
	
	static void getMaximum() {
		if (a > b) {
			if (a > c) {
				maxValue = a;
			}
			else {
				maxValue = c;
			}
		}
		else if (b > c) {
			maxValue = b;
		}
		else {
			maxValue = c;
		}
	}

	public static void main(String[] args) {
		//GetMax myNumbers = new GetMax();
		GetMax.getNumbers();
		GetMax.getMaximum();
		System.out.println("Von den Zahlen: " + GetMax.a + ", " + GetMax.b + " und " +  GetMax.c + " ist die grösste Zahl: " + GetMax.maxValue);
		
		System.out.println();
		GetMax.main(args);
	}
	
}
