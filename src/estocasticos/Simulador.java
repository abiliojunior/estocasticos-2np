package estocasticos;

import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/*
 * 0-infectado
 * 1-imunes
 * 2-pseudo imunes
 * 3-sadios
 */



public class Simulador {

	
	
	public static void main(String[] args ) {
		
//		int n = Integer.parseInt(args[0]);
//		int interacaoes= Integer.parseInt(args[1]);
		
		int n = 10;
		int interacaoes= 1000;
		
		Dados dados = new Dados();
		
		Individuo matrix[][] = new Individuo[n][n];

		
		/*
		 * criando arquivo
		 */
		
		String caminhoArquivo = "C:\\Desenvolvimento\\Estocaticos\\";

		SimpleDateFormat formato = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		
		Date data = new Date();
		
		String arquivo = caminhoArquivo+formato.format(data)+".csv";
		
		try {
			FileWriter escrevedor = new FileWriter(arquivo,true);
			
			escrevedor.write("imunes;"
					+ "pseudo_imunes;"
					+ "infectantes_gerados;"
					+ "doentes;"
					+ "acidentados;"
					+ "sadios;"
					+ "nacimentos");
			escrevedor.write("\n");
						
			//escrevedor.flush();
			escrevedor.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * Iniciando a simulacao aqui
		 */
		System.out.println("****** Processos Estocasticos *******");
		
		setup(matrix, dados);
		
		Utils.imprimeMatrix(matrix);
		
		System.out.println("Iniciando Simulaçao"+new Date());
		
		Utils.salvarDados(arquivo, dados);
		
		
		while (interacaoes>0) {
			
				
			infectar(matrix,dados);
			
			Eventos.mortes(matrix,dados);
			
			Eventos.acidente(matrix,dados);
			
			Eventos.nascimentos(matrix,dados);
			
			Utils.salvarDados(arquivo, dados);
			
			atualizar(matrix,dados);
			
			interacaoes--;
			
			dados.zerar();
			
			Utils.imprimeMatrix(matrix);
			
		}
		
		
		Utils.imprimeMatrix(matrix);
		System.out.println("Finalizado simulação"+new Date());
		
		

	}
	


	private static void atualizar(Individuo[][] matrix, Dados dados) {
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (matrix[a][b]!= null) {
					matrix[a][b].addIdade();
				}
				
			}
		}
		
	}



	private static void caminhar(Individuo[][] matrix, int linha, int coluna) {

		//escolhe o caminho aleatoriamente
		
		Random random= new Random();
		int aleatorio = random.nextInt(4);
		int novaPosicao [] = {linha,coluna};
		int atualPosicao [] = {linha,coluna};
		
		switch (aleatorio) {
		case 0:
			
			if(linha!=0) {
				novaPosicao [0] = linha-1;
				novaPosicao [1] = coluna;
				atualPosicao [0] = linha;
				atualPosicao [1] = coluna;
				
				
				trocaPosicao(matrix, atualPosicao, novaPosicao);

			}
						
			break;
		case 1:
			if(coluna!=matrix.length-1) {
				novaPosicao [0] = linha;
				novaPosicao [1] = coluna+1;
				atualPosicao [0] = linha;
				atualPosicao [1] = coluna;
				
				
				trocaPosicao(matrix, atualPosicao, novaPosicao);

			}
			
						
			break;
		case 2:
			if(linha==matrix.length-1) {
				break;
			}
			novaPosicao [0] = linha+1;
			novaPosicao [1] = coluna;
			atualPosicao [0] = linha;
			atualPosicao [1] = coluna;
			
			
			trocaPosicao(matrix, atualPosicao, novaPosicao);
	
			break;
		case 3:
			if(coluna==0) {
				break;
			}
			novaPosicao [0] = (linha);
			novaPosicao [1] = coluna-1;
			atualPosicao [0] = linha;
			atualPosicao [1] = coluna;
			
			trocaPosicao(matrix, atualPosicao, novaPosicao);

			break;		
		default:
			
			break;
		}
		
		
	}


	private static void trocaPosicao(Individuo[][] matrix, int[] atualPosicao, int[] novaPosicao) {
		Individuo posAuxiliar = matrix[novaPosicao[0]][novaPosicao[1]];
		matrix[novaPosicao[0]][novaPosicao[1]]=matrix[atualPosicao[0]][atualPosicao[1]];
		matrix[atualPosicao[0]][atualPosicao[1]]= posAuxiliar;
		
		
	}



	private static void infectar(Individuo[][] matrix, Dados dados) {
		int taxa = 100;
		Random r= new Random();
				
		//procurar por individuos infectados
		ArrayList<int[]> posicaoInfectados = new ArrayList<>();
		
		posicaoInfectados = Utils.procuraIndividuo(matrix, 0);
		
		
		//infectar os proximos
		for (int i = 0; i < posicaoInfectados.size(); i++) {
			int linha = (posicaoInfectados.get(i))[0];
			int coluna= (posicaoInfectados.get(i))[1];
				
			
			if (coluna!=0) {
				
				if (matrix[linha][coluna-1] !=null) {
					
					if(matrix[linha][coluna-1].getTipo()==2) {
						
						if (r.nextInt(100)>taxa) {
							
							matrix[linha][coluna-1].setTipo(0);
							dados.addInfectantesGerados();
							dados.subPseudoImunes();
														
						}
							
						
					}else if(matrix[linha][coluna-1].getTipo()==3){
						matrix[linha][coluna-1].setTipo(0);
						dados.addInfectantesGerados();
						
						
					}					
					
				}
				
			}
			
			if(coluna!=matrix.length-1) {
				
				if (matrix[linha][coluna+1] !=null) {
					
					if(matrix[linha][coluna+1].getTipo()==2) {
						
						if (r.nextInt(100)>taxa) {
							
							matrix[linha][coluna+1].setTipo(0);
							dados.addInfectantesGerados();
							dados.subPseudoImunes();
							
						}
							
						
					}else if(matrix[linha][coluna+1].getTipo()==3){
						matrix[linha][coluna+1].setTipo(0);
						dados.addInfectantesGerados();
						
						
					}
					
					
				}
				
				
			}
			
			if (linha!=0) {
				
				if (matrix[linha-1][coluna] !=null) {
					
					if(matrix[linha-1][coluna].getTipo()==2) {
						
						if (r.nextInt(100)<taxa) {
							
							matrix[linha-1][coluna].setTipo(0);
							dados.addInfectantesGerados();
							dados.subPseudoImunes();
							
						}
							
						
					}else if(matrix[linha-1][coluna].getTipo()==3){
						matrix[linha-1][coluna].setTipo(0);
						dados.addInfectantesGerados();
						
						
					}					
					
				}
				
			}
			
			if(linha!=matrix.length-1) {
				
				if (matrix[linha+1][coluna] !=null) {
					
					if(matrix[linha+1][coluna].getTipo()==2) {
						
						if (r.nextInt(100)>taxa) {
							
							matrix[linha+1][coluna].setTipo(0);
							dados.addInfectantesGerados();
							dados.subPseudoImunes();
							
						}
							
						
					}else if(matrix[linha+1][coluna].getTipo()==3){
						matrix[linha+1][coluna].setTipo(0);
						dados.addInfectantesGerados();
												
					}					
					
				}
				
			}
			
			caminhar(matrix, linha, coluna);	
		}
		
	}



	private static void setup(Individuo[][] matrix, Dados dados) {
		System.out.println("Setup Iniciado");
		int tamanho = matrix.length*matrix.length;
		
		Utils.pushAleatoriaoMatriz(matrix, new Individuo(0));

		//setup imunes
		Random random= new Random();
		int imunes = random.nextInt(tamanho-1);
		for (int i = 0; i < imunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new Individuo(1));
			
			
		}
		
		//setup  pseudo imunes
		int pseudoImunes = random.nextInt(tamanho-imunes-1);
		for (int i = 0; i < pseudoImunes; i++) {
			Utils.pushAleatoriaoMatriz(matrix, new Individuo(2));
			
		}
				
		
		Utils.preencherMatrixSadios(matrix, dados);
		
		Utils.atualizaDadosSetup(matrix, dados);

		System.out.println("Setup Finalizado");
	}
	

}
