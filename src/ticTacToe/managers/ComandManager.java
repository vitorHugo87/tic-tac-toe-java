package ticTacToe.managers;

import java.util.Scanner;

public class ComandManager {
	
	Scanner sc = new Scanner(System.in);
	
	public void closeScanner(Scanner sc) {
		sc.close();
	}
	
	public int[] solicitaCoordenada(String[][] velha) {
		while(true) {
			System.out.print("Digite uma posicao (ex: a1): ");
			String pos = sc.nextLine().toLowerCase().strip();
			if(pos.length() != 2) {
				System.out.println("Erro! Posicao invalida");
				continue;
			}
			
			char y = pos.charAt(0);
			char x = pos.charAt(1);
			if((y != 'a' && y != 'b' && y != 'c') || (x != '1' && x != '2' && x != '3')) {
				System.out.println("Erro! Posicao invalida");
				continue;
			}
			
			int a = 0, b = 0;
			a = (int) y - 97;
			b = (int) x - 49;
			
			if(velha[a][b] != " ") {
				System.out.println("Erro! Posicao ja preenchida");
				continue;
			}
			
			int[] posicoes = {a, b};
			
			return posicoes;
		}
	}
}
