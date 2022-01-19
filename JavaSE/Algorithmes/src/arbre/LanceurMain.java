package arbre;

public class LanceurMain<E> {

	// commande "find and replace" : pour remplacer un mot par un autre (voir sur google pour eclipse).
	
	public static void main(String[] args) {
			
				ArbreBinaire<String> monArbre = new ArbreBinaire<String>();
				Noeud<String> noeudBlanche = new Noeud<String>("Blanche");
				Noeud<String> noeudDavid = new Noeud<String>("David");
				Noeud<String> noeudCaro = new Noeud<String>("Caro",noeudBlanche,noeudDavid);	
				
				Noeud<String> noeudXavier = new Noeud<String>("Xavier", new Noeud<String>("Stefanie"), new Noeud<String>("Zorglub"));
				monArbre.racine = new Noeud<String>("John", noeudCaro, noeudXavier);
				//monArbre.affichagePrefixe();
				
				monArbre.afficherArbre();
				monArbre.supprimerValeur("John");
				monArbre.afficherArbre();
				
				monArbre.ajouterValeur("Arnold");
				monArbre.ajouterValeur("Tania");
				monArbre.ajouterValeur("Xavier");
				monArbre.afficherArbre();
			}
		}
