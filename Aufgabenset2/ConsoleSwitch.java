package Aufgabenset2;
import java.util.Scanner;

public class ConsoleSwitch {
		
		Scanner input = new Scanner(System.in);
		
		String question;
		String[] options;
		String errorMessage = "no such option available";
		public int answer;
		
		public ConsoleSwitch(String _question, String[] _optionsArray) {
			
			question = _question;
			options = _optionsArray;
			
		}
		
		public ConsoleSwitch(String _question, String[] _optionsArray, String _errorMessage) {
			
			question = _question;
			options = _optionsArray;
			errorMessage = _errorMessage;
			
		}
		
		public boolean ask() {
			System.out.println(question + " (enter Nr. to select)");
			for (int i=0; i<options.length; i++) {
				System.out.println(i+1 + " \t" + options[i]);
			}
			System.out.println();
			answer = input.nextInt();
			if (answer > options.length || answer < 1) {
				System.out.println(errorMessage);
				return false;
			}
			return true;
		}
		
		
//------------------------------------
		
	/*	public static void main(String[] args) {
			//String[] options1 = {"yes", "no"};
			String[] options2 = {"not at all", "not really", "a little", "pretty much"};
			//consoleMenuPoint question1 = new consoleMenuPoint("Does any of this work?", options1, keys1);
			ConsoleSwitch question2 = new ConsoleSwitch("Do you like this class?", options2);
			question2.ask();
			System.out.println("result = " + question2.answer);
			
			if(question2.answer == 1) {
				System.out.println("nice!");
			}
			else if(question2.answer == 2) {
				System.out.println("that sucks!");
			}
			else {
				System.out.println("you better check your options!");
			}
			ConsoleSwitch.main(args);
		}
		*/


	
}
