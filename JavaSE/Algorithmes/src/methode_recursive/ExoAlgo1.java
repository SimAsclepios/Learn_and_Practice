package methode_recursive;

public class ExoAlgo1 {

	public static void main(String[] args) {

		System.out.println("pgcd de 1245 et 543 : " + pgdc(1245, 543));
		System.out.println("Factorielle de 5 : " + factorielleIterative(5));
		System.out.println("Factorielle de 5 : " + factorielleRecurente(5));
	}

	public static int pgdc(int n, int m) {
		
		int a = n , b = m , reste = a % b;
		
		while (reste != 0) {
			a = b;
			b = reste;
			reste = a%b;
		}
		
		return b;
		
	}
	
	public static int pgdcRecurent(int n, int m)  {
		
		if (n%m==0) return m;
		return pgdcRecurent(m,n%m);
	}
	
	public static int factorielleIterative (int n) {
		
		int resultat = 1;
		
		for (int i=1 ; i <= n ; i++) {
			resultat *= i;
		}
		
		return resultat;

	}
	
	public static int factorielleRecurente (int n) {
		
		if (n==0) {return 1;}
		else { 
			System.out.println (n + "* factorielle de " + (n-1));
			return n * factorielleRecurente(n-1);
		}
		
		/*
		 * Explication fonctionnement de la méthode :
		 * On fait la méthode pour n=5
		 * 
		 * n différent de 0		(if n==0)
		 * donc on passe au else : fait n * méthode(n-1) = 5 * méthode(4)
		 * 
		 * Mais ne connait pas le resultat de méthode(4)
		 * Donc va lancer factorielleRecurente(4) pour le calculer
		 * 
		 * Pour calculer méthode(4), besoin de connaitre resultat méthode(3)
		 * Va relancer la méthode pour n=3
		 * 
		 * Mais pour calculer factorielleRecurente(3), besoin de connaitre le resultat de facRec(2)
		 * etc etc jusqu'à arriver à méthode(0)
		 * Donc n==0 alors return 1
		 * Maintenant la machine connait le résultat de méthode(0), il va pouvoir calculer méthode(1)
		 * puis méthode(2), etc et remonte la boucle jusqu'à méthode(n) pour nous retourner le resultat final.
		 * 
		 * Boucle qui descend pour chercher un resultat d'une méthode, puis remonte la boucle pour tout calculer.
		 */
		
		
	}
	
}
