package Aufgabenset6;
import java.util.Random;
import java.util.Scanner;


public class Die {
	int [] results = new int[12];
	int maxNumber = 6;
	
	
	public Die(_maxNumber) {
		maxNumber = maxNumber;
	}
	
	void throwDie(n) {
		for (int i=0; i<n; i++){
		Random random = new Random();
		int randomNumber = random.nextInt(6);
		results[randomNumber-1]++;
	}
	
	void showResults() {
		System.out.println("Zahl: Anzahl Würfe");
		for (int i=0; i<results.length; i++) {
			System.out.print(i+1);
			System.out.println(" " + results[i]);
		}
	}
	
	public static void main(String[] args) {
		Die Wuerfel = new Die(6);
	}

}
