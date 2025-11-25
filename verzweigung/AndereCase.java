package verzweigung;

public class AndereCase {

	public static void main(String[] args) {
//		Übung: 
//		Bitte realisieren Sie die Anrede-Übung jetzt mit switch-case
//		m für männlich (also Hallo Herr) Nachname
//		w dito
//		d wie in der vorherigen Übung mit Vor- und Nachname
//		Fehleingabe

		{
			System.out.println("=== KK ===");
			String test = "1"; // 1 = w, 2=m, 3=d
			String nachname = "Eichel";
			String vorname = "Rosa";

			switch (test) {
			case "1":
				System.out.println("Hallo Frau " + nachname);
				break;
			case "2":
				System.out.println("Hallo Herr " + nachname);
				break;
			case "3":
				System.out.println("Hallo " + vorname + " " + nachname);
				break;
			default:
				System.out.println("Fehleingabe!\nBitte erneut versuchen.");
			}
		}
		{
			System.out.println("=== ST ===");
			String vorname1 = "Otto", vorname2 = "Susi";
			String nachname1 = "Walkes", nachname2 = "Sorglos";

			char geschlecht = 'w';

			switch (geschlecht) {

			case 'm':
				System.out.println("Hallo Herr " + nachname1);
				break;

			case 'w':
				System.out.println("Hallo Frau " + nachname2);
				break;

			case 'd':
				System.out.println("Hallo " + vorname1 + " " + nachname1);
				break;

			default:
				System.out.println("Fehleingabe");

			}
		}
		{
			System.out.println("=== CB ===");
			String firstName = "Otto";
			String lastName = "Walkes";
			String gender = "j";

			switch (gender) {
			case "m":
				System.out.println("Hallo Herr " + lastName);
				break;
			case "w":
				System.out.println("Hallo Frau " + lastName);
				break;
			case "d":
				System.out.println("Hallo" + firstName + " " + lastName);
				break;
			default:
				System.out.println("Falscher Wert eingegeben");
				break;
			}

		}
		{
			System.out.println("=== IT ===");
			String vorname = "Susi";
			String vorname1 = "Otto";
			String nachname = "Sorglos";
			String nachname1 = "Walkes";
			char geschlecht = 'w';// w = weiblich, m = männlich, d = divers

			switch (geschlecht) {
			case 'w':
				System.out.println("Hallo Frau " + nachname);
				break;
			case 'm':
				System.out.println("Hallo Herr " + nachname1);
				break;
			case 'd':
				System.out.println("Hallo " + vorname1 + " " + nachname1);
				break;
			default:
				System.out.println("Ungültige Eingabe");
			}

		}

		{
			System.out.println("=== AK ===");
			String vornamew = "Susi";
			String vornamem = "Otto";
			String nachnamew = "Sorglos";
			String nachnamem = "Walkes";
			char geschlecht = 'd';

			switch (geschlecht) {
			case 'm':
				System.out.println("Hallo Herr " + vornamem + " " + nachnamem);
				break;
			case 'w':
				System.out.println("Hallo Frau " + vornamew + " " + nachnamew);
				break;
			case 'd':
				System.out.println("Hallo " + vornamem + " " + nachnamem);
				break;
			default:
				System.out.println("Irgendwas ist schief gelaufen");
				break;
			}

		}
		{
			System.out.println("=== GT ===");

			String nachnameW = "Sorglos";
			String nachnameM = "Walkes";
			String vornameD = "Lulu";
			String nachnameD = "Tufftuff";
			char geschlecht = 'd';
			switch (geschlecht) {
			case 'w':
				System.out.println("Hallo Frau " + nachnameW);
				break;
			case 'm':
				System.out.println("Hallo Herr " + nachnameM);
				break;
			case 'd':
				System.out.println("Hallo " + vornameD + " " + nachnameD);
				break;
			default:
				System.out.println("Hallo... echt traurig, dass Sie nicht zu Ihrem wahren Geschlecht stehen! -.-");
				break;
			}

		}
	} // E

}
