package intro;

import java.lang.String;

public class Automobile {
	private String nome;
	private int pedaleAcc;
	private int pedaleFreno;
	private String stato;

	public Automobile(String nome) {
		this.nome = nome;
		this.pedaleAcc = 0;
		this.pedaleFreno = 0;
		this.stato = "OFF";
	}

	public void accendi() {
		this.stato = "ON";
	}

	public void avanti(int pressionePedale) {
		this.pedaleAcc = this.pedaleAcc + pressionePedale;
		this.stato = "In moto";
	}

	public void indietro(int pressionePedale) {
		this.pedaleFreno += pressionePedale;
		this.stato = "Frenando";
	}

	public String visualizza() {
		return this.stato;
	}
}
