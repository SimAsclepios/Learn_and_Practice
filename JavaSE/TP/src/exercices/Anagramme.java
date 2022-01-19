package exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramme {

	public static void main(String[] args) {

		System.out.println("***** Début exercice 3 : Anagrammes ***********");
		System.out.println();

		System.out.println(" Entrez le 1er mot : \n");
		Scanner saisie1 = new Scanner(System.in);
		String mot1 = saisie1.nextLine();

		System.out.println(" Entrez le 2eme mot : \n");
		Scanner saisie2 = new Scanner(System.in);
		String mot2 = saisie2.nextLine();

		mot1 = mot1.toLowerCase();
		mot2 = mot2.toLowerCase();

		char[] tabmot1 = mot1.toCharArray();
		Arrays.sort(tabmot1);
		String newmot1 = String.valueOf(tabmot1);

		char[] tabmot2 = mot2.toCharArray();
		Arrays.sort(tabmot2);
		String newmot2 = String.valueOf(tabmot2);

		if (newmot1.equals(newmot2)) {
			System.out.println("Ce sont des anagrammes");
		} else {
			System.out.println("Ce ne sont pas des anagrammes");
		}

		saisie1.close();
		saisie2.close();
	}

}
