package methode_recursive;

public class ListeChainee {

		String valeur;
		ListeChainee suivant;
		
		
		
		public ListeChainee(String valeur, ListeChainee suivant) {
			this.valeur = valeur;
			this.suivant = suivant;
		}

		public ListeChainee() {
			this.valeur = null;
			this.suivant = null;
		}
		
		public ListeChainee(int valeur2) {
			
		}

		public String getValeur() {
			return valeur;
		}

		public void setValeur(String valeur) {
			this.valeur = valeur;
		}

		public ListeChainee getSuivant() {
			return suivant;
		}

		public void setSuivant(ListeChainee suivant) {
			this.suivant = suivant;
		}

		public boolean isEmpty() {
			return (this.valeur == null && this.suivant == null);
		}
		
		@Override	//Annotation à faire avant chaque toString pour aider le compilateur à redéfinir la méthode et éviter les erreurs
		public String toString() {
			
			if (this.isEmpty()) return "()"; //terminaison
			else return "("+valeur+")->" + suivant.toString(); // incrément
		}
		
}