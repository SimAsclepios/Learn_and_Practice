package tri;

public class TriSelection implements AlgorithmeDeTri {

	@Override
	public void trier (int[] tableau) {
		tri_selection(tableau);
	}
	
	
	 public static void tri_selection(int[] tab) {
	        for (int i = 0; i < tab.length - 1; i++) {
	            int index = i;
	            for (int j = i + 1; j < tab.length; j++) {
	                if (tab[j] < tab[index]) {
	                    index = j;
	                }
	            }

	            int min = tab[index];
	            tab[index] = tab[i];
	            tab[i] = min;
	        }
	    }

	    static void afficher(int[] tab) {
	        for (int i = 0; i < tab.length; i++) {
	            System.out.print(tab[i] + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String a[]) {
	        int[] tab = { -4, 1, 13, 4, 16, 2, 13, 14 };

	        System.out.println("**** Avant le tri par selection *****");
	        afficher(tab);

	        // appel de la méthode pour le tri
	        tri_selection(tab);

	        System.out.println("**** Après le tri par selection ****");
	        afficher(tab);
	    }
	}