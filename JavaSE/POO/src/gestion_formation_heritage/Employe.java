package gestion_formation_heritage;

public class Employe {

	// Propriétés d'un employé
	private int id;
	private String nom;
	private String prenom;

	// Constructeur Employe
	public Employe(String pNom, String pPrenom, int pId){
		nom = pNom;
		prenom = pPrenom;
		id = pId;		
	}

	// Getters et Setters
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * L'employe demande une formation
	 */

	public void demanderFormation(String theme) {
		// sortie console pour le moment
		System.out.println("L'employ� " + this.prenom + " " + this.nom + " demande une formation Objis sur " + theme);
	}

	/** 
	 * Méthode toString() permet d'avoir l'état d'un objet dès lors qu'on affiche référence
	 * System.out.println (monObjet);
	 */
	@Override
	public String toString() {
		return "Employe [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}

	

}
