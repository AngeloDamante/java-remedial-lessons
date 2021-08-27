package school;

public class VerificaInformatica extends Verifica{
	public VerificaInformatica(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public void modifica(int nuovoVoto) {
		System.out.println("voto info " + this.nome + "modificato");
		this.voto = nuovoVoto;
	}
}
