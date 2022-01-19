package basique;

import java.util.Scanner;

public class GestionRHv1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenue dans mon application de Gestion des Ressources Humaines \n");

		System.out.println("Depuis combien d'année(s) êtes vous dans l'entreprise ? \n");

		Scanner scanner = new Scanner(System.in);
		int anciennete = scanner.nextInt();

		int salaire = 30000 + 2000 * anciennete;

		System.out.println("Votre salaire annuel est de : " + salaire + " euros");

		scanner.close();
	}

}
