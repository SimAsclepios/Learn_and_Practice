package liste_chainee;

public class ListeChainee3<E extends Comparable<E>> {
		private E valeur;
		private ListeChainee3<E> suivant;
		
		public ListeChainee3(E valeur) {
			this.valeur = valeur;
			this.suivant = null;
		}
		
		public ListeChainee3(E valeur, ListeChainee3<E> suivant) {
			this.valeur=valeur;
			this.suivant=suivant;
		}
		
		public boolean isLast() {
			return this.suivant==null;
		}
		
		public E getValeur() {
			return valeur;
		}
		public void setValeur(E valeur) {
			this.valeur = valeur;
		}
		public ListeChainee3<E> getSuivant() {
			return suivant;
		}
		public void setSuivant(ListeChainee3<E> suivant) {
			this.suivant = suivant;
		} 	
		
		@Override
		public String toString() {
			if (this.isLast()) return "("+ valeur +")";//terminaison
			else
			return "("+valeur+")->" + suivant.toString(); //incrément + appel de la même fonction
		}
		
		public ListeChainee3<E> insererOrdre(E valeur) {
			//On teste si la valeur de la cellule courante est supérieure ou égale à la valeur à ajouter
			//si oui, c'est ici qu'il faut l'insérer
			System.out.println(this.valeur+".compareTo("+valeur+") = "+ this.valeur.compareTo(valeur));
			if (this.valeur.compareTo(valeur)>0)
			//Je créé une nouvelle cellule que je "colle" devant la cellule courante (this)
			//je retourne cette nouvelle cellule
			{System.out.println("maillon de valeur inférieure, on ajoute un nouveau maillon avant celui ci\n");
				return new ListeChainee3<E>(valeur,this);}//terminaison
			//On teste si on est au bout de la liste (suivant est vide)
			//Donc le nombre à insérer est le plus grand
			//Je créé une nouvelle cellule que j'ajoute au suivant du dernier élément de ma liste
			else
			if (this.isLast()) {this.suivant = new ListeChainee3<E>(valeur);//Terminaison
			System.out.println("Dernier maillon, on ajoute à la fin\n");
				return this;
			}
			else {
			this.suivant = suivant.insererOrdre(valeur);
			
			return this;	
			}
		}
		
		public ListeChainee3<E> supprimerValeur(E valeur) {
			
			if (this.valeur.compareTo(valeur)==0) return this.suivant;
			else if (this.isLast()) return this;
			else {this.suivant = this.suivant.supprimerValeur(valeur);
				return this;}
}
}