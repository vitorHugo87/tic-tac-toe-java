package ticTacToe;

import ticTacToe.UI.UI;

public class Program {

	public static void main(String[] args) {
		String[][] velha = {
				{"X", "O", " "},
				{" ", "X", " "},
				{"O", " ", "X"}
		};
		UI.mostraVelha(velha);
	}
}
