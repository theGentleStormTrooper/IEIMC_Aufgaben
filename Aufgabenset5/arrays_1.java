package Aufgabenset5;
import java.util.Scanner;

public class arrays_1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int [] numbers = new int[10];
		int sum = 0;
		int product = 1;
		int max = 0;
		int min = 100;
		
		//input
		for (int i=0; i<10; i++) {
			System.out.println("Geben Sie die " + (i+1) + ". te Zahl ein (von 1 - 100)");
			numbers[i] = input.nextInt();
		}
		
		//compute
		for (int i=0; i<10; i++) {
			sum += numbers[i];
			product = product * numbers[i];
			if (max < numbers[i]) {
				max = numbers[i];
			}
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		
		//output
		System.out.println("Ihre Zahlen lauten: ");
		for (int i=0; i<8; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println( numbers[8] + " und " + numbers[9]);
		
		System.out.println("Die Summe Ihrer Zahlen beträgt: " + sum);
		System.out.println("Das Produkt Ihrer Zahlen beträgt: " + product);
		System.out.println("Die grösste Zahl ist: " + max);
		System.out.println("Die kleinste Zahl ist :" + min);
		
		
		
		
		
	}
}
