package exercices;

import java.util.Scanner;

public class SigneAstrologique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int jour, mois;
		System.out.println("Quel est votre jour de naissance?");
		jour = scanner.nextInt();
		System.out.println("Quel est votre mois de naissance?");
		mois = scanner.nextInt();

		if (jour > 31 || mois > 12)
			System.out.println("Date out of range");

		else if (jour >= 21 && mois == 1 || jour < 21 && mois == 2)
			System.out.println("Vous etes Verseau");

		else if (jour >= 21 && mois == 2 || jour < 21 && mois == 3)
			System.out.println("Vous etes Poisson");

		else if (jour >= 21 && mois == 3 || jour < 21 && mois == 4)
			System.out.println("Vous etes Belier");

		else if (jour >= 21 && mois == 4 || jour < 21 && mois == 5)
			System.out.println("Vous etes Taureau");

		else if (jour >= 21 && mois == 5 || jour < 21 && mois == 6)
			System.out.println("Vous etes Geamaux");

		else if (jour >= 21 && mois == 6 || jour < 21 && mois == 7)
			System.out.println("Vous etes Cancer");

		else if (jour >= 21 && mois == 7 || jour < 21 && mois == 8)
			System.out.println("Vous etes Lion");

		else if (jour >= 21 && mois == 8 || jour < 21 && mois == 9)
			System.out.println("Vous etes Vierge");

		else if (jour >= 21 && mois == 9 || jour < 21 && mois == 10)
			System.out.println("Vous etes Balance");

		else if (jour >= 21 && mois == 10 || jour < 21 && mois == 11)
			System.out.println("Vous etes Scorpion");

		else if (jour >= 21 && mois == 11 || jour < 21 && mois == 12)
			System.out.println("Vous etes Sagitaire");
		else
			System.out.println("Vous etes Capricorne");

		scanner.close();

	}

}
