package school;

public class Aula {
	private Studente[] Studenti;
	private int numBanchi;
	private String nome;
	
	public Aula(String nome, Studente[] Studenti) {
		this.nome = nome;
		this.Studenti = Studenti;
		this.numBanchi = Studenti.length;
	}
	
	public Aula(String nome, Studente[] Studenti, int numBanchi) {
		this.nome = nome;
		this.Studenti = Studenti;
		this.checkBanchi(numBanchi);
		
	}
	
	private void checkBanchi(int numBanchi) {
		if (numBanchi >= Studenti.length)
			this.numBanchi = numBanchi;
		else
			this.numBanchi = Studenti.length;
	}
	
	public int getNumBanchi() {
		return this.numBanchi;
	}
	
	public void setNumBanchi(int numBanchi) {
		this.checkBanchi(numBanchi);
	}
	
	public Studente[] getStudenti() {
		return this.Studenti;
	}
	
	public void setStudenti(Studente[] nuoviStudenti) {
		this.Studenti = nuoviStudenti;
		this.checkBanchi(this.numBanchi);
	}
}