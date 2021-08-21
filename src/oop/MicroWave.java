package oop;

public class MicroWave extends Oven {
	
	private float ondaHz;
	private int modalità;
	
	public MicroWave(String nome, Resistor r, float ondaHz) {
		super(nome, r);
		this.ondaHz = ondaHz;
		this.modalità = 0;
	}
	
	@Override
	public void accendi(int initTemperature) {
		/* cambia */
	}
	
	//overload
	public void accendi(float x) {
		/* fagli fare qualcosa */
	}
}
