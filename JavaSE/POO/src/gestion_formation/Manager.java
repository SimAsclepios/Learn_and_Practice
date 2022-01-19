package gestion_formation;


public class Manager   {

	// Propriétés d'un manager
	private int id;
	private String nom;
	private String prenom;

	// Constructeur Employe
	public Manager(String pNom, String pPrenom, int pId){
		nom = pNom;
		prenom = pPrenom;
		id = pId;
	}
	
	// Getters et Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Le manager aussi peut demander une formation
	 */
	public void demanderFormation(String theme) {
		// sortie console pour le moment
		System.out.println("Le manager " + this.prenom + " " + this.nom + " demande une formation Objis sur " + theme);
	}

	/**
	 * Le manager peut valider les demandes de formation de ses employés
	 */
	public void validerFormation() {
		// sortie console
		System.out.println("Le manager " + this.prenom + " " + this.nom + " valide les demandes de formation de ses employes.");

	}

	
}
