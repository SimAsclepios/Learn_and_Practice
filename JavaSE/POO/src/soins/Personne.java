package soins;

public class Personne {

	private String nom, prenom, ville;
	int age, numSecu;
	
		
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

	public int getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(int numSecu) {
		this.numSecu = numSecu;
	}


	public Personne(String nom, String prenom, String ville, int age, int numSecu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.age = age;
		this.numSecu = numSecu;
	}
	
	
	
	
}
