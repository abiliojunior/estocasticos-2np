package estocasticos;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Utils {

	//Procura por um Indiviuo na matrix dado um tipo
	// 1. Individou,
	// 2. Infectado
		public static ArrayList<int[]> procuraIndividuo(Individuo[][] matrix,int tipo) {
			ArrayList<int[]> listaInfectados = new ArrayList<>();
			for (int a = 0; a < matrix.length; a++) {
				for (int b = 0; b < matrix[a].length; b++) {
					if (matrix[a][b].getTipo() == tipo) {
						int [] e= {a,b};
						listaInfectados.add(e);
					}
				}
			}
			return listaInfectados;
		}
	
	
	//Procura por um espaço vazio na matrix
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
	
	
	//Preencge a matrix com individuos sadios
	public static void preencherMatrixSadios(Individuo[][] matrix) {
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b] == null) {
					matrix[a][b] = new Individuo(3);
				}
			}
		}
		
	}
	
	
	//poe um individuo emuma posicao aleatoria
	public static int [] pushAleatoriaoMatriz(Individuo[][] matrix, Individuo individuo) {
		int retorno[]= {-1,-1};
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
					
				}else{
					aleatorio --; 
				}
			}
		}
		retorno [0]= aleatorio/matrix.length;
		retorno [1]= aleatorio%matrix.length;
		
		return retorno;
		
	}
	
	//Procura uma posicao aleatoria livre
	public static int[] posicaoAleatoriaLivre(Individuo[][] matrix) {
		int pos[] = {0,0};
		return pos;
	}
	
	
	//imprime a matrix
	public static void imprimeMatrix(Individuo[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == null) {
					System.out.print(" ");
					System.out.print(" ");
				}else {
					System.out.print(matrix[i][j].print());
					System.out.print(" ");
				}
				
			}	
			System.out.println("");
		}
	}


	public static void salvarDados(String file, int[] dados) {
		File f = new File(file);
		
		System.out.println("salvando");
	}
}
