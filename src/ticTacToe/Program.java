package ticTacToe;

import ticTacToe.UI.UI;
import ticTacToe.managers.ComandManager;

public class Program {

	public static void main(String[] args) {
		
		ComandManager cmd = new ComandManager();
		
		String[][] velha = resetaJogo();
		
		int player = 0;
		while(true) {
			UI.mostraVelha(velha);
			int[] pos = cmd.solicitaCoordenada(velha);
			if(player % 2 == 0) velha[pos[0]][pos[1]] = "X";
			else velha[pos[0]][pos[1]] = "O";
			player++;
		}
	}
	
	public static String[][] resetaJogo(){
		return new String[][] {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
	}
}
