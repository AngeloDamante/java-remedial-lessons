package intro;

import intro.Automobile;
import intro.Oven;
import intro.Resistor;

public class Intro {
	
	public static void esempioAutomobile() {
		/* Creo un oggetto automobile */
		Automobile fordAnglia = new Automobile("Ford Anglia");

		/* Lo gestisco */
		fordAnglia.accendi();
		fordAnglia.avanti(5);

		/* Visualizzo lo stato */
		System.out.print(fordAnglia.visualizza());
	}
	
	public static void esempioOven() {
		/* Creare tre forni con 3 nomi,
		 * controllare l'usura del primo forno e se è da riparare
		 * usare la resistenza del secondo forno
		 * 
		 *  creare due metodi che aprano e chiudano il coperchio del forno
		 *  aggiungendo l'attributo relativo e modificare il metodo 
		 *  accendi affinchè si accendo se e solo se il coperchio è chiuso
		 *  */
	}

	public static void main(String[] args) {
		
		Resistor miaResistenza = new Resistor(1000, "classic");
		Oven mioForno = new Oven("samsungX", miaResistenza);
		
		int i = 0;
		while(i < 10) {
			mioForno.accendi(200);
			i++;
		}
		
		Resistor altraResistenza = new Resistor(1000, "classic");
		System.out.println(mioForno.ripara(altraResistenza));
		
		System.out.println(mioForno.visualizza());
		System.out.println(altraResistenza.getUsura());
	}

}
