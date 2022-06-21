package Aufgabenset2;
import java.util.Scanner;

public class InflationCalculator {
	
	static Scanner input = new Scanner(System.in);
	
	static float calcInflation(float _oldPrice, float _newPrice) {
		return (_newPrice - _oldPrice) / _oldPrice * 100;
	}
	
	
	public static void main(String[] args) {
		
		float oldPrice;
		float newPrice;
		
			
		System.out.println("Geben sie den alten Preis ein:");
		oldPrice = input.nextFloat();
		System.out.println("Geben sie den neuen Preis ein:");
		newPrice = input.nextFloat();
		System.out.println();
		System.out.print("Die Inflation beträgt:");
		System.out.println(calcInflation(oldPrice, newPrice) + "%");
	}
	
}

