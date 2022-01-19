package soins;

public class Patient extends Personne {

	public Patient(String nom, String prenom, String ville, int age, int numSecu) {
		super(nom, prenom, ville, age, numSecu);
		// TODO Auto-generated constructor stub
	}

//	SET<patients> patients;
	
	@Override
	public String toString() {
		return getNom() + " " + getPrenom() + " " + getVille()
		+ " " + getAge() + " ans ,   numéro de sécurité sociale : " + getNumSecu(); //super.toString() + 
	}
		
	
	
}
