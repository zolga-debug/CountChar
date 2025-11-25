package verzweigung;

import javax.swing.JOptionPane;

public class Ternaer {

	public static void main(String[] args) {
		{

			boolean regen = false;
//		regen = true;
			System.out.println("Es regnet" + (regen ? "." : " nicht."));

			String ausgabe = "Es regnet" + (regen ? "." : " nicht.");
			System.out.println(ausgabe);

			double umsatz = 10000;
			int rabattSatz = umsatz < 10_000 ? 0 : 3;

		}
		{
			System.out.println("=== Übung: bitte unterscheiden Sie 3 Rabatte und verwenden den ternären Operator ===");
			// Übung
			// Rabattsatz in Abhängigkeit vom Umsatz
			// Umsatz (€) Rabattsatz (%)
//		    ab 0            0
//		    ab 10.000       3  
//		    ab 20.000       5 

			int rabattSatz = 0;
			double umsatz = 9999, rabattInEuro = 0;

		}
		{
			System.out.println("==== ST ====");
			System.out.println("=== Übung: bitte unterscheiden Sie 3 Rabatte und verwenden den ternären Operator ===");

			String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");

			double umsatz = Integer.parseInt(eingabe);

			//@formatter:off
			int rabattSatz = 
				umsatz < 10_000 ? 0 :
					umsatz < 20_000 ? 3 : 
						umsatz < 30_000 ? 5 : 
							umsatz < 50_000 ? 7 : 
								umsatz < 70_000 ? 10 : 15;
			//@formatter:on

			double ersparnis = (umsatz / 100) * rabattSatz;

			System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten somit einen Rabatt in Höhe von "
					+ rabattSatz + "%\nSomit haben Sie ein Ersparnis von :  " + ersparnis + "€");

		}
		{
			System.out.println("==== AK ====");
			String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den gewuenschten Umsatz ein:");
			int umsatz = Integer.parseInt(eingabe);
			
			int rabattSchwelle10K = 10_000;
			int rabattSchwelle20K = 20_000;
			int rabattSchwelle30K = 30_000;
			int rabattSchwelle50K = 50_000;
			int rabattSchwelle70K = 70_000;
			
			int rabattSatz =0;
			double rabattInEuro = 0;
			
			System.out.println("Ihr Umsatz bertägt "+umsatz+"€");
			//@formatter:off
			rabattSatz =
					(umsatz >= rabattSchwelle70K) ? 15 : // von oben nach unten
						(umsatz >= rabattSchwelle50K) ? 10 :
							(umsatz >= rabattSchwelle30K) ? 7 :
								(umsatz >= rabattSchwelle20K) ? 5 :
									(umsatz >= rabattSchwelle10K) ? 3 : 0;
			//@formatter:on
			
			rabattInEuro = (umsatz * rabattSatz) / 100;
			
			System.out.println("Ihnen wurde ein Rabatt von: "+rabattSatz+"% gewährt");
			System.out.println("Dies entspricht einer Ersparnis von: "+rabattInEuro+"€");			
			System.out.println("Vielen Dank für den Einkauf!");
		}
			{
				System.out.println("==== DA ====");
				String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den gewuenschten Umsatz ein:");
				double umsatz = Integer.parseInt(eingabe);
				
				
				double rabatt = (umsatz >= 20_000) ?  5 :
								(umsatz >= 10_000) ?  3 :
								 0;
				
				double rabattInEuro = umsatz * (rabatt / 100);
				
				System.out.printf("Sie haben für %.2f € eingekauft und erhalten einen Rabattsatz von "
						+ "%.1f %% Sie sparen dadurch %.2f €\n.", umsatz, rabatt, rabattInEuro);
	 
			}
		}
	} // RndOfMain

}
