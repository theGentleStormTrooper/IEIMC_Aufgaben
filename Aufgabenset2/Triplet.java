package Aufgabenset2;
import java.util.Scanner;

public class Triplet {
	
	Scanner input = new Scanner(System.in);
	int number1;
	int number2;
	int number3;
	
	void getNumbers() {
		System.out.println("Bitte geben sie eine Zahl ein:");
		number1 = input.nextInt();
		System.out.println("Bitte geben sie eine zweite Zahl ein:");
		number2 = input.nextInt();
		System.out.println("Bitte geben sie eine dritte Zahl ein:");
		number3 = input.nextInt();
	}
	
	void outputSum() {
		System.out.print("Die Summe der eingegebenen Zahlen ist: ");
		System.out.println(number1 + number2 + number3);
	}
	
	void outputProduct() {
		System.out.print("Das Produkt der eingegebenen Zahlen ist: ");
		System.out.println(number1 * number2 * number3);
	}
	
//--------------------------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		Triplet set1  =  new Triplet();
		
		getUserInput(set1);
		
		
	
	}
	
	static void getUserInput(Triplet set) {
		set.getNumbers();
		set.outputSum();
		set.outputProduct();
	}
}
