package ticTacToe;

import ticTacToe.UI.UI;
import ticTacToe.managers.ComandManager;
import ticTacToe.managers.SituationManager;

public class Program {

	public static void main(String[] args) {
		
		ComandManager cmd = new ComandManager();
		SituationManager stm = new SituationManager();
		
		String[][] velha = resetaJogo();
		
		int player = 0;
		while(stm.continuarJogo(velha)) {
			UI.mostraVelha(velha);
			int[] pos = cmd.solicitaCoordenada(velha);
			if(player % 2 == 0) velha[pos[0]][pos[1]] = "X";
			else velha[pos[0]][pos[1]] = "O";
			player++;
		}
		UI.mostraVelha(velha);
		System.out.println("  FIM DE JOGO!");
	}
	
	public static String[][] resetaJogo(){
		return new String[][] {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
	}
}
