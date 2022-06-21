package Aufgabenset5;
import java.util.Scanner;

public class arrays_3 {
	
	Scanner input = new Scanner(System.in);
	int [] numbers = new int[10];
	int [] permValues = new int[2];
	int buffer;
	boolean validation = false;
	
	void getInputs() {
		for (int i=0; i<10; i++) {
			System.out.println("Bitte geben Sie die " + (i+1) + ". Zahl ein.");
			numbers[i] = input.nextInt();
		}
		System.out.println();
	}
	
	boolean validate(int value) {
		if (value >= 0 && value < numbers.length) {
			return true;
		}
		else {
			System.out.println("Diese Zahl steht nicht im  Angebot");
			outputNumbers();
			return false;
		}
		
	}
	
	void outputNumbers() {
		System.out.println("Ihre Zahlen sind:");
		for (int i=0; i<10; i++) {
			System.out.println("Zahl " + (i+1) + ":" + numbers[i]);
		}
		System.out.println();
	}
	
	void getPermutationValue(int value) {
		System.out.println("Wählen Sie die " + value + ". Zahl aus, die vertauscht werden soll:");
		
		permValues[value - 1] = input.nextInt() - 1;
		validation = validate(permValues[value - 1]);
	}
	
	void changeValues() {
		buffer = numbers[permValues[0]];
		numbers[permValues[0]] = numbers[permValues[1]];
		numbers[permValues[1]] = buffer;
	}
	
	//-------------------------------------------------------
	
	public static void main(String[] args) {
		
		arrays_3 permutator = new arrays_3();
		permutator.getInputs();
		
		permutator.outputNumbers();
		while(true) {
			while (!permutator.validation) {
				permutator.getPermutationValue(1);
			}
			permutator.validation = false;
			while (!permutator.validation) {
				permutator.getPermutationValue(2);
			}
			permutator.validation = false;
			permutator.changeValues();
			permutator.outputNumbers();
		}
		
		
		
		
		
		
		
		
		
	}


}
