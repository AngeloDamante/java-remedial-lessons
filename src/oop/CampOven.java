package oop;

public final class CampOven extends Oven{
	/* attributes */
	// private int numFiammelle;
	private int carburante;
	private Fiammella[] Fiammelle;
	
	public static int numManopole = 3;
	
	/* methods */
	public CampOven(String nome, Resistor r, int numFiammelle) {
		super(nome, r);
		this.carburante = 0;
		
		// crea un array
		this.Fiammelle = new Fiammella[numFiammelle];
		this.riempiVettore();
	}
	
	
	private void riempiVettore() {
		for(int i = 0; i < this.Fiammelle.length; i++) {
			// crea un oggetto nel i-esimo posto dell'array
			this.Fiammelle[i] = new Fiammella();
		}
	}
	
	public void apriCoperchio() {
		
	}
	
	public boolean caricaCarburante() {
		// fa il pieno
		if (this.carburante == 10) {
			System.out.println("è già pieno\n");
			return false;
		}else {
			System.out.println(10 - this.carburante);
			this.carburante = 10;
			return true;
		}
	}
	
	@Override
	public void accendi() {
		for(int fiamma = 0; fiamma < this.Fiammelle.length; fiamma++) {
			this.Fiammelle[fiamma].on();
		}
	}
	
	//Overload
	public void accendi(int numFiammelle) {
		if(numFiammelle <= this.Fiammelle.length) {
			int fiamma = 1;
			while(fiamma < numFiammelle) {
				this.Fiammelle[fiamma].on();
				fiamma++;
			}
		}
	}
	
	public void spegni() {
		for(int fiamma = 0; fiamma < this.Fiammelle.length; fiamma++) {
			this.Fiammelle[fiamma].off();
		}
		
		this.carburante = 0;
	}
	
}
