package boutique_amazon;

public class Acheteur {
	
			//TODO 1) Propriétés de Acheteur :
	private String prenom;
	private String nom;
	private String ville;
	private int age;
	
			//TODO 2) Constructeur Acheteur :
	public Acheteur(String prenom, String nom, String ville, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.ville = ville;
		this.age = age;
	}


			//TODO 3) Getter et Setter :
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
		
		//TODO 4) Méthode classe Métier "Acheteur"
	public void connexion() {
		System.out.println("Vous êtes connecté sur le compte de : " + this.prenom + " " + this.nom + " de " + this.ville);
	}


		//TODO 5) Méthode toString : Pour connaitre l'état à un instant t de l'objet
	public String toString() {
		return "Acheteur [prenom=" + prenom + ", nom=" + nom + ", ville=" + ville + ", age=" + age + "]";
		
		// Permet de faire System.out.println(acheteur1) pour affiche les états/paramètres de l'objet.
		// Si la méthodo toString n'est pas créée, affiche l'adresse de l'objet à la place.
	}
	
}
