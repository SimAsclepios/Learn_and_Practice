package basique;

public class FonctionsMaths {

	public static void main(String[] args) {

		int entiernegatif = -15;
		int entierpositif = Math.abs(entiernegatif);

		System.out.println("entiernegatif : " + entiernegatif);
		System.out.println("\n entierpositif : " + entierpositif);

		System.out.println("\n Nombre le plus grand : " + Math.max(entierpositif, entiernegatif));

	}

}
