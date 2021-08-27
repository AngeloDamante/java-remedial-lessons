package school;

public class Studente {
	private String nome;
	private int eta;
	private int crediti;
	private int votoFinale;
	private Verifica[] verifiche;
	
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
		this.crediti = 0;
		this.votoFinale = 0;
		verifiche = new Verifica[1];
	}
	
	public void calcolaVotoFinale() {
		int numVerifiche = verifiche.length;
		float somma = 0;
		for(int v = 0; v < numVerifiche; v++) {
			somma += verifiche[v].getVoto();
		}
		this.votoFinale = (int)somma/numVerifiche;
	}
	
	public void aggiungiVerifica(Verifica v) {
		int n = this.verifiche.length+1;
		Verifica[] verifiche = new Verifica[this.verifiche.length+1];
		for(int i = 0; i < this.verifiche.length; i++)
			verifiche[i] = this.verifiche[i];
		verifiche[n-1] = v;
		
		this.verifiche = verifiche;
	}
	
	public int getVotoFinale() {
		return this.votoFinale;
	}
	
}
