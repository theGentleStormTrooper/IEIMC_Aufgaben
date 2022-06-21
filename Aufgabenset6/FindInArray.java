package Aufgabenset6;
import java.util.Arrays;
import java.util.Scanner;

public class FindInArray {
	
	static int index = -1;
	static int steps = 0;

	public static boolean findValue(int [] inputArray, int value) {
		index = -1;
		Arrays.sort(inputArray);
		for (int i=0; i<inputArray.length; i++) {
			if (inputArray[i] == value) {
				index = i;
			}
			steps++;
		}
		if (index >= 0) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int [] haus_1 = {9, 13, 2, 1, 8, 7, 5};
		
		while (true) {
			System.out.println("Welchen Raum suchen sie?");
			int value = input.nextInt();
			
			
			if (FindInArray.findValue(haus_1, value)){
				System.out.print("Ihr Raum hat den Index: ");
				System.out.println(FindInArray.index);	
			}
			else {
				System.out.println("Der gesuchte Raum ist in einem anderen Gebäude. (Vielleicht...)");
			}
			System.out.println();
		}
		

	}

}
