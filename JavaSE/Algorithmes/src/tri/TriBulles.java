package tri;

public class TriBulles implements AlgorithmeDeTri {

	public void trier (int[]tableau) {
		triBulle(tableau);
	}
	
	    static void triBulle(int[] tab) {
	        int taille = tab.length;
	        int tmp = 0;
	        for (int i = 0; i < taille; i++) {
	            for (int j = 1; j < (taille - i); j++) {
	                if (tab[j - 1] > tab[j]) {
	                    tmp = tab[j - 1];
	                    tab[j - 1] = tab[j];
	                    tab[j] = tmp;
	                }
	            }
	        }
	    }

	    static void afficherElements(int[] tab) {
	        for (int i = 0; i < tab.length; i++) {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int arr[] = { 84, 12, 1, 43, 5, 10 };

	        System.out.println("---Avant le tri à bulle---");
	        afficherElements(arr);

	        triBulle(arr);

	        System.out.println("---Après le tri à bulle---");
	        afficherElements(arr);
	    }
}
