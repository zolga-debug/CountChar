package verzweigung;

public class Aufgeschobene {

	public static void main(String[] args) {
		{
			int auswahl = 1;
			final int caseLabel = 2; // besser Großbuchstaben
			switch (auswahl) {
			case 1:
				System.out.println("Eins gewählt");
				break;
			case caseLabel:
				System.out.println("Zwei gewählt");
				break;
			default:
				System.out.println("was anderes");
				
			}
		}
		{
			int auswahl = 1;
			final int caseLabel ; // Aufgeschobene Initialisierung...
			caseLabel = 2; // ... ist nicht OK.
			switch (auswahl) {
			case 1:
				System.out.println("Eins gewählt");
				break;
			case caseLabel: // CF
				System.out.println("Zwei gewählt");
				break;
			default:
				System.out.println("was anderes");
			}
		}
		{
			int auswahl = 1;
			final int AUFGESCHOBENE_OK; // =0 nicht OK, wenn nachträgl. andere Werte gespeichert werden sollen
			final int caseLabel = 2; // Achtung: Label
			switch (auswahl) {
			case 1:
				System.out.println("Eins gewählt");
				AUFGESCHOBENE_OK=1;
				break;
			case caseLabel: // CF
				System.out.println("Zwei gewählt");
				AUFGESCHOBENE_OK=2;
				break;
			default:
				System.out.println("was anderes");
				AUFGESCHOBENE_OK=0;
			}
			System.out.println(AUFGESCHOBENE_OK);
		}

	}
}