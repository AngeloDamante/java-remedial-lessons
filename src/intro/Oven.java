package intro;

public class Oven {
	/* attributes */
	private String nome;
	private String stato;
	private int temperatura;
	private Resistor resistenza; // aggregazione (uso)
	
	/* methods */
	public Oven(String nome, Resistor resistenza) {
		this.nome = nome;
		this.stato = "OFF";
		this.temperatura = 0;
		this.resistenza = resistenza;
	}
	
	public void accendi(int initTemperature) {
		this.stato = "ON";
		this.temperatura = initTemperature;
		this.resistenza.attiva();
	}
	
	public void spegni() {
		this.stato = "OFF";
		this.temperatura = 0;
	}
	
	public String visualizza() {
		return ("stato = " + this.stato + " temperatura = " + this.temperatura);
	}
	
	public boolean ripara(Resistor nuovaResistenza) {
		boolean riparato = false;
		
		if (this.resistenza.getUsura() > 5) {
			sostituisciResistenza(nuovaResistenza);
			riparato = true;
		}
		
		return riparato;
	}
	
	private void sostituisciResistenza(Resistor nuovaResistenza) {
		this.resistenza = nuovaResistenza;
	}
	
}
