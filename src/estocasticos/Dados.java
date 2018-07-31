package estocasticos;


/*
 * vetor de dados contendo as informaçoes.
 */
/*
 * No final de cada atualização, o sistema deve guardar as seguintes informações:
 * 8.1. Número de Imunes;
 * 8.2. Número de pseudo-imunes;
 * 8.3. Número de infectantes gerados;
 * 8.4. Número de doentes;
 * 8.5. Número de acidentados;
 * 8.6. Número de sadios;
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
	public void subImunes() {
		if(imunes-1<0) {
			this.imunes = 0;
			//System.out.println("error Imunes");
		}else {
			this.imunes --;
		}
		
	}
	public int getPseudoImunes() {
		return pseudoImunes;
	}
	public void addPseudoImunes() {
		this.pseudoImunes ++;
	}
	public void subPseudoImunes() {
		
		if(pseudoImunes-1<0) {
			this.pseudoImunes = 0;
			//System.out.println("error Pseudo imunes");
		}else {
			this.pseudoImunes --;
		}
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
	public void subDoentes() {
		
		if(doentes-1<0) {
			this.doentes = 0;
			//System.out.println("error doentes");
		}else {
			this.doentes --;
		}
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
	public void subSadios() {
		if(sadios-1<0) {
			//System.out.println("error sadios");
			this.sadios = 0;
		}else {
			this.sadios --;
		}
	}
	public int getNascimentos() {
		return nascimentos;
	}
	public void addNascimentos() {
		this.nascimentos ++;
	}
	public void zerar() {
		//this.imunes=0;
		//this.pseudoImunes=0;
		this.infectantesGerados=0;
		//this.doentes=0;
		this.acidentados=0;
		//this.sadios=0;
		this.nascimentos=0;
		
	}
	
	
}
