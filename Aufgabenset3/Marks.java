package Aufgabenset3;
import java.util.Scanner;


public class Marks {
	
	static Scanner input = new Scanner(System.in);
	
	static float mark1 = 0f;
	static float mark2 = 0f;
	static float mark3 = 0f;
	static float mark4 = 0f;
	static float average = 0f;
	static String comment = "";
	
	static void getMarks() {
		System.out.println("Geben sie Ihre erste Note ein.");
		mark1 = input.nextFloat();
		System.out.println("Geben sie Ihre zweite Note ein.");
		mark2 = input.nextFloat();
		System.out.println("Geben sie Ihre dritte Note ein.");
		mark3 = input.nextFloat();
		System.out.println("Geben sie Ihre vierte Note ein.");
		mark4 = input.nextFloat();
		
		average = (mark1 + mark2 + mark3 + mark4)/4;
	}
	
	static String getComment(){
		if (average > 5.5) {
			comment = "sehr gut";
		}
		else if (average > 5){
			comment = "gut";
		}
		else if (average > 4.5){
			comment = "befriedigend";
		}
		else if (average > 4){
			comment = "ausreichend";
		}
		else {
			comment = "ungenügend";
		}
		
		return comment;
	}

	public static void main(String[] args) {
		Marks.getMarks();
		System.out.println("Dein Notendurchschnitt ist: " + Marks.average);
		System.out.println("Das Prädikat für deinen Notenschnitt ist: " + Marks.getComment());
	}
	
}
