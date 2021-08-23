package oop;

public class CampOven extends Oven{
	/* attributes */
	private int numFiammelle;
	private int carburante;
	
	/* methods */
	public CampOven(String nome, Resistor r, int numFiammelle) {
		super(nome, r);
		this.carburante = 0;
		this.setNumFiammelle(numFiammelle);
			
	}
	
	public void apriCoperchio() {
		
	}
	
	private void setNumFiammelle(int numFiammelle) {
		if (numFiammelle > 2 && numFiammelle < 8) {
			this.numFiammelle = numFiammelle;
		}else {
			this.numFiammelle = 2;
		}
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
		int fiamma = 1;
		while(fiamma < this.numFiammelle) {
			System.out.println("fiamma "+ fiamma + "accesa\n");
			fiamma++;
		}
	}
	
	//Overload
	public void accendi(int numFiammelle) {
		int fiamma = 1;
		while(fiamma < numFiammelle) {
			System.out.println("fiamma "+ fiamma + "accesa\n");
			fiamma++;
		}
	}
	
	public void spegni() {
		int fiamma = 1;
		while(fiamma < this.numFiammelle) {
			System.out.println("fiamma "+ fiamma + "spenta\n");
			fiamma++;
		}
		
		this.carburante = 0;
	}
	
}
