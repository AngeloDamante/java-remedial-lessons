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
		
		mioForno.spegni();
		
		mioForno.apriCoperchio();
		mioForno.accendi(5);
		System.out.println(mioForno.visualizza());
		
		mioForno.chiudiCoperchio();
		mioForno.accendi(5);
		System.out.println(mioForno.visualizza());
		
	}

	public static int sum(int a, int b) {
		return (a + b);
	}
	
	public static void introJava() {
		/* variabili di tipi primitivi (int, float,...) */
		int nome = 3;
		
		/* oggetti - variabili di tipo classe */
		Resistor r = new Resistor(150, "classic");
		Oven fornoFoo = new Oven("aasddf", r);
		
		/* array - primitivi */
		int[] x = {1, 2, 3, 4, 5};
		System.out.println(x[2]); // -> 3
		
		int[] y = new int[10]; // array vuoto
		
		// riempe array y
		int i = 0;
		while(i < 10) {
			y[i] = i++;
		}
		
		/* array - oggetti */
		Oven[] forni = new Oven[10];
		Resistor rn = new Resistor(100, "boh");
		
		i = 0;
		while(i < 10) {
			forni[i] = new Oven("forno" + i, rn);
			i++;
		}
		
		/* valori di ritorno */
		int num1 = 10;
		int num2 = 20;
		int somma = sum(num1, num2);
	}
	
	
	public static void main(String[] args) {
		// esempioAutomobile();
		// esempioOven();
		// introJava();
		
	}

}
