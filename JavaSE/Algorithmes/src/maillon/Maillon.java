package maillon;

public class Maillon<E extends Comparable<E>> {
	private E valeur;
	private Maillon<E> suivant;
	
	public Maillon(E valeur) {
		this.valeur = valeur;
		this.suivant = null;
	}
	
	public Maillon(E valeur, Maillon<E> suivant) {
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

	public Maillon<E> getSuivant() {
		return suivant;
	}

	public void setSuivant(Maillon<E> suivant) {
		this.suivant = suivant;
	} 	
	
	@Override
	public String toString() {
		if (this.isLast()) return "("+ valeur +")";//terminaison
		else
		return "("+valeur+")->" + suivant.toString(); //incr�ment + appel de la m�me fonction
	}
	
	public Maillon<E> insererOrdre(E valeur) {

		if (this.valeur.compareTo(valeur)>0) //terminaison 1
		{
            //On teste si la valeur de la cellule courante est supérieure ou égale à la valeur à ajouter
            //Si oui, c'est ici qu'il faut l'insérer
            //Je créé une nouvelle cellule que je "colle" devant la cellule courante (this)
            //je retourne cette nouvelle cellule
			return new Maillon<E>(valeur,this);
        }
		else
		if (this.isLast())//Terminaison 2
         {
            //On teste si on est au bout de la liste (suivant est vide)
		    //Donc la valeur à insérer est la plus grande
		    //Je créé une nouvelle cellule que j'ajoute au suivant du dernier �l�ment de ma liste
             this.suivant = new Maillon<E>(valeur);
			return this;
		} 
		else {
            //Sinon cela veut dire que ce n'est pas à moi d'ajouter cette valeur, je demande donc au maillon suivant de le faire
            //et je le remplace par le résultat
            //Une fois que c'est fait, je me retourne moi-même
		    this.suivant = suivant.insererOrdre(valeur);
		    return this;	
		}
	}
	
	public Maillon<E> supprimerValeur(E valeur) {
		
		if (this.valeur.compareTo(valeur)==0)//Terminaison 1
        {   
            //Je teste si je suis la valeur à supprimer, si c'est moi je retourne le maillon suivant, me retirant ainsi de la chaîne.
            return this.suivant; 
        }
		else if (this.isLast())
        {
            //Je teste si je suis le dernier maillon(je sais déjà que je ne suis pas la valeur à supprimer)
            return this;
        }
		else 
        {
            //Je ne suis pas le maillon à supprimer ni le dernier maillon, je demade donc au maillon suivant de le faire 
            //et je le remplace par le résultat qu'il me renvoie
            this.suivant = this.suivant.supprimerValeur(valeur);
			return this;
        }
		
	}
    
    //**********************************************************************//
    //***************Correction des exercices supplémentaires***************//
    //**********************************************************************//

    // exercice 1 : comptage

    public int comptage(){
        if(this.isLast()) //Terminaison si je suis le dernier
            return 1;
        else //Appel récursif sinon
            return 1 + this.suivant.comptage();
    }

    // exercice 2 : comptage d'occurences
    // c'est sensiblement la même fonction que la précédente, excepté que on ne compte que si on possède une valeur égale à celle passée en paramêtre.

    public int comptage_occurences(E valeur){
        if (this.valeur.compareTo(valeur)==0){
            if(this.isLast()) //Terminaison si je suis le dernier
                return 1;
            else //Appel récursif sinon
                return 1 + this.suivant.comptage_occurences(valeur);
        }
        else
        {
            if(this.isLast()) //Terminaison si je suis le dernier
                return 0;
            else //Appel récursif sinon
                return this.suivant.comptage_occurences(valeur);
        
        }
    }

    // exercice 3 : vérification triage

    public boolean verif_triage(){
        if(this.isLast()) //Terminaison si je suis le dernier (si on est arrivés au dernier c'est que la liste est bien triée)
            return true;
        if(this.valeur.compareTo(this.suivant.getValeur())>0) // terminaison si mon suivant est plus petit que moi et retour de false
            return false;
        else //Appel récursif sinon
            return this.suivant.verif_triage();
    }
   
    // exercice 4 : Insertion Tête

    public Maillon<E> insertion_tete(E valeur){
        return new Maillon<E>(valeur, this);
    }

    // exercice 5 : Insertion Queue

    public Maillon<E> insertion_queue(E valeur){
        if (this.isLast()) // Terminaison si on est dans le dernier maillon
        {
            this.suivant = new Maillon<E>(valeur);
            return this;
        }
        else //Sinon appel récursif je demande au suivant de le faire
        {
            this.suivant = suivant.insertion_queue(valeur);
            return this;
        }
    }

    // exercice 6 : Insertion Positionnée

    public Maillon<E> insertion_pos(E valeur, int pos){
        if (this.isLast()) //Terminaison 1 : on est au bout de la liste
        {
            this.suivant = new Maillon<E>(valeur);
            return this;
        }
        else if (pos == 1)//arrivé à la bonne position
        {
            return this.insertion_tete(valeur); 
        }
        else // Sinon appel récursif avec -1 pour la position
        {
            this.suivant = suivant.insertion_pos(valeur, pos-1);
            return this;
        }
    }
    // exercice 7 : Supression Positionnée

    public Maillon<E> suppression_pos(int pos){
        if (pos == 1)//Terminaison 1 : arrivé à la bonne position, on retourne le suivant
        {
            return this.suivant; 
        }
        else if (this.isLast()) //Terminaison 2 : on est au bout de la liste
        {
            return this;
        }
        else // Sinon appel récursif avec -1 pour la position
        {
            this.suivant = suivant.suppression_pos(pos-1);
            return this;
        }
    }

}