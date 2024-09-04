package ticTacToe.managers;

public class SituationManager {

	public boolean continuarJogo(String[][] velha) {
		String concat = "";
		for(int i = 0; i < 3; i++) { // Verifica nas Horizontais
			concat = "";
			for(int j = 0; j < 3; j++) {
				concat += velha[i][j];
			}
			if(concat.equals("XXX") || concat.equals("OOO")) return false;
		}
		
		for(int i = 0; i < 3; i++) { // Verifica nas Verticais
			concat = "";
			for(int j = 0; j < 3; j++) {
				concat += velha[j][i];
			}
			if(concat.equals("XXX") || concat.equals("OOO")) return false;
		}
		
		concat = "";
		for(int i = 0; i < 3; i++) { // Verifica na diagonal (Esquerda para a direita)
			concat += velha[i][i];
		}
		if(concat.equals("XXX") || concat.equals("OOO")) return false;
		
		concat = "";
		for(int i = 0; i < 3; i++) { // Verifica na diagonal (Direita para a esquerda)
			concat += velha[i][2 - i];
		}
		if(concat.equals("XXX") || concat.equals("OOO")) return false;
		
		for(String[] l : velha) { // Verifica se há espaço para jogar
			for(String s : l) {
				if(s.equals(" ")) return true;
			}
		}
		
		return false;
	}
}
