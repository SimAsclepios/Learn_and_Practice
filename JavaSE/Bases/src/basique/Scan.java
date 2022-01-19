package basique;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String code = scan.next() + scan.next() + scan.next() + scan.next();
		System.out.println(code);

		int points = 0;

		if (code.equals("Augmentermespointsde")) {

			System.out.println("Entrez le nombre de point : ");
			points = scan.nextInt();

		}

		else {
			System.out.println("Mauvais code");
		}

		System.out.println("Vous avez " + points + " points");

		scan.close();
	}
}


/* Problème Scanner :

La méthode Scanner.nextInt ne consomme pas le caractère dernier newline de votre entrée, et donc newline est consommé dans le prochain appel à Scanner.nextLine.
Vous rencontrerez le même comportement lorsque vous utilisez Scanner.nextLine après Scanner.next() ou toute méthode Scanner.nextFoo (sauf nextLine elle-même).

Solutions :
- Soit lancer à blanc Scanner.nextLine appelé après Scanner.nextInt ou Scanner.nextFoo pour consommer le reste de cette ligne.
- Faire des scan.reset() ! 
- Ou, ce serait encore mieux, si vous lisez l'entrée Scanner.nextLine et de convertir votre entrée pour le format approprié vous avez besoin. 
Par exemples, à un entier en utilisant Integer.parseInt(String) la méthode.
*/