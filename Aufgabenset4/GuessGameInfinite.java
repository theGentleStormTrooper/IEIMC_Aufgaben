package Aufgabenset4;
import Aufgabenset3.GuessGame;

public class GuessGameInfinite {

	public static void main(String[] args) {
		while(!GuessGame.abort) {
			GuessGame game = new GuessGame(5);
			game.playRound();
		}

	}

}
