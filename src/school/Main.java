package school;

import school.Aula;
import school.Studente;
import school.Verifica;

public class Main {

	public static void introArray() {
		/* vettore dinamico */
		int x = 90; // può cambiare
		int[] A; // vettore di interi dichiarato
		A = new int[x]; // vettore di interi definito
		
		/* vettore statico */
		int[] B = {1, 2, 3, 4, 5}; // dichiaro e definisco
		
		/* vettore dinamico di tipo non primitivo */
		Aula[] scuola = new Aula[10];
		
		/* creo oggetto da classe */
		Studente[] studenti = new Studente[20];
		for(int i = 0; i < studenti.length; i++) {
			studenti[i] = new Studente("alunno"+i, 18);
		}
		
		Aula aula1 = new Aula("4A", studenti);
		Aula aula2 = new Aula("5A", studenti, 30);
		System.out.println(aula2.getNumBanchi());
		
		aula2.setNumBanchi(70);
		System.out.println(aula2.getNumBanchi());
		
		
	} 
	
	public static void useCase1() {
		/*
		 * creare l'aula 5A con un gruppo di 20 studenti e calcolare 
		 * il voto finale 3 studenti
		 */
		
		Studente[] studenti = new Studente[20];
		for(int i = 0; i < studenti.length; i++) {
			studenti[i] = new Studente("alunno"+i, 18);
		}
		
		Aula aula = new Aula("5A", studenti);
		
		Verifica v1 = new VerificaMatematica("derivate", 8);
		Verifica v2 = new VerificaMatematica("integrali", 8);
		Verifica v3 = new VerificaMatematica("curve", 8);
		
		studenti[2].aggiungiVerifica(v1);
		studenti[2].aggiungiVerifica(v2);
		studenti[2].aggiungiVerifica(v3);
		
		studenti[2].calcolaVotoFinale();
		System.out.println(studenti[2].getVotoFinale());
	}
	
	public static void main(String[] args) {
		// introArray();
		// useCase1();
	}
}