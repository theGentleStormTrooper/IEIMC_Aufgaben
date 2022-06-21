package Aufgabenset6;
import java.util.Random;

public class ArraySort {
	
	static int [] Array = new int [20];
	static Random random = new Random();
	static int min;
	static int buffer;
	static int index = -1;
	
	static int steps = 0;
	
	public static void randomize() {
		steps = 0;
		for (int i=0; i<20; i++) {
			Array[i] = random.nextInt(100);
		}
	}
	public static void printArray() {
		for (int i=0; i<20; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.println();
	}
	
	public static void sort() {
		for (int i=0; i<Array.length; i++) {
			min = Array[i];
			buffer = Array[i];
			index = i;
			for (int j=i+1; j<Array.length; j++) {
				if (min > Array[j]) {
					min = Array[j];
					index = j;
				}
			}
			Array[i] = min;
			Array[index] = buffer;
		}
	}
	

	public static void main(String[] args) {
		
		ArraySort.randomize();
		System.out.println("Array unsortiert:");
		ArraySort.printArray();
		System.out.println();
		
		ArraySort.sort();
		System.out.println("Array sortiert:");
		ArraySort.printArray();
	}

}
