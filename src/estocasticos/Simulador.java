package estocasticos;

import java.util.ArrayList;
import java.util.Random;

/*
 * 0-infectado
 * 1-imunes
 * 2-pseudo imunes
 * 3-sadios
 */



public class Simulador {

	public static void main(String[] args) {
		int n = 10;
		String arquivo = "C:\\Desenvolvimento\\eclipse-oxygen\\Workspace\\estocastico\\dados.csv";
		
		/*
		 * vetor de dados contendo asinformaçoes.
		 */
		int [] dados = null;
		Individuo matrix[][] = new Individuo[n][n];

		System.out.println("Processos Estocasticos");
		
		setup(matrix);
		
		//O indivíduo infectado deverá infectar os seus quatro vizinhos diretos
		
		//Processo de infecccao
		
		int atualizacoes=0;
		
		while (true) {
			
			infectar(matrix);
			
			Eventos.mortes(matrix);
			
			Eventos.acidente(matrix);
			
			Eventos.nascimentos(matrix);
			
			Utils.salvarDados(arquivo, dados);
			
			atualizacoes++;
			
			if (true) {
				break;
			}
			
		}
		
		
		Utils.imprimeMatrix(matrix);
		System.out.println("Finalizado simulação");
		
		

	}
	


	private static void caminhar(Individuo[][] matrix, int linha, int coluna) {

		//escolhe o caminho aleatoriamente
		
		Random random= new Random();
		int aleatorio = random.nextInt(4);
		
		
	}


	private static void infectar(Individuo[][] matrix) {

		//procurar por individuos infectados
		ArrayList<int[]> posicaoInfectados = new ArrayList<>();
		posicaoInfectados = Utils.procuraIndividuo(matrix, 0);
		//System.out.println(posicaoInfectados.size());
		//infectar os proximos
		for (int i = 0; i < posicaoInfectados.size(); i++) {
			int linha = (posicaoInfectados.get(0))[0];
			int coluna= (posicaoInfectados.get(0))[1];
			
			
			//System.out.println("("+ linha + "," + coluna + ")");
			
			if (coluna!=0) {
				
				matrix[linha][coluna-1].setTipo(0);
			}
			
			if(coluna!=matrix.length-1) {
				matrix[linha][coluna+1].setTipo(0);
			}
			
			if (linha!=0) {
				matrix[linha-1][coluna].setTipo(0);
			}
			
			if(linha!=matrix.length-1) {
				matrix[linha+1][coluna].setTipo(0);
			}
			
			caminhar(matrix, linha, coluna);			
		}
		
	}



	private static void setup(Individuo[][] matrix) {
		System.out.println("Setup Iniciado");

		int posiçaoAuxilar[] = Utils.posicaoAleatoriaLivre(matrix);
		
		Utils.pushAleatoriaoMatriz(matrix, new Individuo(0));
		
		Random random= new Random();
		int imunes = random.nextInt(matrix.length-1);
		//System.out.println(imunes);
		
		for (int i = 0; i < imunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new Individuo(1));
		}
		
		
		int pseudoImunes = random.nextInt(matrix.length-imunes-1);
		//System.out.println(pseudoImunes);
		
		for (int i = 0; i < pseudoImunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new Individuo(2));
		}
		
		int sadios = matrix.length-imunes-pseudoImunes-1;
		//System.out.println(sadios);
		
		Utils.preencherMatrixSadios(matrix);
		
		//Utils.imprimeMatrix(matrix);
		System.out.println("Setup Finalizado");
	}
	
	

}
