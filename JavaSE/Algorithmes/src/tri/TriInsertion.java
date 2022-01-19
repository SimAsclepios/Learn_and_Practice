package tri;

public class TriInsertion implements AlgorithmeDeTri {

	public void trier (int[]tableau) {
		triInsertion(tableau);
	}
	
	 public static void triInsertion(int tab[])  {  
         int taille = tab.length;
         for (int i = 1; i < taille; i++) { 
              int index = tab[i];  
              int j = i-1;  
              while(j >= 0 && tab[j] > index) {
                   tab[j+1] = tab[j];  
                   j--;  
              }  
              tab[j+1] = index; 
           }
    }

    static void afficherElements(int[] tab) {      
         for(int i=0; i < tab.length; i++) {  
              System.out.print(tab[i] + " ");  
         }
         System.out.println();
    }

    public static void main(String[] args) {   
         int[] tab = {1,12,4,5,93,21,8,11};  

        System.out.println("Avant le tri par insertion");    
        afficherElements(tab);

        //appel à la méthode de tri
        triInsertion(tab); 

        System.out.println("Après le tri par insertion");  
        afficherElements(tab);   
   } 
}