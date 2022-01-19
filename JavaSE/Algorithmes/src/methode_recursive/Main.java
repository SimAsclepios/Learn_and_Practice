package methode_recursive;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListeChainee maListe = new ListeChainee();
		System.out.println("maListe = " + maListe.toString());
		ListeChainee maPhrase = new ListeChainee("Ceci",
									new ListeChainee("est",
											new ListeChainee("une",
													new ListeChainee("phrase",maListe))));
		System.out.println("maPhrase = " + maPhrase);
		
		ListeChainee2 mesNombres = new ListeChainee2(2,
									new ListeChainee2(5,
									 new ListeChainee2(9,
									  new ListeChainee2(12))));
		
		System.out.println("mesNombres = " + mesNombres.toString());
		
		mesNombres = mesNombres.insererOrdre(1);
		System.out.println("mesNombres = " + mesNombres.toString());
		
		mesNombres = mesNombres.insererOrdre(6);
		System.out.println("mesNombres = " + mesNombres.toString());
		
		mesNombres = mesNombres.supprimerValeur(6);
		System.out.println("mesNombres = " + mesNombres.toString());
		
		mesNombres = mesNombres.supprimerValeur(13);
		System.out.println("mesNombres = " + mesNombres.toString());
		
		mesNombres = mesNombres.supprimerValeur(1);
		System.out.println("mesNombres = " + mesNombres.toString());
	}
}