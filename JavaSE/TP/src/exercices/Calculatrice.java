package exercices;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {

		float nbre1 = 0.0f;
		float nbre2 = 0.0f;
		int choix = 0;
		Scanner saisie1 = new Scanner(System.in);

		System.out.print(" Voulez vous faire : 1:Addition ; 2:Soustraction ; 3:Multiplication ; 4:Division ");
		System.out.print(" Entrez votre choix entre 1, 2, 3 ou 4 : ");

		choix = saisie1.nextInt();

		System.out.print(" Entrez un nombre : ");
		nbre1 = saisie1.nextFloat();

		System.out.print(" Entrez un second nombre : ");
		nbre2 = saisie1.nextFloat();

		float addition = (nbre1 + nbre2);
		float soustraction = (nbre1 - nbre2);
		float multiplication = (nbre1 * nbre2);
		float division = (nbre1 / nbre2);

		switch (choix) {
		case 1:
			System.out.print("Le résultat de l'addition est : ");
			System.out.print(nbre1 + " + " + nbre2 + " = " + addition);
			break;
		case 2:
			System.out.print("Le résultat de la soustraction est : ");
			System.out.print(nbre1 + " - " + nbre2 + " = " + soustraction);
			break;
		case 3:
			System.out.print("Le résultat de la multiplication est : ");
			System.out.print(nbre1 + " * " + nbre2 + " = " + multiplication);
			break;
		case 4:
			System.out.print("Le résultat de la division est : ");
			System.out.print(nbre1 + " / " + nbre2 + " = " + division);
			break;
		}

		saisie1.close();
	}
}