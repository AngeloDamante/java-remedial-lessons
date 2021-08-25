package oop;

public class Fiammella {
	
	private boolean statoFiammella;
	
	public Fiammella() {
		this.statoFiammella = false;
	}
	
	public void on() {
		this.statoFiammella = true;
		System.out.println("accesa");
	}
	
	public void off() {
		if (this.statoFiammella == true) {
			this.statoFiammella = false;
			System.out.println("spenta");
		}
	}
}
