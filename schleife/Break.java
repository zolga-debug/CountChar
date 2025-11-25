package schleife;

import javax.swing.JOptionPane;

public class Break {

	public static void main(String[] args) {
		{
			for (;;)/* ; */
				break; // evtl. in OCA-Prüfung
			System.out.println("ENDE");

			/*
			 * Lösungen 1) CF 2) Endlos-Schleife 3) keine Ausgabe 4) Anzeigen von Ende
			 */

		}
		{
			// Übung 1:
			// Bitte geben Sie die Zahlen von 9 bis 1 untereinander aus.
			// In der Spalte daneben soll das Produkt aus der Zahl mit sich selbst erscheinen (Quadrieren)
			// Bitte verwenden Sie die for()-Schleife ohne Klammerninhalt (Semikolon müssen sein)
			// 9 81
			// 8 64
			// 7 49
			// 6 36
			// ....
//			    hier kommt ihre Lösung hin

//	    	Übung 2:
//	    	Bitte machen Sie unser Umsatz-PRG (das mit den 6 Rabatten) wiederholbar.
//	    	Verwenden Sie dazu einen geeigneten Schleifentyp und eine oder mehrere Methoden der JOptionPane-Klasse.

		}
		{
			System.out.println("=== ST ===");
			int i = 9;
			int limit = 1;

			for (;;) {

				System.out.println(i + "  |  " + i * i);
				i--;

				if (i < limit) {
					break;
				}

			}

			{
				String wiederholung;

				do {
					{ // PRG-Teil der wiederholt werden soll
						String eingabe = JOptionPane.showInputDialog("Bitte Umsatz eingeben:");
						int umsatz = Integer.parseInt(eingabe);
						int rabatt = 0;

						if (umsatz >= 70_000) {
							rabatt = 15;

						} else if (umsatz >= 50_000) {
							rabatt = 10;

						} else if (umsatz >= 30_000) {
							rabatt = 7;

						} else if (umsatz >= 20_000) {
							rabatt = 5;

						} else if (umsatz >= 10_000) {
							rabatt = 3;

						} else {
							rabatt = 0;
						}
						JOptionPane.showMessageDialog(null, "Rabattsatz für " + umsatz + "€ : " + rabatt + "%");
					}

					wiederholung = JOptionPane.showInputDialog("Nochmal Umsatz eingeben? (Ja / Nein)");

				} while (wiederholung.equalsIgnoreCase("ja"));
			}

		}

		{
			System.out.println("=== AK ===");
			for (;;) {
				int i = 9;
				while (i >= 1) {
					System.out.println(i + "² = " + (int) Math.pow(i, 2));
					i--;
				}
				break;
			}

		}
		{
			System.out.println("=== CB ===");
			int number = 9;

			for (;;) {
				if (number > 0) {
					System.out.printf("%d | %3d\n", number, number * number);
					number--;
				} else {
					break;
				}

			}
			{
				System.out.println("=== NR ===");
				int rabattSatz = 0, i = 0;
				double umsatz = 0, rabattInEuro = 0;
				int[][] umsatzGrenzen = { { 0, 0 }, { 20_000, 3 }, { 30_000, 5 }, { 50_000, 7 }, { 70_000, 10 } };
				boolean gueltigeEingabe = false;

				// Schleife für mehrere Berechnungen, wenn gewünscht
				do {

					// Schleife für Umsatzeingabenverarbeitung
					do {

						// Umsatzeingabe
						String eingabe = JOptionPane.showInputDialog("Bitte Umsatz eingeben:");

						// Wenn abbrechen oder x (JOP) gedrückt wird, wird null zurück gegeben, daher Prüfung
						if (eingabe != null) {

							// Versuch Eingabe in Int umzuwandeln
							try {
								umsatz = Integer.parseInt(eingabe);
								gueltigeEingabe = true;

								// Prüfung welche Umsatzgrenzen überschritten wurden
								while (i < 4 && umsatzGrenzen[i + 1][0] <= umsatz) {
									i++;
								}

								// Ergebnisberechnung und Ausgabe
								rabattSatz = umsatzGrenzen[i][1];
								rabattInEuro = umsatz * rabattSatz / 100;
								JOptionPane.showMessageDialog(null, String.format(
										"Mit einem Umsatz von %,.2f€ erhältst du einen Rabattsatz von %d%%.\nDaraus ergibt sich ein Rabatt von %,.2f€ und ein Endpreis von %,.2f€.\n",
										umsatz, rabattSatz, rabattInEuro, (umsatz - rabattInEuro)));

								// wenn umwandlung in Int nicht möglich:
							} catch (NumberFormatException e) {
								JOptionPane.showMessageDialog(null, "Ungültige eingabe. Bitte erneut versuchen.");
							}

							// else = wenn ursprüngliche Eingabe null war -> Abbruch oder X -> Programm beenden
						} else {
							return;
						}

						// Wenn keine gültige Eingabe (catch-block) Schleife für Umsatzeingabe wiederholt
					} while (gueltigeEingabe == false);

					gueltigeEingabe = false;

				} while (JOptionPane.showConfirmDialog(null, "Weitere Berechnung?") == JOptionPane.OK_OPTION);
			}
		}

	} // E

}
