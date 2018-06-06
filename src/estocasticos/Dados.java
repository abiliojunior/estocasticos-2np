package estocasticos;


/*
 * vetor de dados contendo as informa�oes.
 */
/*
 * No final de cada atualiza��o, o sistema deve guardar as seguintes informa��es:
 * 8.1. N�mero de Imunes;
 * 8.2. N�mero de pseudo-imunes;
 * 8.3. N�mero de infectantes gerados;
 * 8.4. N�mero de doentes;
 * 8.5. N�mero de acidentados;
 * 8.6. N�mero de sadios;
 * 8.7. Nascimentos.
 */

public class Dados {
	
	private int imunes=0;
	private int pseudoImunes=0;
	private int infectantesGerados=0;
	private int doentes=0;
	private int acidentados=0;
	private int sadios=0;
	private int nascimentos=0;
	
	
	public int getImunes() {
		return imunes;
	}
	public void addImunes() {
		this.imunes ++;
	}
	public int getPseudoImunes() {
		return pseudoImunes;
	}
	public void addPseudoImunes() {
		this.pseudoImunes ++;
	}
	public int getInfectantesGerados() {
		return infectantesGerados;
	}
	public void addInfectantesGerados() {
		this.infectantesGerados ++;
		addDoentes();
	}
	public int getDoentes() {
		return doentes;
	}
	public void addDoentes() {
		this.doentes ++;
	}
	public int getAcidentados() {
		return acidentados;
	}
	public void addAcidentados() {
		this.acidentados ++;
	}
	public int getSadios() {
		return sadios;
	}
	public void addSadios() {
		this.sadios ++;
	}
	public int getNascimentos() {
		return nascimentos;
	}
	public void addNascimentos() {
		this.nascimentos ++;
	}
	
	
}
