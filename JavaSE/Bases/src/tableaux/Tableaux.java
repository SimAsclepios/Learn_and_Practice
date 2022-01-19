package tableaux;
import java.util.Arrays;


public class Tableaux {

	public static void main(String[] args) {
		
	System.out.println("***** Début exercice 1 ***********");
    System.out.println();

    // Déclaration du tableau
        char[] caracteres;

        // Initialisation du tableau : 5 éléments
        // Il faut garder à l'esprit 
        // que les positions commencent à 0 
        // donc dans un tableau de 5 éléments les index vont de 0 à 4
        // voir code ci-dessous
        caracteres = new char[5];

        // Remplissage du tableau (affectation)
        caracteres[0] = 'a';
        caracteres[1] = 'b';
        caracteres[2] = 'c';
        caracteres[3] = 'd';
        caracteres[4] = 'e'; 
        // !!! caracteres[5] => provoque une erreur !!!

        // Taille du tableau
        System.out.println("Taille : " + caracteres.length);

        // Affichage (avec une boucle for, très basique !!)
        for(char c : caracteres) {
            System.out.println(c);
        }

        // La classe java.util.Arrays offre plusieurs opératons de manipulation de tableaux
        // Vous pouvez tester quelques méthodes (copyOf(...), fill(...), etc ...)
        // comme l'exemple ci-dessous 

 // Exemple : Recherche d'un élément dans le tableau
 System.out.println("la lettre 'b' se trouve à la position : " + Arrays.binarySearch(caracteres, 'b'));

            
            
            System.out.println("______________________________");
            System.out.println("***** Début exercice 2 ***********");
            System.out.println();
            
            // Exemple : tri basique (alphanumérique) d'un tableau
                // Initialisation + déclaration + remplissage en même temps 
                int[] valeurs = { 25, 36, 12, 0, 14, 99, -3 };

            System.out.println("Avant le tri par Arrays.sort(...)");
            for(int val : valeurs) {
                System.out.println(val);
            }
System.out.println("------------");
Arrays.sort(valeurs);

System.out.println("Après le tri par Arrays.sort(...)");
	for(int val : valeurs) {
    System.out.println(val);
                
            
        	}   
                
       }   
	}

