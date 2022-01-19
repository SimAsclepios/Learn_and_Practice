package gestion_formation;

import java.util.Scanner;
/*
import domaine.DemandeFormation;
import domaine.Employe;
import domaine.Manager;
*/
public class LanceurGestionFormations {

	
	 // Classe principale = point d'entrée de l'application = classe possédant méthode main()

	public static void main(String[] args) {

		// 1) Déclaration 
		Employe employe1 ;
		Employe employe2 ;
		Manager manager1 ;
		DemandeFormation demandeFormation1 ;  

		// 2) Instanciation 	
		Scanner scanner = new Scanner(System.in);
		demandeFormation1 = new DemandeFormation("Initiation JAVA", "18/04/2016", "sdfsdf", "sdfdf", "ATTENTE");
		System.out.println(demandeFormation1);
		
		
		System.out.println("Saisissez le Nom et le Prénom du premier employé");
		employe1 = new Employe(scanner.next(),scanner.next(), 1);
		System.out.println("Saisissez le Nom et le Prénom du second employé");
		employe2 = new Employe(scanner.next(),scanner.next(), 2);
		System.out.println("Saisissez le Nom et le Prénom du manager");
		manager1 = new Manager(scanner.next(),scanner.next(), 3);

		
		// Possibilités d'utiliser la console pour le passage d'arguments (args) ci dessous :
//		demandeFormation1 = new DemandeFormation("Initiation JAVA", "18/04/2016", args[1], args[2], "ATTENTE");

		
// --- 3) Utilisation (Les employés et le manager demandent une formation) ---

		//		employe1.demanderFormation(args[0]);
//		System.out.println("La formation débute le " + args[1] + " et termine le " + args[2] + "\n");
		
		employe2.demanderFormation("Hibernate");
		manager1.demanderFormation("Tomcat");
		
		employe1.setPrenom("Pierre");

		// Le manager valide les demandes de formation de ses employ�s
		manager1.validerFormation();
		
//	System.out.println(demandeFormation1);
	
	scanner.close();
	}
}
