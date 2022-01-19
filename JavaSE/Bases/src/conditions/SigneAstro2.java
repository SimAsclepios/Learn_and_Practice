package conditions;

// Corrigé du TP SigneAstrologique dans le projet : "TP", 	
// avec en plus ici la découverte et l'utilisation des Dates.

//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SigneAstro2 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Veuillez saisir votre date de naissance au format dd/MM/yyyy");
			String input = scanner.nextLine();

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate localDate = LocalDate.parse(input, formatter);

			int month = localDate.getMonthValue();
			int dayOfMonth = localDate.getDayOfMonth();

			String sign = "";

			switch (month) {
			case 1:
				if (dayOfMonth < 20)
					sign = "Capricorne";
				else
					sign = "Verseau";
				break;
			case 2:
				if (dayOfMonth < 19)
					sign = "Verseau";
				else
					sign = "Poisson";
				break;
			case 3:
				if (dayOfMonth < 21)
					sign = "POisson";
				else
					sign = "Bélier";
				break;
			case 4:
				if (dayOfMonth < 20)
					sign = "Bélier";
				else
					sign = "Taureau";
				break;
			case 5:
				if (dayOfMonth < 21)
					sign = "Taureau";
				else
					sign = "Gémeaux";
				break;
			case 6:
				if (dayOfMonth < 21)
					sign = "Gémeaux";
				else
					sign = "Cancer";
				break;
			case 7:
				if (dayOfMonth < 23)
					sign = "Cancer";
				else
					sign = "Lion";
				break;
			case 8:
				if (dayOfMonth < 23)
					sign = "Lion";
				else
					sign = "Vierge";
				break;
			case 9:
				if (dayOfMonth < 23)
					sign = "Vierge";
				else
					sign = "Balance";
				break;
			case 10:
				if (dayOfMonth < 23)
					sign = "Balance";
				else
					sign = "Scorpion";
				break;
			case 11:
				if (dayOfMonth < 22)
					sign = "Scorpion";
				else
					sign = "Sagittaire";
				break;
			case 12:
				if (dayOfMonth < 22)
					sign = "Sagittaire";
				else
					sign = "Capricorne";
				break;
			default:
				System.out.println("erreur");
				break;
			}
			System.out.println(sign);
		}
	}
}