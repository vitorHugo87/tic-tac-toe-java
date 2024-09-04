package ticTacToe;

import ticTacToe.UI.UI;
import ticTacToe.managers.ComandManager;

public class Program {

	public static void main(String[] args) {
		
		ComandManager cmd = new ComandManager();
		
		String[][] velha = {
				{"X", "O", " "},
				{" ", "X", " "},
				{"O", " ", "X"}
		};
		
		UI.mostraVelha(velha);
		
		System.out.println(cmd.solicitaCoordenada(velha));
	}
}
