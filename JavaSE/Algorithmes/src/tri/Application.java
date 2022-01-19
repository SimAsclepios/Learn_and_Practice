package tri;

import java.util.Arrays;
import java.util.List;

public class Application {

	  public static void main(String[] args) {

	        // On crée une liste des instances possibles des algorithmes
	        // Remarque : l'utilisation des interfaces pour la liste et 
	        // pour les algorithmes permet de "générifier"
	        //  c'est-à-dire de rendre générique un traitement 
	        List<AlgorithmeDeTri> algorithmesDisponibles = Arrays.asList(
	                new TriSelection(), 
	                new TriInsertion(),
	                new TriBulles(),
	                new TriFusion());

	        // Test de tous les algorithmes
	        algorithmesDisponibles.forEach(algorithme -> {

	            // Ensemble de données à trier
	            int arr[] = { 1, 2, 3, -3, -5, 15, 18, -32, 0, 19, -5, -10, 2 };

	            System.out.println("---Avant le tri selon l'algorithme : " 
	                    + algorithme.getClass().getSimpleName() + " ---");

	            afficherElements(arr);

	            algorithme.trier(arr);

	            System.out.println("---Après le tri ---");
	            afficherElements(arr);
	            System.out.println();
	        });

	    }

	    static void afficherElements(int[] tab) {
	        for (int i = 0; i < tab.length; i++) {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	    }
}
