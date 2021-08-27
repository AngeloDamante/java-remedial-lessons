package school;

public abstract class Verifica {
	protected String nome;
	protected int voto;
	
	public abstract void modifica(int nuovoVoto);
	
	public int getVoto() {
		return this.voto;
	}
}
