package maillon;

public class MainApplication {
    public static void main(String[] args) {

		
		Maillon<String> monDictionnaire =  new Maillon<String>("noeud");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString()+"\n");
		monDictionnaire = monDictionnaire.insererOrdre("arbre");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString());
		monDictionnaire = monDictionnaire.insererOrdre("racine");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString());
		monDictionnaire = monDictionnaire.insererOrdre("rat");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString());
		monDictionnaire = monDictionnaire.insererOrdre("profondeur");
        monDictionnaire = monDictionnaire.insererOrdre("profondeur");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString());
		

        /* jeu de tests correction exercices supplémentaires */

        System.out.println("\nJeu de tests correction exercices supplémentaires");

        //ex1
        System.out.println("\nExercice 1");
        System.out.println("Longueur de monDictionnaire : "+ monDictionnaire.comptage());
        //ex2
        System.out.println("\nExercice 2");
        System.out.println("Occurences de profondeur dans monDictionnaire : "+ monDictionnaire.comptage_occurences("profondeur"));
        System.out.println("Occurences de profondeur dans monDictionnaire : "+ monDictionnaire.comptage_occurences("arbre"));
        System.out.println("Occurences de profondeur dans monDictionnaire : "+ monDictionnaire.comptage_occurences("feuille"));
        //ex3
        System.out.println("\nExercice 3");
        System.out.println("Vérification du triage croissant de monDictionnaire : "+ monDictionnaire.verif_triage());
        Maillon<String> maPhrase = new Maillon<String>("Ceci",
                                        new Maillon<String>("est",
                                            new Maillon<String>("une",
                                                new Maillon<String>("phrase"))));
        System.out.println("maPhrase : "+ maPhrase.toString());
        System.out.println("Vérification du triage croissant de maPhrase : "+ maPhrase.verif_triage());
        //ex4
        System.out.println("\nExercice 4");
        maPhrase = maPhrase.insertion_tete("Avant");
        System.out.println("maPhrase : "+ maPhrase.toString());
        //ex5
        System.out.println("\nExercice 5");
        maPhrase = maPhrase.insertion_queue("Après");
        System.out.println("maPhrase : "+ maPhrase.toString());
        //ex6
        System.out.println("\nExercice 6");
        maPhrase = maPhrase.insertion_pos("3ème Position", 3);
        System.out.println("maPhrase : "+ maPhrase.toString());
        //ex7
        System.out.println("\nExercice 7");
        maPhrase = maPhrase.suppression_pos(3);
        System.out.println("maPhrase : "+ maPhrase.toString());
        maPhrase = maPhrase.suppression_pos(1);
        System.out.println("maPhrase : "+ maPhrase.toString());
        maPhrase = maPhrase.suppression_pos(maPhrase.comptage());
        System.out.println("maPhrase : "+ maPhrase.toString());
    }
}
