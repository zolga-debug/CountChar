package verzweigung;

public class AnredeCaseGrossKlein {

	public static void main(String[] args) {
//		Übung: 
//		Bitte realisieren Sie die Anrede-Übung jetzt mit switch-case
//		m bzw. M für männlich (also Hallo Herr) Nachname
//		w bzw. W dito
//		d bzw. D wie in der vorherigen Übung mit Vor- und Nachname
//		Fehleingabe

		{
			System.out.println("==== DA ====");
			char geschlecht = 'f';
			// Zu faul für die Variablen mit Vor- und Nachname...
			switch (geschlecht) {
			case 'm':
			case 'M': { // mit Durchfallen mit Block
				System.out.println("Hallo Herr");
			}
				break;
			case 'w':
			case 'W': {
				System.out.println("Hallo Frau");
			}
				break;
			case 'd':
			case 'D': {
				System.out.println("Hallo du alles");
			}
				break;
			default:
				System.out.println("Hallo du nichts");
			}

		}
		{
			System.out.println("==== DA ====");
			String vornamew = "Susi";
			String vornamem = "Otto";
			String nachnamew = "Sorglos";
			String nachnamem = "Walkes";
			char geschlecht = 'd';

			switch (geschlecht) {
			case 'm': // mit Durchfallen ohne Block
			case 'M':
				System.out.println("Hallo Herr " + nachnamem);
				break;
			case 'w':
			case 'W':
				System.out.println("Hallo Frau " + nachnamew);
				break;
			case 'd':
			case 'D':
				System.out.println("Hallo " + vornamem + " " + nachnamem);
				break;
			default:
				System.out.println("Irgendwas ist schief gelaufen");
				break;
			}

		}
		{
			{
				System.out.println("==== ST ====");
				System.out.println("====== LOWERCASE ======");
				String vorname1 = "Otto", vorname2 = "Susi";
				String nachname1 = "Walkes", nachname2 = "Sorglos";

				char geschlecht = 'F';

				switch (Character.toLowerCase(geschlecht)) { // mit Wrapper-Klasse

				case 'm':
					System.out.println("Hallo Herr " + nachname1);
					break;

				case 'w':
					System.out.println("Hallo Frau" + nachname2);
					break;

				case 'd':
					System.out.println("Hallo " + vorname1 + " " + nachname1);
					break;

				default:
					System.out.println("Fehleingabe");
					break;

				}
			}
			{
				System.out.println("====== UPPERCASE ======");
				String vorname1 = "Otto", vorname2 = "Susi";
				String nachname1 = "Walkes", nachname2 = "Sorglos";

				char geschlecht = 'm';

				switch (Character.toUpperCase(geschlecht)) {

				case 'M':
					System.out.println("Hallo Herr " + vorname1);
					break;

				case 'W':
					System.out.println("Hallo Frau" + vorname2);

				case 'D':
					System.out.println("Hallo " + vorname1 + " " + nachname1);
					break;

				default:
					System.out.println("Fehleingabe. Bitte wiederholen Sie den Ablauf!");

				}

			}
		}

		{
			System.out.println("==== CB ====");
			String firstName = "Otto";
			String lastName = "Walkes";
			String gender = "D";

			switch (gender.toLowerCase()) { // mit Referenmz auf Objekt
			case "m":
				System.out.println("Hallo Herr " + lastName);
				break;
			case "w":
				System.out.println("Hallo Frau " + lastName);
				break;
			case "d":
				System.out.println("Hallo " + firstName + " " + lastName);
				break;
			default:
				System.out.println("Falscher Wert eingegeben");
				break;
			}

		}

	} // E

}
