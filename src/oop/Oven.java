package oop;

import oop.Resistor;

public class Oven {
	/* attributes */
	private String nome;
	private String stato;
	private int temperatura;
	private int coperchio; // 0 - chiuso; 1 - aperto 
	private Resistor resistenza; // aggregazione (uso)
	
	/* methods */
	public Oven(String nome, Resistor r) {
		this.nome = nome;
		this.stato = "OFF";
		this.temperatura = 0;
		this.resistenza = r;
		this.coperchio = 0; // chiuso
	}
	
	public void accendi(int initTemperature) {
		if(this.coperchio == 0) {
			this.stato = "ON";
			this.temperatura = initTemperature;
			this.resistenza.attiva();
		}
		else {
			this.stato = "OFF";
			System.out.println("il coperchio non è chiuso");
		}
	}
	
	//overload
	public void accendi() {
		if(this.coperchio == 0) {
			this.stato = "ON";
			this.temperatura = 0;
			this.resistenza.attiva();
		}
		else {
			this.stato = "OFF";
			System.out.println("il coperchio non è chiuso");
		}
	}
	
	//overload
	public void accendi(int initTemperature, int coperchio) {
		this.coperchio = coperchio;
		if(this.coperchio == 0) {
			this.stato = "ON";
			this.temperatura = initTemperature;
			this.resistenza.attiva();
		}
		else {
			this.stato = "OFF";
			System.out.println("il coperchio non è chiuso");
		}
	}
	
	public void apriCoperchio() {
		this.coperchio = 1;
	}
	
	public void chiudiCoperchio() {
		this.coperchio = 0;
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
