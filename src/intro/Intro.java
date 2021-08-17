package intro;

import intro.Automobile;

public class Intro {

	public static void main(String[] args) {
		/* Creo un oggetto automobile */
		Automobile fordAnglia = new Automobile("Ford Anglia");

		/* Lo gestisco */
		fordAnglia.accendi();
		fordAnglia.avanti(5);

		/* Visualizzo lo stato */
		System.out.print(fordAnglia.visualizza());

	}

}
