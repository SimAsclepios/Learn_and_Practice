package tri;

public class TriFusion implements AlgorithmeDeTri {

	public void trier (int[]tableau) {
		triFusion(tableau);
	}
	
	    public static void main(String[] args) {
	        int arr[] = { 25, -12, 9982, -368, 0, 0, 2, 3, 10 };

	        System.out.println("---Avant le tri fusion---");
	        afficherElements(arr);

	        triFusion(arr);

	        System.out.println("---Apres le tri fusion---");
	        afficherElements(arr);
	    }

	    static void afficherElements(int[] tab) {
	        for (int i = 0; i < tab.length; i++) {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	    }

	    static void triFusion(int tableau[]) {
	        int longueur = tableau.length;
	        if (longueur > 0) {
	            triFusion(tableau, 0, longueur - 1);
	        }
	    }

	    private static void triFusion(int tableau[], int deb, int fin) {
	        if (deb != fin) {
	            int milieu = (fin + deb) / 2;
	            triFusion(tableau, deb, milieu);
	            triFusion(tableau, milieu + 1, fin);
	            fusion(tableau, deb, milieu, fin);
	        }
	    }

	    private static void fusion(int tableau[], int deb1, int fin1, int fin2) {
	        int deb2 = fin1 + 1;

	        // on recopie les éléments du début du tableau
	        int table1[] = new int[fin1 - deb1 + 1];
	        for (int i = deb1; i <= fin1; i++) {
	            table1[i - deb1] = tableau[i];
	        }

	        int compt1 = deb1;
	        int compt2 = deb2;
	        for (int i = deb1; i <= fin2; i++) {
	            // si tous les éléments du premier tableau ont été utilisés
	            if (compt1 == deb2) {
	                // tous les éléments ont donc été classés
	                break;
	            } else if (compt2 == (fin2 + 1)) {
	                // on ajoute les éléments restants du premier tableau
	                tableau[i] = table1[compt1 - deb1];
	                compt1++;
	            } else if (table1[compt1 - deb1] < tableau[compt2]) {
	                // on ajoute un élément du premier tableau
	                tableau[i] = table1[compt1 - deb1];
	                compt1++;
	            } else {
	                // on ajoute un élément du second tableau
	                tableau[i] = tableau[compt2];
	                compt2++;
	            }
	        }
	    }
}
