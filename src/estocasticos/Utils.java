package estocasticos;

import java.util.Random;

public class Utils {

public static boolean temVazio(Individuo[][] matrix) {
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b] == null) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void preencherMatrixSadios(Individuo[][] matrix) {
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b] == null) {
					matrix[a][b] = new Sadios();
				}
			}
		}
		
	}
	
	public static void pushAleatoriaoMatriz(Individuo[][] matrix, Individuo individuo) {
		
		int posicoesVazias = 0;
		
		//descobrir quantos espaços livres tem  a matrix
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b] == null) {
					posicoesVazias ++; 
					//System.out.println(posicoesVazias);
				}
			}
		}
		//System.out.println(posicoesVazias);
		posicoesVazias= posicoesVazias;
		
		//gerar umnumero aleatorio com base no sespaços livres
		Random random= new Random();
		int aleatorio = random.nextInt(posicoesVazias);
		
		
		//por la
		
		mestre:
		for (int x = 0; x < matrix.length; x++) {
			for (int p = 0; p < matrix[x].length; p++) {
				if ((matrix[x][p] == null) && (aleatorio==1)) {
					matrix[x][p] = individuo;
					aleatorio --; 
					break mestre;
					//System.out.println(posicoesVazias);
				}else{
					aleatorio --; 
				}
			}
		}
		//System.out.println(posicoesVazias);
		
	}
	
	
	public static int[] posicaoAleatoriaLivre(Individuo[][] matrix) {
		//TODO Criar o metodo randomico
		int pos[] = {0,0};
		return pos;
	}
	
	public static void imprimeMatrix(Individuo[][] matrix) {
		//TODO Criar o metodo randomico
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}	
			System.out.println("");
		}
	}
}
