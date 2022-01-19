package boutique_amazon;

//import boutique_amazon.Vendeur;
import java.util.Scanner;
//import boutique_amazon.Produit;
//import boutique_amazon.Acheteur;

public class LancerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
Vendeur vendeur1 = new Vendeur("Claude", "Dupond", "Paris", 44);

System.out.println("Bienvenue dans la Boutique en ligne");
		
		String repCompte = "oui";
		String repProduit = "oui";
		
			while (repProduit.equals("oui")) {
				
				if (repCompte.equals("oui")) {
				
		System.out.println("Entrez votre prénom, nom, ville et âge : ");
		Acheteur acheteur1 = new Acheteur(scan.next(), scan.next(), scan.next(), scan.nextInt() );scan.nextLine();
	//le nextLine après le nextInt sert à attraper le string "ans" après avoir donné son age, 
		//si il entre seulement un nombre ça marche quand même, le scanLine est ignoré. 
		
		acheteur1.connexion();
		repCompte = "non";
		
				}
					
				else { 
									
		System.out.println("Quel est le produit que vous souhaitez acheter ? ");
		Produit produit1 = new Produit(scan.next(), 0, 0);
		
		System.out.println("Quelle quantité ? ");
		produit1.setQuantite(scan.nextInt());
		scan.nextLine();	// à faire après un scannerInt, pour prendre le retour à la ligne
		
		produit1.ajout();
		
		
		vendeur1.achat();

		System.out.println(" ");
		System.out.println("Voulez vous commander un nouvel article ? (oui/non) : ");
		repProduit = scan.next().toLowerCase();
			
					if (repProduit.equals("non")) { 
						System.out.println("Deconnexion réussie \n A bientôt ");	
					}
					else {
		System.out.println(" ");
		System.out.println("Voulez vous changer de compte ? (oui/non) : ");
		repCompte =scan.next().toLowerCase();
		scan.reset();	// à faire sinon bug au 2e tour ..
					}
				}
			}

scan.close();
		
	}
}

/* Problème Scanner :
 
 Faire des scan.reset !

La méthode Scanner.nextInt ne consomme pas le caractère dernier newline de votre entrée, et donc newline est consommé dans le prochain appel à Scanner.nextLine.
Vous rencontrerez le même comportement lorsque vous utilisez Scanner.nextLine après Scanner.next() ou toute méthode Scanner.nextFoo (sauf nextLine elle-même).

Solutions :
- Soit lancer à blanc Scanner.nextLine appelé après Scanner.nextInt ou Scanner.nextFoo pour consommer le reste de cette ligne.
- Ou, ce serait encore mieux, si vous lisez l'entrée Scanner.nextLine et de convertir votre entrée pour le format approprié vous avez besoin. 
Par exemples, à un entier en utilisant Integer.parseInt(String) la méthode.
*/