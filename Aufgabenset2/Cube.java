package Aufgabenset2;

import java.util.Scanner;

public class Cube {
	
	Scanner input = new Scanner(System.in);
	int side = 0;;
	
	int calcSurface() {
		return side*side*6;
	}
	
	int calcVolume() {
		return side*side*side;
	}
	
	public static void main(String[] args) {
		
		Cube myCube = new Cube();
		
			
		System.out.println("Geben sie die Kantenlänge des Würfels ein:");
		myCube.side = myCube.input.nextInt();
		System.out.println();
		System.out.print("Die Gesamtfläche beträgt:");
		System.out.println(myCube.calcSurface());
		System.out.print("Das Volumen beträgt:");
		System.out.println(myCube.calcVolume());
	}
	
}
