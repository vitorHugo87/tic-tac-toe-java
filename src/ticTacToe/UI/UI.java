package ticTacToe.UI;

public class UI {

	public static void mostraVelha(String[][] velha) {
		System.out.println("   1   2   3");
		for(int i = 0; i < 3; i++) {
			if(i == 0) System.out.print("A  ");
			else if(i == 1) System.out.print("B  ");
			else System.out.print("C  ");
			for(int j = 0; j < 3; j++) {
				if(j != 2) System.out.print(velha[i][j] + " | ");
				else System.out.println(velha[i][j]);
			}
			if(i != 2) System.out.println("  -----------");
		}
	}
}
