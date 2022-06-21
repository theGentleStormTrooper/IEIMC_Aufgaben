package Aufgabenset5;
import java.util.Scanner;

public class Permutation_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int buffer = 0;
		
		System.out.println("Geben Sie eine Zahl ein:");
		num1 = input.nextInt();
		System.out.println("Geben Sie noch eine Zahl ein:");
		num2 = input.nextInt();
		System.out.println("Geben Sie noch eine Zahl ein:");
		num3 = input.nextInt();
		
		System.out.println("Zahl 1 = " + num1 + " Zahl 2 = " + num2 + " Zahl 3 = " + num3);
		buffer = num1;
		num1 = num2;
		num2 = num3;
		num3 = buffer;
		System.out.println("Zahl 1 = " + num1 + " Zahl 2 = " + num2 + " Zahl 3 = " + num3);
		
		
	}
}
