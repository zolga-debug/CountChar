package verzweigung;

public class Umsatz {

	public static void main(String[] args) {
		{
			// Rabattsatz in Abhängigkeit vom Umsatz
			// Umsatz (€) Rabattsatz (%)
//	    ab 0            0
//	    ab 10.000       3  => meint inkl. 10.000€ (Info an den Kunden, das Umsatz 9700€ beträgt und ab 10.000€ 3% Rabatt mögl. sind)
			int rabattSatz = 0;
			double umsatz = 9700, rabattInEuro = 0;
//	    gewünschte Ausgabe: Sie haben für y € eingekauft und erhalten einen Rabattsatz von z. Sie sparen dadurch w €

		}
		{
			System.out.println("=== DA ===");
			double umsatz = 19700, rabattSatz = 3, rabattInEuro = umsatz * (rabattSatz / 100);

			if (umsatz < 10_000) {
				System.out.println("Der Umsatz betraegt " + umsatz
						+ "€ und ab einen Umsatz von 10.000€ ist ein Rabatt von " + rabattSatz + "% möglich"); // Variable statt konstanter Text
			} else {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten einen Rabattsatz von "
						+ rabattSatz + "% Sie sparen dadurch " + rabattInEuro + "€");
			}
		}
		{
			System.out.println("=== AK ===");
			double rabattSchwelle = 10_000;
			double umsatz = 17_500;
			int rabattSatz = 3;
			double rabattInEuro = (umsatz * rabattSatz) / 100;

			if (umsatz < rabattSchwelle) {
				System.out.println("Ihr Umsatz beträgt: " + umsatz + "€ beim Kauf weiterer Waren im Wert von: "
						+ (rabattSchwelle - umsatz) + "€ wird Ihnen ein Rabatt von: " + rabattSatz + "% gewährt!");
			} else {
				System.out.println("Auf grund Ihres Umsatzes von: " + umsatz + "€ wird Ihnen ein Rabatt von "
						+ rabattSatz + "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
			}
		}

		{
			System.out.println("=== ST ===");
			int rabattSatz = 0;

			double umsatz = 19_700, rabattInEuro = 0;

			if (umsatz >= 10_000) {
				rabattSatz = 3;
			} else {
				rabattSatz = 0;
				System.out.println(
						"***Hey, ab einem Einkaufswert von 10.000 € erhalten Sie zusätzliche 3% Rabatt auf Ihren Einkauf***\n");
			}

			rabattInEuro = (umsatz / 100) * rabattSatz;

			System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten somit einen Rabattsatz von: "
					+ rabattSatz + " %. \nSie Sparen dadurch " + rabattInEuro + " €");
		}
		{
			System.out.println("=== KK ===");
			double umsatz = 10_00;
			double rabatt = umsatz * 0.03;
			double rabattInEuro = umsatz - rabatt;

			if (umsatz >= 10_000) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten " + rabatt
						+ "€ Rabatt. Somit beträgt ihr Einkaufsbreis: " + rabattInEuro + "€");
			} else {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten keinen Rabatt.");
			}
		}
		{
			System.out.println("=== CB ===");
			int rabattSatz = 3;
			double umsatz = 19700, umsatzNachRabatt = 0, rabattInEuro = 0, fehlenderUmsatz = 0;

			if (umsatz < 10000) {
				fehlenderUmsatz = 10000 - umsatz;
				System.out.printf("Ihr momentaner Umsatz beträgt %.2f €.\n", umsatz);
				System.out.printf("Wenn Sie noch für mindestens %.2f € einkaufen, erhalten sie 3 %% Rabatt.\n",
						fehlenderUmsatz); // %% für % in printf, Achtung 3 ist Texte
			} else {
				rabattInEuro += umsatz / 100 * rabattSatz;
				umsatzNachRabatt = umsatz - rabattInEuro;

				System.out.printf("Sie haben für %.2f € bei uns eingekauft.\n", umsatz);
				System.out.printf("Daher erhalten Sie %.2f € Rabatt.\n", rabattInEuro);
				System.out.println("-------------------------------------------------");
				System.out.printf("Ihr Umsatz nach Abzug: %.2f €\n", umsatzNachRabatt);
			}
		}
	} // EndOfMain
}