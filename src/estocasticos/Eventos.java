package estocasticos;

import java.util.Random;

public class Eventos {
	
	public static void acidente(Individuo[][] matrix, Dados dados) {

		/*
		 * Pode ocorrer acidente. Isso ocorre antes de iniciar a próxima atualização:
		 * 6.1. Considerando que cada indivíduo possui um percentual de 10% de acidentar-se,
		 * por exemplo;
		 * 6.2. Deve-se varrer a matriz inteira, comparando um número a ser criado para cada
		 * célula varrida (número randômico, Y) com os 10%. Assim, Se Y< 10% então
		 * morre, senão permanece vivo.
		 */
		Random random= new Random();
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if ((matrix[a][b] != null) & (random.nextInt(100)<10)) {
										
					switch (matrix[a][b].getTipo()) {
					case 0:
						dados.subDoentes();
						break;
					case 1:
						dados.subImunes();
						break;
					case 2:
						dados.subPseudoImunes();
						break;
					case 3:
						dados.subSadios();
						break;

					}
					
					matrix[a][b] = null;
					dados.addAcidentados();
				
				}
			}
		}
		
		
	}
	
	
	public static void nascimentos(Individuo[][] matrix, Dados dados) {
		
		//TODO Criar o metodo 
		/*
		 * Isso ocorre antes de iniciar a próxima atualização. As células que não contém 
		 * indivíduos devido à ocorrência de mortes, contém um percentual de 80% que é 
		 * comparado com um número randômico (Z). Se Z<80% então nasce, senão, não 
		 * nasce.
		 * 7.2. Os nascidos podem ser dos seguintes tipos, sendo escolhidos de forma aleatória:
		 * 7.2.1. Imunes;
		 * 7.2.2. Pseudo-imunes;
		 */
		
		Random random= new Random();
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if ((matrix[a][b] == null) & (random.nextInt(100)<80)) {
					if (random.nextBoolean()){
						matrix[a][b] = new Individuo(1);
						dados.addImunes();
						dados.addNascimentos();
					}else {
						 matrix[a][b] = new Individuo(2);
						 dados.addPseudoImunes();
						 dados.addNascimentos();
					}
				}
			}
		}
	}


	public static void mortes(Individuo[][] matrix, Dados dados) {
		
		//Os sadios ou imunes normalmente morrem após 10 atualizações (10 passos) ou acidentes
		// Os pseudo-imunes morrem após 4 atualizações ou acidente
		//Os infectados morrem após 3 atualizações ou acidentes;
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				
					
				if (matrix[a][b]!=null) {
					
					if (((matrix[a][b].getTipo()==1) || (matrix[a][b].getTipo()==3))&& (matrix[a][b].getIdade()>9) ){
						
						if (matrix[a][b].getTipo()==1) {
							dados.subImunes();
						}else {
							dados.subSadios();
						}
						matrix[a][b] = null;
						
					}else if ((matrix[a][b].getTipo()==2) && (matrix[a][b].getIdade()>3) ){
						
						dados.subPseudoImunes();
						matrix[a][b] =null;
						
					}else if ((matrix[a][b].getTipo()==0) && (matrix[a][b].getIdade()>2) ){
						
						dados.subDoentes();
						matrix[a][b] =null;
					}
				}
				
				
			}
		}
		
	}

}
