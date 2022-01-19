package boutique_amazon;

public class Produit {
	
			//TODO 1) Propriétés de Produit :
	private String nom;
	private int quantite;
	private int prix;
	
			//TODO 2) Constructeur Produit :
	public Produit(String nom, int quantite, int prix) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
	}
	
			//TODO 3) Getter et Setter :
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	//TODO Méthode classe métier "Produit"
	public void ajout() {
		System.out.println("Ajout de du produit : " + nom + "     Quantité : " + quantite);
	}

}
