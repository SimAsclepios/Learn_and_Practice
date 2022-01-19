package methode_recursive;

public class ExoAlgo2 {

	public static void main(String[] args) {

System.out.println(sommeCarré(3));
System.out.println(palindrome("radar", 0));


	}

public static int sommeCarré (int n) {
		
		if (n==0) {return 0;}
		else { 
			System.out.println (n);
			return n*n + sommeCarré(n-1);
		}
	
	}

public static int euclide(int a, int b) {
	if (a%b==0) return b;
	return euclide(b, a%b);
}

public static String palindrome(String s, int ind) {
	
	String vrai = "Palindrome" , faux = "Non palindrome";
	
	char a = s.charAt(ind), b = s.charAt(s.length()-1-ind); 
	
	if (ind*2 > s.length()-1) { return vrai; }
	
	else if (a != b) { return faux; }
	
	else {return palindrome(s, ind+1);}
	
	/*ind = s.length()/2;
	if ( s.charAt(ind) == s.charAt((s.length())-ind) ) ind++; 
	else System.out.println("non palindrome");
	*/

}

/*
public static int longueurChaine(String nbre, int ind) {
	int erreur = -1;
	
	if (nbre.length()==0 || nbre == null) {return erreur;}
	else if (ind == nbre.length()) {return 0;}
	else { return nbre.charAt(nbre.length()-1-ind)* (int)Math.pow(10,  (double) ind)
			+stringToInt(nbre, ind++); }
}
*/

}