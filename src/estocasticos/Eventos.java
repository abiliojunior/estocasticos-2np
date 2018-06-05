package estocasticos;

import java.util.Random;

public class Eventos {
	
	public static void acidente(Individuo[][] matrix) {

		/*
		 * Pode ocorrer acidente. Isso ocorre antes de iniciar a pr�xima atualiza��o:
		 * 6.1. Considerando que cada indiv�duo possui um percentual de 10% de acidentar-se,
		 * por exemplo;
		 * 6.2. Deve-se varrer a matriz inteira, comparando um n�mero a ser criado para cada
		 * c�lula varrida (n�mero rand�mico, Y) com os 10%. Assim, Se Y< 10% ent�o
		 * morre, sen�o permanece vivo.
		 */
		Random random= new Random();
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if ((matrix[a][b] != null) & (random.nextInt(100)<10)) {
					matrix[a][b] = null;
				}
			}
		}
		
		
	}
	
	
	public static void nascimentos(Individuo[][] matrix) {
		//TODO Criar o metodo 
		/*
		 * Isso ocorre antes de iniciar a pr�xima atualiza��o. As c�lulas que n�o cont�m 
		 * indiv�duos devido � ocorr�ncia de mortes, cont�m um percentual de 80% que � 
		 * comparado com um n�mero rand�mico (Z). Se Z<80% ent�o nasce, sen�o, n�o 
		 * nasce.
		 * 7.2. Os nascidos podem ser dos seguintes tipos, sendo escolhidos de forma aleat�ria:
		 * 7.2.1. Imunes;
		 * 7.2.2. Pseudo-imunes;
		 */
		
		Random random= new Random();
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if ((matrix[a][b] == null) & (random.nextInt(100)<80)) {
					if (random.nextBoolean()){
						matrix[a][b] = new Individuo(2);
					}else {
						 matrix[a][b] = new Individuo(3);
					}
				}
			}
		}
	}


	public static void mortes(Individuo[][] matrix) {
		
		//Os sadios ou imunes normalmente morrem ap�s 10 atualiza��es (10 passos) ou acidentes
		// Os pseudo-imunes morrem ap�s 4 atualiza��es ou acidente
		//Os infectados morrem ap�s 3 atualiza��es ou acidentes;
		
		for (int a = 0; a < matrix.length; a++) {
			for (int b = 0; b < matrix[a].length; b++) {
				if (((matrix[a][b].getTipo()==1) || (matrix[a][b].getTipo()==3))&& (matrix[a][b].getIdade()>9) ){
					matrix[a][b] =null;
				}
				if ((matrix[a][b].getTipo()==2) && (matrix[a][b].getIdade()>3) ){
					matrix[a][b] =null;
				}
				if ((matrix[a][b].getTipo()==0) && (matrix[a][b].getIdade()>2) ){
					matrix[a][b] =null;
				}
			}
		}
		
	}

}
