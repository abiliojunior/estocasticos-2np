package estocasticos;

public class Utils {

	
	public void guardarDados() {
		//TODO Criar o metodo 
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
