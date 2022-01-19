package soins;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Patient patient1 = new Patient("Bob", "Dupond", "Paris", 30, 123456);
		Patient patient2 = new Patient("Marc", "Dujardin", "Paris", 36, 213456);
		Patient patient3 = new Patient("Max", "Aretu", "Paris", 26, 323456);
		Patient patient4 = new Patient("Lea", "Huin", "Paris", 18, 456256);
		
		Medecin medecin1 = new Medecin("Sam", "Medi", "Paris", 40, 56534);
		
		Medecin medecin2 = new Medecin("Leo", "Midas", "Paris", 45, 654921);
		
		medecin1.ajoutPatient(patient1);
		medecin1.ajoutPatient(patient2);
		medecin1.ajoutPatient(patient3);
		medecin2.ajoutPatient(patient3);
		medecin2.ajoutPatient(patient4);
		
		System.out.println("------------------liste patient medecin 1-------------------");
		
		medecin1.voirListePatient();
		
		System.out.println();
		System.out.println("-------------------liste medecin 2-----------------------");
		
		medecin2.voirListePatient();
		
	}

}
