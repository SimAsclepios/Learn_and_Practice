package tableaux;

public class TrierTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] valeurs = { 15, 20, 25, -35, -50, 10, 2, -1 };

		int nbrePositifs = 0, nbreNegatifs = 0;
		for (int valeur : valeurs) {
			if (valeur >= 0) {
				nbrePositifs++;
			} else {
				nbreNegatifs++;
			}
		}

		int[] positifs = new int[nbrePositifs];
		int[] negatifs = new int[nbreNegatifs];
		int compteurPositifs = 0;
		int compteurNegatifs = 0;

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
			System.out.println(nbre);

		System.out.println("Nombres négatifs : ");
		for (int nbre : negatifs)
			System.out.println(nbre);

	}

}
