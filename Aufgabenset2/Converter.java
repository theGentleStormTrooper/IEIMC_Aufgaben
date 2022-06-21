package Aufgabenset2;
import java.util.Scanner;


public class Converter {
	static String symbols[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
	
	static String convertFromDec(int number, String baseString) {
		int base = getBase(baseString);
		int remainder;
		String returnValue = "";
		
		while(number > 0) {
			remainder = number % base;
			number = number / base;
			returnValue = symbols[remainder] + returnValue;
		}
		
		return returnValue;
		
	}
	
	
	static int convertToDec(int number, String baseString) {
		
		int base = getBase(baseString);
		int remainder;
		int returnValue =0;
		double i = 0;
		
		while (number > 0) {
			remainder = number % 10;
			number = number/10;
			returnValue = (int)(returnValue + remainder * Math.pow(base, i++));
		}
		
		return returnValue;
		
	}
	
	static int getBase(String _base) {
		int base;

		if (_base == "bin" || _base == "binär") {
			base = 2;
		}
		else if (_base == "oct"|| _base == "oktal") {
			base = 8;
		}
		else if (_base == "dec"|| _base == "dezimal") {
			base = 10;
		}
		else if (_base == "hex"|| _base == "hexadezimal") {
			base = 16;
		}
		else {
			base = 0; //destroys the world by dividing by zero
		}
		return base;
	}
	

//--------------------------------------------------------------------------------------------
	
	
	public static void main(String[] args) {
		
		int number = 0;
		Scanner input = new Scanner(System.in);
		String types1[] = {"binär", "oktal", "dezimal"};
		String types2[] = {"binär", "oktal", "dezimal", "hexadezimal"};
		ConsoleSwitch convertFrom = new ConsoleSwitch("Geben Sie die Basis der eingegebenen Zahl an:", types1);
		ConsoleSwitch convertTo = new ConsoleSwitch("Geben Sie die gewünschte Basis der Ausgabe an:", types2);

		System.out.println("Geben Sie eine Zahl ein:");
		number = input.nextInt();
		
		if (convertFrom.ask()) {
			
			number = Converter.convertToDec(number,types1[convertFrom.answer-1]);
			System.out.println();
			
			if (convertTo.ask()) {
				System.out.print("Ihre Zahl in " + types2[convertTo.answer-1] + ": ");
				System.out.println(Converter.convertFromDec(number, types2[convertTo.answer-1]));
				System.out.println();
			}
		}
		
		Converter.main(args);

	}

}
