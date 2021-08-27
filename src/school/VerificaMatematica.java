package school;

public class VerificaMatematica extends Verifica {
	public VerificaMatematica(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public void modifica(int nuovoVoto) {
		System.out.println("voto mate " + this.nome + "modificato");
		this.voto = nuovoVoto;
	}
}
