package gestion_formation;

public class Employe {

	// Propriétés d'un employé
	private int id;
	private String nom;
	private String prenom;

	// Constructeur Employe
	public Employe(String pNom, String pPrenom, int pId) {
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

	public void setNom(String pNom) {
		this.nom = pNom;
	}

	public void setPrenom(String pPrenom) {
		this.prenom = pPrenom;
	}

	/**
	 * L'employe demande une formation
	 */

	public void demanderFormation(String theme) {
		// sortie console pour le moment
		System.out.println("L'employ� " + this.prenom + " " + this.nom + " demande une formation Objis sur " + theme);
	}


}
