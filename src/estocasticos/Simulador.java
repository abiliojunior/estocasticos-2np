package estocasticos;

import java.util.Random;

public class Simulador {

	
		
	public static void main(String[] args) {
		int n = 10;
		Individuo matrix[][] = new Individuo[n][n];
		// TODO Auto-generated method stub
		System.out.println("Processos Estocasticos");
		
		setup(matrix);
		
		System.out.println(Utils.temVazio(matrix));
		
		//Utils.imprimeMatrix(matrix);
		
		

	}
	


	private static void setup(Individuo[][] matrix) {
		System.out.println("Setup Iniciado");

		int posiçaoAuxilar[] = Utils.posicaoAleatoriaLivre(matrix);
		
		
		//TODO Infectado em posicao aleatoria
		
		Utils.pushAleatoriaoMatriz(matrix, new Infectado());
		//TODO randomico de imunes em posicoes aleatorias
		
		Random random= new Random();
		int imunes = random.nextInt(matrix.length-1);
		System.out.println(imunes);
		
		for (int i = 0; i < imunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new Imunes());
		}
		
		//TODO randomico de pseudo imunes em posicao aleatorias
		
		int pseudoImunes = random.nextInt(matrix.length-imunes-1);
		System.out.println(pseudoImunes);
		
		for (int i = 0; i < pseudoImunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new PseudoImunes());
		}
		
		int sadios = matrix.length-imunes-pseudoImunes-1;
		System.out.println(sadios);
		
		Utils.preencherMatrixSadios(matrix);
		
		//Utils.imprimeMatrix(matrix);
		System.out.println("Setup Finalizado");
	}
	
	

}
