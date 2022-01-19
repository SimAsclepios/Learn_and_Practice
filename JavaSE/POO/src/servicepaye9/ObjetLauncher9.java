package servicepaye9;

import java.util.Scanner;

public class ObjetLauncher9 {								

	public static void main (String arg[]) {
		System.out.println ("Bienvenue dans mon application de gestion ressources humaines\n");
		
		String employe1 = "Yves" ;                   
		String employe2 = "Jean";
		String employe3 = "Pierre";
		String employe4 = "Bob";
		String employe5 = "Jo'";
		String employe6;
		 int salaire5;  int anciennete6;
		// TODO int salaire1; int salaire2; int salaire3; int salaire4; int salaire6;
		//les 6 declarations du haut sont inutiles (voir en bas) :
				// on peut executer les methode directement sans les affecter à ds variables
		
		ObjetDomaine9 servicePaye = new ObjetDomaine9();			// Instanciation classe = création objet mémoire
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Quel est votre prénom ?");
		employe6 = scanner.next();
		
		System.out.println("\nDepuis combien d'année(s) êtes vous dans l'entreprise ? ");
		anciennete6 = scanner.nextInt();
		
		//salaire6 = ServicePaye9.calculerSalaireC(employe6, anciennete6);
		ObjetDomaine9.calculerSalaireC(employe6, anciennete6);
		
		System.out.println("\n Voulez vous voir aussi les salaires de vos collègues ? ");
		String rep1 = scanner2.next().toLowerCase();
		
		if (rep1.equals("oui")) {
		
			System.out.println("\n Entrez le mot de passe pour acceder aux données des ressources humaines : ");
			String mdpDRH = scanner2.next();

			/*
			while (!boolMdp) {  
				System.out.println("Mot de passe erroné"); 
				System.out.println("\n Entrez à nouveau le mot de passe : ");
				mdpDRH = scanner2.next();
			boolean boolMdp = mdpDRH.equals("admin");	
			}
		*/	
				if (mdpDRH.equals("admin")) {
			
					/*
			 * TODO suite variables inutiles
					salaire1 = servicePaye.calculerSalaireA (employe1);  	// Utilisation du savoir-faire de l'objet
					salaire2 = servicePaye.calculerSalaireB (employe2, 5000);		
					salaire3 = servicePaye.calculerSalaireB (employe3, 0);	
					salaire4 = ServicePaye9.calculerSalaireC (employe4, 30);
			*/
					servicePaye.calculerSalaireA (employe1); 
					servicePaye.calculerSalaireB (employe2, 5000);
					servicePaye.calculerSalaireB (employe3, 0);
					ObjetDomaine9.calculerSalaireC (employe4, 30);
					
					
					salaire5 = servicePaye.calculerSalaireD(employe5,  1) + servicePaye.calculerPrime(employe5);
					System.out.println(employe5 + " a un salaire de " + salaire5 + "\n");
				
				  }
		
			}
			
		scanner.close();
		scanner2.close();
		}
}