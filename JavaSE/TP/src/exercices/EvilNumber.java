package exercices;

import java.util.Scanner;

public class EvilNumber {

	public static void main(String[] args) {

		System.out.println(" Entrez un nombre : " + "\n");
		Scanner saisie1 = new Scanner(System.in);
		int nbre1 = saisie1.nextInt();

		String nbre1Binaire = Integer.toBinaryString(nbre1);
		System.out.println(" Binaire = " + nbre1Binaire);

		int longBin = nbre1Binaire.length();
		System.out.println("Taille = " + longBin);

		int compteur = 0;
		char ch1 = '1';
		System.out.println("ch1 = " + ch1);

		for (int i = 0; i < longBin; i++) {
			System.out.println(nbre1Binaire.charAt(i));
			System.out.println(nbre1Binaire.charAt(i) == ch1);
			if (nbre1Binaire.charAt(i) == '1') {
				compteur++;
			}
		}

		if (compteur % 2 == 0) {
			System.out.println("C'est un EvilNumber");
		} else {
			System.out.println("Ce n'est pas un EvilNumber");
		}

		saisie1.close();

	}

}
