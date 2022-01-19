package liste_chainee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListeChainee3<String> monDictionnaire =  new ListeChainee3<String>("noeud");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString()+"\n");
		monDictionnaire = monDictionnaire.insererOrdre("arbre");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString()+"\n");
		monDictionnaire = monDictionnaire.insererOrdre("racine");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString()+"\n");
		monDictionnaire = monDictionnaire.insererOrdre("profondeur");
		System.out.println("monDictionnaire : "+ monDictionnaire.toString()+"\n");	
			}
		}


