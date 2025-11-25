package verzweigung;

import javax.swing.JOptionPane;

public class Konstanten {

	public static void main(String[] args) {
		{
//			int antwort = JOptionPane.showConfirmDialog(null, "Bittel klicken");
//			System.out.println(antwort);
//		ja = 0
//		nein = 1
//				abbrechen = 2
//		close = -1

//		Übungen:
//		Bitte schreiben Sie einen Text in die Console in Abhänbgigkeit von dem geklickten Knopf:
//		ja: Sie haben "Ja" angeklickt.
//		nein: Sie haben "Nein" angeklickt.
//		Abbrechen: Sie haben "Abbrechen" angeklickt.
//		schließen: Sie haben das Fenster geschlossen.
		}
		{
			System.out.println("=== KK ===");
			int antwort = JOptionPane.showConfirmDialog(null, "Bittel klicken");

//	   	   int antwort = 420; // Falscher Wert weil ich default testen wollte.

			switch (antwort) {
			case JOptionPane.YES_OPTION:
				System.out.println("Sie haben \"Ja\" angeklickt.");
				break;

			case JOptionPane.NO_OPTION:
				System.out.println("Sie haben \"Nein\" angeklickt.");
				break;

			case JOptionPane.CANCEL_OPTION:
				System.out.println("Sie haben \"Abbrechen\" angeklickt.");
				break;

			case JOptionPane.CLOSED_OPTION:
				System.out.println("Sie haben das Fenster geschlossen.");
				break;

			default: // wg. evtl. Modifikation des GUI-Elementes
				System.out.println("Unbekannte Auswahl: " + antwort);
				break;
			}

		}
		{
			System.out.println("=== AK ===");
			int antwort = JOptionPane.showConfirmDialog(null, "Bittel klicken");
			System.out.println(antwort);
			
			switch (antwort) {
			case -1:
				System.out.println("Sie haben das Fenster mit X geschlossen");
				break;
			case 0:
				System.out.println("Sie haben auf Ja geklickt");
				break;
			case 1:
				System.out.println("Sie haben auf Nein geklickt");
				break;
			case 2:
				System.out.println("Sie haben auf Abbrechen geklickt");
				break;
			default:
				System.out.println("Bist du noch da???? Klick doch endlich was !!!!");
				break;
			}
		}
			{
				System.out.println("=== CB, ST ===");
				{
					int userInput = JOptionPane.showConfirmDialog(null, "Bitte IRGENDETWAS klicken!");
					
					switch (userInput) {
					case -1:
						System.out.println("Sie haben \"Fenster schliessen gedrückt\"");
						break;
					case 0:
						System.out.println("Sie haben auf \"Ja\" geklickt");
						break;
					case 1:
						System.out.println("Sie haben auf \"Nein\" geklickt");
						break;
					case 2:
						System.out.println("Sie haben auf \"Abbrechen\" geklickt");
						
						}
				}
			 
			}
			{
				System.out.println("=== TS ===");
				int antwort = JOptionPane.showConfirmDialog(null, "Bitte klicken");
				
//				Lösung mit geschachteltem if()
				if (antwort == 0) {
					System.out.println("Sie haben \"Ja\" angeklickt.");
				} else if (antwort == 1) {
					System.out.println("Sie haben \"Nein\" angeklickt.");
				} else if (antwort == 2) {
					System.out.println("Sie haben \"Abbrechen\" angeklickt.");
				} else if (antwort == -1) {
					System.out.println("Sie haben das Fenster geschlossen.");
				}
				}
			
	} // E

}
