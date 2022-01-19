package boutique_amazon;

public class Vendeur extends Acheteur {

			// TODO Constructeur
	public Vendeur(String prenom, String nom, String ville, int age) {
		super(prenom, nom, ville, age);
	}
			
			//TODO Méthode classe métier "Vendeur"
	public void achat() {
System.out.println("\nVotre demande a été envoyé au vendeur : " + getPrenom() + " " + getNom() + " de " + getVille()
					+ "\n Vous aurez un retour sous 48h ");
	}
		
}


