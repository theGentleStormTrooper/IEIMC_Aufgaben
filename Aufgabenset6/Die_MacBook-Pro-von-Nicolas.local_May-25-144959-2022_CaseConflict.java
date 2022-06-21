package Aufgabenset6;
import java.util.Random;
import java.util.Scanner;


public class Die {
	
	
	public Die(maxNumber) {
		int [] results = new int[maxNumber];
	}
	
	void throwDie() {
		Random random = new Random();
		randomNumber = random.nextInt(6);
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
