package soins;

import java.util.ArrayList;


public class Medecin extends Personne {

private ArrayList<Patient> listePatient = new ArrayList <Patient>();


	public Medecin(String nom, String prenom, String ville, int age, int numSecu) {
		super(nom, prenom, ville, age, numSecu); 
	}

	
	public void ajoutPatient(Patient patient) {
		
		listePatient.add(patient);
	}
	
	
	public void voirListePatient() {

		for (Patient p : listePatient) {
			System.out.println(p.toString());
		}
		
		
	}
	
}
