package oop;

import oop.Oven;
import oop.Resistor;
import oop.CampOven;
import oop.Fiammella;

public class Main {
	
	public static void esempioCampOven() {
		Resistor r = new Resistor(100, "classic");
		
		/* polimorfia */
		Oven co = new CampOven("samsung", r, 5); //SI
		// CampOven co1 = new Oven("ghdghd", r); NO
		
		co.accendi();
		co.spegni();
		
	}

	public static void main(String[] args) {
		esempioCampOven();
	}

}
