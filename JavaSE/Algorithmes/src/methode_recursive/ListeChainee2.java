package methode_recursive;

public class ListeChainee2 {
	private int valeur;
	private ListeChainee2 suivant;
	
	public ListeChainee2(int valeur) {
		this.valeur = valeur;
		this.suivant = null;
	}
	
	public ListeChainee2(int valeur, ListeChainee2 suivant) {
		this.valeur=valeur;
		this.suivant=suivant;
	}
	
	public boolean isEmpty() {
		return this.suivant==null;
	}
	
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public ListeChainee2 getSuivant() {
		return suivant;
	}
	public void setSuivant(ListeChainee2 suivant) {
		this.suivant = suivant;
	} 	
	
	@Override
	public String toString() {
		if (this.isEmpty()) return "("+ valeur +")";//terminaison
		else
		return "("+valeur+")->" + suivant.toString(); //incrément + appel de la même fonction
	}
	
	public ListeChainee2 insererOrdre(int valeur) {
		//On teste si on est au bout de la liste (suivant est vide)
		//Donc le nombre à insérer est le plus grand
		//Je créé une nouvelle cellule que j'ajoute au suivant du dernier élément de ma liste
		if (this.isEmpty()) {this.suivant = new ListeChainee2(valeur);//Terminaison
						return this;
		} else
		//On teste si la valeur de la cellule courante est supérieure ou égale à la valeur à ajouter
		//si oui, c'est ici qu'il faut l'insérer
			if (valeur<=this.valeur)
				//Je créé une nouvelle cellule que je "colle" devant la cellule courante (this)
				//je retourne cette nouvelle cellule
			{return new ListeChainee2(valeur,this);}//terminaison
			else
		this.suivant = suivant.insererOrdre(valeur);
		
		return this;	
	}
	/*
	public ListeChainee2 supprimerValeur(int valeur) {
		if (this.isEmpty()) return this; else //on est à la fin de la liste, rien à supprimer
		if (this.valeur == valeur) return this.suivant;  //Je me supprime et retourne la cellule suivante
		else {this.suivant = this.suivant.supprimerValeur(valeur); //Je ne me supprime pas et demande à l'éméent suivante de faire le travail
			return this;}
		*/
public ListeChainee2 supprimerValeur(int valeur) {
		
		if (this.valeur == valeur) return this.suivant; else
		if (this.isEmpty()) return this;
		else {this.suivant = this.suivant.supprimerValeur(valeur);
			return this;}
		
		
	}
		
	
}