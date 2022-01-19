package interfaces;

public class Basketball implements ListeActions {

	@Override
	public void passe(String nomJoueur) {
		System.out.println(nomJoueur + " passe la balle de basket à un autre joueur");
	}
	
	public void passe(String nomJoueur, String joueur2) {
		System.out.println(nomJoueur + " passe la balle de basket à " + joueur2);	
	}

	@Override
	public void tir(String nomJoueur) {
		System.out.println(nomJoueur + " tire un panier");
		
	}
	
}
