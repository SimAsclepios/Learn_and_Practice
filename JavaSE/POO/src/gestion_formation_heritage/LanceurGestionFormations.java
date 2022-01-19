package gestion_formation_heritage;


public class LanceurGestionFormations {

	 // Classe principale = point d'entrée de l'application = classe possédant méthode main()

	public static void main(String[] args) {

		// 1) Déclaration 
		Manager manager1 ;

		// 2) Instanciation 	
		manager1 = new Manager("nom", "prenom", 0);

		// 3) Utilisation (Les employés et le manager demandent une formation)
		manager1.setId(3);
		manager1.setNom("Fall");
		manager1.setPrenom("Ousmane");

		System.out.println(manager1); // cette ligne de code déclenche l'exécution de toString()

	}
}
