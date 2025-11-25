package verzweigung;

import java.util.Scanner;

public class Anrede {

	public static void main(String[] args) {
//		Übung
		{
			String anrede;
			boolean weiblich = false;
			if (weiblich) {
				System.out.println("Hallo Frau");
			} else {
				System.out.println("Hallo Herr");
			}
		}
		{
			char geschlecht = 'w';
			if (geschlecht == 'w') {
				System.out.println("Hallo Frau");
			} else {
				System.out.println("Hallo Herr");
			}
		}
		{
//			Message: KEIN Vergleich mit == bei Strings (und anderen Objekten)
			String geschlecht = new String("w");
			if (geschlecht == "w") {
				System.out.println("Hallo Frau!");
			} else {
				System.out.println("Hallo Herr!");
			}
//			Hallo Herr!
		}
		{
			String geschlecht = "w";
			if (geschlecht == "w") {
				System.out.println("Hallo Frau!");
			} else {
				System.out.println("Hallo Herr!");
			}
//			Hallo Frau!
		}
		{
//			Übung: Bitte unterscheiden Sie 3 Flälle. Für d sei die Anrede nur "Hallo"
			char geschlecht = 'w';
			if (geschlecht == 'w') {
				System.out.println("Hallo Frau");
			} else {
				System.out.println("Hallo Herr");
			}

		}
		{
			System.out.println("==== AK ==== ");
			char geschlecht = 'd';

			if (geschlecht == 'w') {
				System.out.println("Hallo Frau ...");
			} else {
				if (geschlecht == 'm') {
					System.out.println("Hallo Herr ...");
				} else {
					System.out.println("Hallo du Einhorn mit Rosa Schischi Glitzeraufklebern");
				}
			}

			System.out.println("-------------- AK Alternative ---------------------------------------");

			switch (geschlecht) {
			case 'm':
				System.out.println("Hallo Herr ...");
				break;
			case 'w':
				System.out.println("Hallo Frau ...");
				break;
			case 'd':
				System.out.println("Hallo du Einhorn mit Rosa Schischi Glitzeraufklebern");
				break;
			default:
				System.out.println("HODOR");
				break;
			}

		}
		{
			System.out.println("==== ST ==== ");
			char geschlecht = 'd';
			if (geschlecht == 'w') {
				System.out.println("Hallo Frau");
			} else if (geschlecht == 'm') {
				System.out.println("Hallo Herr");
			} else {
				System.out.println("Hallo");
			}
		}
		{
			System.out.println("==== JS ==== ");
			Scanner scanner = new Scanner(System.in);

			System.out.println("Bitte geben Sie ihr Geschlecht an (w,m oder d)");

			char geschlecht = scanner.next().charAt(0);

			if (geschlecht == 'd') {

				System.out.println("Hallo");

			}

			else if (geschlecht == 'w') {

				System.out.println("Hallo Frau");

			}

			else if (geschlecht == 'h') {

				System.out.println("Hallo Herr");

			} else {

				System.out.println("Fehler, bitte Geschlecht angeben");

			}
		}
	} // EndOfMain
}