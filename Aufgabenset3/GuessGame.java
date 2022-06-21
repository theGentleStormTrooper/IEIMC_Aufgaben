package Aufgabenset3;
import java.util.Random;
import java.util.Scanner;
import Aufgabenset2.ConsoleSwitch;

public class GuessGame {
	
	public static boolean abort = false;
	
	Scanner input = new Scanner(System.in);
	
	String options[] = {"ja", "nein", "vielleicht"};
	ConsoleSwitch retry = new ConsoleSwitch("Nochmals spielen?", options);
	
	int randomNumber = 0;
	int userInput = 0;
	int fails = 0;
	int maxFails = 0;

	
	public GuessGame(int _maxFails) {
		Random random = new Random();
		randomNumber = random.nextInt(100);
		maxFails = _maxFails;
		System.out.print("Erraten Sie die geheime Zahl zwischen 0 und 100. Sie haben ");
		if (maxFails == 0) {
			System.out.println("unbegrenzt viele Versuche.");
		}
		else {
			System.out.println(maxFails + " Versuche.");
		}
		System.out.println("Viel Glück!");
		System.out.println();
	}
	
	public void playRound() {
		getInput();
		if (validate()) {
				abortGame();
		}
		else {
			getHint();
			playRound();
		}
		
	}
	
	void getInput() {
		System.out.println("Geben Sie eine Zahl ein.");
		userInput = input.nextInt();
	}
	
	boolean validate() {
		if (userInput  == randomNumber) {
			System.out.println("Woah, richtig! Die Zahl ist " + randomNumber);
			System.out.println();
			return true;
		}
		else if (maxFails == 0 || fails < maxFails) {
			fails++;
			return false;
		}
		else {
			System.out.println("Leider falsch! Die gesuchte Zahl war " + randomNumber);
			return true;
		}
	}
	
	void getHint() {
		if (userInput > randomNumber) {
			System.out.println("Ihre Zahl ist grösser als die gesuchte Zahl");
			System.out.println();
			fails++;
		}
		else {
			System.out.println("Ihre Zahl ist kleiner als die gesuchte Zahl");
			System.out.println();
			fails++;
		}
	}
	
	void abortGame() {
		if (retry.ask()) { // nochmals spielen?
			if (retry.answer == 1 || retry.answer == 3) {
				abort = false;
			}
			else {
				System.out.println("Schade. Tschüss!");
				abort = true;
			}
		}
	}
	
	//------------------------------ main
	
	public static void main(String[] args) {

		while(!GuessGame.abort) {
			GuessGame game = new GuessGame(2);
			game.playRound();
		}

			
	}

}		