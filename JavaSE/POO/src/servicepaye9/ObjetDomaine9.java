package servicepaye9;

public class ObjetDomaine9 {								

	public int calculerSalaireA (String employe) {
		int salaireFixe = 30000 ;
		System.out.println (employe + " a un salaire de " + salaireFixe + "\n");
		return salaireFixe;								
	}
	
	public int calculerSalaireB (String employe, int prime) {
		int salaireFixe = 45000 ;
		int salaireTot = salaireFixe + prime;		
		System.out.println (employe + " a un salaire de " + salaireTot + "\n");
		return salaireTot;		
	}
	
	public static int calculerSalaireC (String employe, int ancienneté) {
		// int salaireBase = 30 000;
		int salaire = 30000 + (ancienneté*2000);
		System.out.println (employe + " a un salaire de " + salaire + "\n");
		return salaire;
	}
	
	public int calculerPrime (String employe) {
	int prime = 2500;
	return prime;
	}
	
	public int calculerSalaireD (String employe, int ancienneté) {
		int salaireBase = 30000;
		int salaire = salaireBase + ancienneté*2000;
		return salaire;
	}
}
