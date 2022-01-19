package exercices;

import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String resultat;

		Scanner saisieJ1 = new Scanner(System.in);
		System.out.println("Joueur 1 : Choisissez entre Pierre, Feuille et Ciseaux ");
		String chJ1 = saisieJ1.next();

		Scanner saisieJ2 = new Scanner(System.in);
		System.out.println("Joueur 2 : Choisissez entre Pierre, Feuille et Ciseaux ");
		String chJ2 = saisieJ2.next();

		saisieJ2.close();
		saisieJ1.close();

		resultat = chJ1 + " " + chJ2;
		System.out.println(chJ1 + " " + chJ2);

		if (chJ1.equals(chJ2)) {
			System.out.println("égalité");
		} 
		else if (resultat.equals("Pierre Ciseaux") || resultat.equals("Ciseaux Feuille") || resultat.equals("Feuille Pierre")) {
			System.out.println("Le Joueur 1 a gagné");
		} 
		else {
			System.out.println("Le Joueur 2 a gagné");
		}

	}

}
