package interfaces;

public class Football implements ListeActions {

	@Override
	public void passe(String nomJoueur) {
		System.out.println(nomJoueur + " passe le ballon de foot à un autre joueur");
		
	}
	
	public void passe(String nomJoueur, String joueur2) {
		System.out.println(nomJoueur + " passe le ballon de foot à " + joueur2);
		
	}

	@Override
	public void tir(String nomJoueur) {
		System.out.println(nomJoueur + " tire au but");
	}
	
}
