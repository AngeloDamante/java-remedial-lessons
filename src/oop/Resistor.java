package oop;

public class Resistor {
	/* attributes */
	private float ohm;
	private String type;
	private int usura;
	
	/* methods */
	public Resistor(float ohm, String type) {
		this.ohm = ohm;
		this.type = type;
		this.usura = 0; //nuova
	}
	
	public void attiva() {
		this.usura++;
	}
	
	public int getUsura() {
		return this.usura;
	}
	
	public void setOhm(float ohmValue) {
		this.ohm = ohmValue;
	}
	
	public float getOhm() {
		return ohm;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
