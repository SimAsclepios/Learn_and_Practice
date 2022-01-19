package tableaux;

public class TrierTableauOpti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valeurs = { 15, 20, 25, -35, -50, 10, 2, -1 };

		// On va garder la même taille que le tableau d'origine -> solution limitée !!
		int[] positifs = new int[8];
		int[] negatifs = new int[8];

		int compteurPositifs = 0, compteurNegatifs = 0;
		for (int valeur : valeurs) {
			if (valeur >= 0) {
				positifs[compteurPositifs++] = valeur;
			} else {
				negatifs[compteurNegatifs++] = valeur;
			}
		}

		System.out.println("Tableaux séparés");
		System.out.println("------------------");

		System.out.println("Nombres positifs : ");
		for (int nbre : positifs)
			if (nbre != 0) {
				System.out.println(nbre);
			}

		System.out.println("Nombres négatifs : ");
		for (int nbre : negatifs)
			if (nbre != 0) {
				System.out.println(nbre);
			}
	}

}
