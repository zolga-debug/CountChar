package verzweigung;

public class Umsatz3Faelle {

	public static void main(String[] args) {
		// Übung:
		// Rabattsatz in Abhängigkeit vom Umsatz
		// Umsatz (€) Rabattsatz (%)
//	    ab 0            0
//	    ab 10.000       3  
//	    ab 20.000       5 

//	    Bitte auch Struktogramm zeichen
//	    
//	    gewünschte Ausgabe: Sie haben für y € eingekauft und erhalten einen Rabattsatz von z. Sie sparen dadurch w €

		{
			System.out.println("=== KK ===");
			double umsatz = 22_000;
			double rabattDreiProzent = umsatz * 0.03; // hinsichtlich CleanCode bessere Wartbarkeit
			double rabattFuenfProzent = umsatz * 0.05;

			double rabattInEuroDrei = umsatz - rabattDreiProzent; // CleanCode: lieber allgem. statt speziell
			double rabattInEuroFuenf = umsatz - rabattFuenfProzent; // somit doppelte Arbeit

			if (umsatz >= 20_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 5% Rabatt\n"
						+ "Das entspricht: " + rabattFuenfProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ rabattInEuroFuenf + "€");
			} else if (umsatz >= 10_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 3% Rabatt\n"
						+ "Das entspricht: " + rabattDreiProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ rabattInEuroDrei + "€");
			} else {
				System.out.println("Sie haben für weniger als 10.000€ eingekauft und erhalten keinen Rabatt");
			}
		}
		{
			System.out.println("=== KK modi ==="); // Idee: Arbeitsminimierung
			double umsatz = 22_000;
			double rabattDreiProzent = umsatz * 0.03; // hinsichtlich CleanCode bessere Wartbarkeit
			double rabattFuenfProzent = umsatz * 0.05;

//			double rabattInEuroDrei = umsatz-rabattDreiProzent; // CleanCode: lieber allgem. statt speziell
//			double rabattInEuroFuenf = umsatz-rabattFuenfProzent; // somit doppelte Arbeit

			if (umsatz >= 20_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 5% Rabatt\n"
						+ "Das entspricht: " + rabattFuenfProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattFuenfProzent) + "€");
			} else if (umsatz >= 10_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 3% Rabatt\n"
						+ "Das entspricht: " + rabattDreiProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattDreiProzent) + "€");
			} else {
				System.out.println("Sie haben für weniger als 10.000€ eingekauft und erhalten keinen Rabatt");
			}
		}

		{
			System.out.println("=== AK ===");
			double rabattSchwelle = 10_000; // CleanCode: pos. f. Wartbarkeit
			double rabattSchwelle2 = 20_000;
			double umsatz = 17_500;
			int rabattSatz = 3;
			int rabattSatz2 = 5;
			double rabattInEuro = (umsatz * rabattSatz) / 100; // analog KK
			double rabattInEuro2 = (umsatz * rabattSatz2) / 100;

			if (umsatz >= rabattSchwelle2) {
				System.out.println("Auf grund Ihres Umsatzes von: " + umsatz + "€ wird Ihnen ein Rabatt von "
						+ rabattSatz2 + "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro2 + "€");
			} else {
				if (umsatz >= rabattSchwelle) {
					System.out.println("Auf grund Ihres Umsatzes von: " + umsatz + "€ wird Ihnen ein Rabatt von "
							+ rabattSatz + "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
					System.out.println("Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle2 - umsatz)
							+ "€ wird Ihnen ein Rabatt von: " + rabattSatz2 + "% gewährt!");
				} else {
					System.out.println("Ihr Umsatz beträgt: " + umsatz + "€ beim Kauf weiterer Waren im Wert von: "
							+ (rabattSchwelle - umsatz) + "€ wird Ihnen ein Rabatt von: " + rabattSatz + "% gewährt!");
					System.out.println("                            Beim Kauf weiterer Waren im Wert von: "
							+ (rabattSchwelle2 - umsatz) + "€ wird Ihnen sogar ein Rabatt von: " + rabattSatz2
							+ "% gewährt!");
				}

			}
		}
		{
			System.out.println("=== ST ===");
			double umsatz = 15_000, rabattInEuro = 0;
			int rabattSatz = 0;

			if (umsatz >= 20_000) {

				rabattSatz = 5;

			} else if (umsatz >= 10_000) {

				rabattSatz = 3;

			} else {

				rabattSatz = 0;

				System.out.println(
						"***Hey, ab einem Einkaufswert von 10.000 € erhalten Sie zusätzliche 3% Rabatt auf Ihren Einkauf***");
				System.out.println(
						"***Und ab einem Einkaufswert von 20.000 € erhalten Sie zusätzliche 5% Rabatt auf Ihren Einkauf***");
			}

			rabattInEuro = (umsatz / 100) * rabattSatz;

			System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten somit einen Rabattsatz von: "
					+ rabattSatz + " %.\nSie Sparen dadurch : " + rabattInEuro + " €");
		}

		{
			System.out.println("=== DA ===");
			//@formatter:off
			double umsatz = 1_000, rabattSatz1 = 3, rabattSatz2 = 5, 
					rabattEuro1 = umsatz * (rabattSatz1 / 100), // ini. mit Formel
					rabattEuro2 = umsatz * (rabattSatz2 / 100);
			//@formatter:on

			if (umsatz >= 20_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten einen Rabattsatz von "
						+ rabattSatz2 + "% Sie sparen dadurch " + rabattEuro2 + "€");
			}

			else if (umsatz >= 10_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten einen Rabattsatz von "
						+ rabattSatz1 + "% Sie sparen dadurch " + rabattEuro1 + "€");
			} else {
				System.out
						.println("Der Umsatz betraegt " + umsatz + "€, ab einen Umsatz von 10.000€ ist ein Rabatt von "
								+ rabattSatz1 + "% möglich und ab 20.000€ ein Rabatt von " + rabattSatz2 + "%");
			}

		}
		{
			System.out.println("=== TS ===");
			int rabattSatz = 0;
			double umsatz = 9999, rabattInEuro = 0;
			
			if (umsatz < 10_000) { // Andere Reihenfolge der geschachtelten Fallunterscheidungen
	            rabattSatz = 0; // CleanCode: schlanke Lösung
	        } else if (umsatz < 20_000) {
	            rabattSatz = 3;
	        } else {
	            rabattSatz = 5;
	        }
	 
	        rabattInEuro = umsatz * (rabattSatz / 100.0); // CleanCode: schlanke Lösung
	 
	        System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten einen Rabattsatz von "
	                + rabattSatz + " %. Sie sparen dadurch " + rabattInEuro + " €.");    // CleanCode: schlanke Lösung
		}
	}

}
