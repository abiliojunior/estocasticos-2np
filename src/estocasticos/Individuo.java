package estocasticos;

public class Individuo {
	
	private int[] posicao= {-1,-1};
	private int tipo = 3;
	private int idade = 0;

	public Individuo(int tipo) {
		super();
		this.tipo = tipo;
		
	}
	
	public Individuo() {
		super();
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		//muda o tempo de vida possivel?
		this.idade = 0;
		this.tipo = tipo;
	}

	public int[] getPosicao() {
		return posicao;
	}

	public void setPosicao(int[] posicao) {
		this.posicao = posicao;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void addIdade() {
		
		this.idade ++;
	}
	
	public String print() {
		switch (this.tipo) {
		case 0:
			return "O";
			
		case 1:
			return "*";
		case 2:
			return "@";
		
		case 3:
			return "X";
		}
		return " ";
	}

}
