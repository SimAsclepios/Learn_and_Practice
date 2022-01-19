package interfaces;

public class Main {
	 
    static ListeActions actionFoot = new Football();
    static ListeActions actionBasket = new Basketball();
    
	public static void main(String[] args) {

		
		actionFoot.passe("Olive");
		actionFoot.tir("Tom");
		
		System.out.println();
		
		actionBasket.passe("Tony", "Mike");
		actionBasket.tir("Mike");
		
	}
	
}
