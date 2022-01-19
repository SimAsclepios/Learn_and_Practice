package exercices;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Caisse {

	private static final DateTimeFormatter DATE_TIME_PATTERN = DateTimeFormatter.ofPattern("EEE dd/MM/yyyy HH:mm:ss");
	private static final String EURO = "€";

	// Fonction permettant de formater les prix selon les param�tres par d�faut
	// du syst�me et de la localisation France
	private static String format(double value) {
		return NumberFormat.getInstance(Locale.FRANCE).format(value);
	}

	private static String eurosFormat(double valeur) {
		return format(valeur) + EURO;
	}

	public static void main(String[] args) {

		// Objet technique permettant de saisir des valeurs depuis l'entr�e principale
		// du programme
		// (depuis le terminal de lancement, et l'entr�e standard du syst�me)
		try (Scanner saisie = new Scanner(System.in)) {

			System.out.println(
					"**** " + DateTimeFormatter.ofPattern("DDD dd/MM/yyyy HH:mm:ss").format(LocalDateTime.now()));
			System.out.println("Début du programme ");
			System.out.println();
			System.out.println("Veillez saisir les articles");
			System.out.println("----------------------------------------------------");

			// Commence par défaut à VRAI et ne change que si
			// la caisse termine le programme
			boolean saisieArticles = true;

			String libelleArticle = null;
			double prixUnitaire, totalLigneArticle, totalPanier = 0;
			int quantiteArticle, quantiteTotale = 0, nombreArticlesDistincts = 0;

			// On répète tant qu'il y a de la saisie d'article à faire
			while (saisieArticles) {

				// Continuité du programme
				// permet de s'assuer que le user va saisir : oui ou non comme valeur pour
				// continuer
				// ou arrêter , toute autre valeur sera refusée et une nouvelle saisie se lance

				// Comme on va lui demander au moins une fois s'il veut saisir des articles
				// on utilise le do { ... } while(...)

				String continueValuer = "";
				do {
					System.out.println("Voulez vous saisir un nouvel article ? (oui..non)");
					continueValuer = saisie.nextLine();

					// Si aucune saisie, ou le mot non -> arrêt
				} while (!("non".equals(continueValuer) || "oui".equals(continueValuer)));

				// Si le user a choisi d'arrêter, on quitte le traitement
				if (continueValuer.equals("non")) {
					saisieArticles = false;
					// Sortir de la boucle de saisie de produits
					break;
				}

				// Arrivant ici le user a saisi oui et le programme continue
				System.out.println("************************************");

				System.out.println("Libellé article (par ex : Pain 500gr):");
				libelleArticle = saisie.nextLine();

				System.out.println("Prix unitaire (par ex : 1.25) :");
				prixUnitaire = Double.parseDouble(saisie.nextLine());

				System.out.println("Quantité (ex : 2) :");
				quantiteArticle = Integer.parseInt(saisie.nextLine());

				// total de chaque ligne article (sera écrasé à chaque nouvelle saisie)
				totalLigneArticle = (prixUnitaire * quantiteArticle);

				System.out.println();

				// Affichage intermédiaire de la saisie (optionnels)
				String messageLigneProduit = MessageFormat.format("{0} ( {1} € x {2} = {3} € )", libelleArticle,
						prixUnitaire, quantiteArticle, format(totalLigneArticle));
				System.out.println("Ligne produit : " + messageLigneProduit);

				// Calcul des données globales : quantité totale et total panier
				// On distingue la quantité totale en produit différent ou en quantité
				// d'objets

				// Les articles distincts
				nombreArticlesDistincts = nombreArticlesDistincts + 1;

				// le nombre total de produits unitairement calculé
				quantiteTotale = quantiteTotale + quantiteArticle;

				// Mise à jour du total panier
				totalPanier = totalPanier + totalLigneArticle;

				System.out.println("----------------------------------------------------");
			}

			System.out.println("----------------------------------------------------");
			if (nombreArticlesDistincts == 0) {
				System.out.println("Vous n'avez saisi aucun article");
			} else {
				System.out.println("Nombre d'articles distincts : " + nombreArticlesDistincts);
				System.out.println("Quantité totale de produits : " + quantiteTotale);
				System.out.println("Total de panier : " + eurosFormat(totalPanier));

				System.out.println("----------------------------------------------------");
				System.out.println("Veuillez saisir le montant de paiement : ");

				double montantPaiement = Double.parseDouble(saisie.nextLine());
				System.out.println("Vous avez payé : " + eurosFormat(montantPaiement));

				if (montantPaiement < totalPanier) {

					double manqueACompleter = montantPaiement - totalPanier;
					System.out.println("Veuillez compléter votre paiement");

					while (manqueACompleter <= 0) {
						System.out.println("Il vous manque : " + eurosFormat(manqueACompleter));
						double montantCompletion = Double.parseDouble(saisie.nextLine());
						manqueACompleter = manqueACompleter + montantCompletion;
					}

					// finamelement le user a donné plus que ce qu'il manquait
					if (manqueACompleter == 0) {
						System.out.println("Montant complété - Paiement finalisé.");
					} else if (manqueACompleter > 0) {
						System.out.println("Montant complété - Reste rendu sur trop perçu : "
								+ eurosFormat(Math.abs(manqueACompleter)));
					} else {
						// Ne devrait pas arriver !!
						System.out.println("Erreur de paiement -- Vous devez encore compléter votre paiement");
					}
				} else {
					double resteARendre = montantPaiement - totalPanier;
					if (resteARendre > 0) {
						System.out.println("Reste à rendre : " + eurosFormat(resteARendre));
					} else {
						System.out.println("Pas de reste à rendre.");
					}
				}

				System.out.println("Fin de la saisie.");
				System.out.println("**** " + todaysDateAndTime());
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.out.println("Fin du programme avec erreurs");
		} finally {
			System.exit(0);
		}
	}

	private static String todaysDateAndTime() {
		return DATE_TIME_PATTERN.format(LocalDateTime.now());
	}

}