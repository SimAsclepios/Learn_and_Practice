package gestion_formation_heritage;

public class Manager extends Employe {

	/**
	 * Constructeur du Manager, créé à partir du constructeur d'Employé
	 * 
	 * @param pNom
	 * @param pPrenom
	 * @param pId
	 */
	public Manager(String pNom, String pPrenom, int pId) {
		super(pNom, pPrenom, pId);
	}

	/**
	 * Le manager peut valider les demandes de formation de ses employés
	 */
	public void validerFormation() {
		// sortie console . Ici plus possible d'utiliser this.nom !!
		System.out.println("Le manager " + getPrenom() + " " + getNom()
				+ " valide les demandes de formation de ses employes.");

	}

}
