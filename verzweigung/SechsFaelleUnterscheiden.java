package verzweigung;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SechsFaelleUnterscheiden {

	public static void main(String[] args) {
		// Übung
		// Rabattsatz in Abhängigkeit vom Umsatz
		// Umsatz (€) Rabattsatz (%)
//	    ab 0            0
//	    ab 10.000       3  
//	    ab 20.000       5  
//		 ab 30.000 		7
//		 ab 50.000 		10
//		 ab 70.000 		15
//		ab 100k			20

		{
			System.out.println("=== quick 'n' dirty ===");
			int rabattSatz = 0;
			double umsatz = 9999, rabattInEuro = 0;
			
			if (umsatz < 10_000) {
				rabattSatz=0;
			} else {
				if (umsatz < 20_000) {
					rabattSatz=3;
				} else {
					if (umsatz < 30_000) {
						rabattSatz=5;
					} else {
						if (umsatz < 50_000) {
							rabattSatz=7;
						} else {
							if (umsatz < 70_000) {
								rabattSatz=10;
							} else {
								if (umsatz < 100_000) {
									rabattSatz=15;
								} else {
									rabattSatz=20;
								}
							}
						}
					}
				}
			}
	 
	        rabattInEuro = umsatz * (rabattSatz / 100.0); // CleanCode: schlanke Lösung
	 
//	        mit println()
	        System.out.println("println(): Sie haben für " + umsatz + " € eingekauft und erhalten einen Rabattsatz von "
	                + rabattSatz + " %. Sie sparen dadurch " + rabattInEuro + " €.");    // CleanCode: schlanke Lösung
	        
//	        mit printf()
	        System.out.printf("printf(): Sie haben für %,.2f € eingekauft und erhalten einen Rabattsatz von %d %%. Sie sparen dadurch %.2f €",umsatz,rabattSatz,rabattInEuro);
	        
		}
		
		
		
		// Block 1:
		{
			System.out.println("=== ST und DA ===");
			int rabattSatz = 0;
			double umsatz = 0, rabattInEuro = 0;

			// Block 2:
			String preisErmittlung = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
			umsatz = Integer.parseInt(preisErmittlung);

			// Block 3:
			if (umsatz < 10_000) { // Andere Reihenfolge der geschachtelten Fallunterscheidungen
				rabattSatz = 0; // CleanCode: schlanke Lösung

			} else if (umsatz < 20_000) {

				rabattSatz = 3;
			} else if (umsatz < 30_000) {

				rabattSatz = 5;
			} else if (umsatz < 50_000) {

				rabattSatz = 7;
			} else if (umsatz < 70_000) {

				rabattSatz = 10;
			} else {

				rabattSatz = 15;
			}

			// Block 3:
			rabattInEuro = umsatz * (rabattSatz / 100.0);

			// Block 4:
			System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten einen Rabattsatz von "
					+ rabattSatz + " %. Sie sparen dadurch " + rabattInEuro + " €.");
		}
		{
			System.out.println("=== TS ===");
			int rabattSatz = 0;
			double umsatz = 0, rabattInEuro = 0;

			String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
			umsatz = Integer.parseInt(eingabe);

			if (umsatz < 10_000) {
				rabattSatz = 0;
			} else if (umsatz < 20_000) {
				rabattSatz = 3;
			} else if (umsatz < 30_000) {
				rabattSatz = 5;
			} else if (umsatz < 50_000) {
				rabattSatz = 7;
			} else if (umsatz < 70_000) {
				rabattSatz = 10;
			} else {
				rabattSatz = 15;
			}

			rabattInEuro = umsatz * (rabattSatz / 100.0);

//	        Achtung: tricky: Concatinieren zu gesamten Format-String und %-Zeichen in %c (Char)
			System.out.printf("Sie haben für %.2f € eingekauft und erhalten einen Rabattsatz von " + rabattSatz
					+ " %c. Sie sparen dadurch %.2f €.", umsatz, '%', rabattInEuro);

		}
		{
			System.out.println("=== NR ===");
			int umsatz = 0;
			int rabattsatz;
			boolean gültigeEingabe = false;
			NumberFormat waehrung = NumberFormat.getCurrencyInstance(Locale.GERMANY);

			while (!gültigeEingabe) {
				String eingabe = JOptionPane.showInputDialog("Gib den Umsatz ein:");
				if (eingabe == null) {
					JOptionPane.showMessageDialog(null, "Dann halt nicht.");
					return;
				} else {
					try {
						umsatz = Integer.parseInt(eingabe);
						gültigeEingabe = true;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Ungültige Eingabe! Bitte gib eine ganze Zahl ein.");

					}
				}
			}

			if (umsatz < 10_000) {
				rabattsatz = 0;
			} else if (umsatz < 20_000) {
				rabattsatz = 3;
			} else if (umsatz < 30_000) {
				rabattsatz = 5;
			} else if (umsatz < 50_000) {
				rabattsatz = 7;
			} else if (umsatz < 70_000) {
				rabattsatz = 10;
			} else {
				rabattsatz = 15;
			}

			if (rabattsatz == 0) {
				JOptionPane.showMessageDialog(null,
						"Tja, dann zahlst du auch die ganzen " + waehrung.format(umsatz) + ".\nGeizhals");
			} else {
				int rabatt = (umsatz * rabattsatz) / 100;
				JOptionPane.showMessageDialog(null,
						"Wenn das so ist, dann zahlst du nur " + waehrung.format(umsatz - rabatt)
								+ ".\nDu kriegst also " + rabattsatz + "% Rabatt und sparst " + waehrung.format(rabatt)
								+ ".");
			}

		}
		{
			System.out.println("=== AK ===");
			String eingabe = JOptionPane.showInputDialog("Bitte geben Sie den gewuenschten Umsatz ein:");
			double umsatz = Integer.parseInt(eingabe);

			double rabattSchwelle10K = 10_000;
			double rabattSchwelle20K = 20_000;
			double rabattSchwelle30K = 30_000;
			double rabattSchwelle50K = 50_000;
			double rabattSchwelle70K = 70_000;

			int rabattSatz = 0;
			double rabattInEuro = 0;

			String weitereRabatte70k = "Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle70K - umsatz)
					+ "€ wird Ihnen ein Rabatt von: 15% gewährt!";
			String weitereRabatte50k = "Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle50K - umsatz)
					+ "€ wird Ihnen ein Rabatt von: 10% gewährt!";
			String weitereRabatte30k = "Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle30K - umsatz)
					+ "€ wird Ihnen ein Rabatt von: 7% gewährt!";
			String weitereRabatte20k = "Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle20K - umsatz)
					+ "€ wird Ihnen ein Rabatt von: 5% gewährt!";
			String weitereRabatte10k = "Beim Kauf weiterer Waren im Wert von: " + (rabattSchwelle10K - umsatz)
					+ "€ wird Ihnen ein Rabatt von: 3% gewährt!";

			System.out.println("Ihr Umsatz Beträgt " + umsatz + "€");

			if (umsatz >= rabattSchwelle70K) {
				rabattSatz = 15;
				rabattInEuro = (umsatz * rabattSatz) / 100;
				System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
						+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");

			} else {
				if (umsatz >= rabattSchwelle50K) {
					rabattSatz = 10;
					rabattInEuro = (umsatz * rabattSatz) / 100;
					System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
							+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
					System.out.println(weitereRabatte70k);
				} else {
					if (umsatz >= rabattSchwelle30K) {
						rabattSatz = 7;
						rabattInEuro = (umsatz * rabattSatz) / 100;
						System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
								+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
						System.out.println(weitereRabatte50k);
						System.out.println(weitereRabatte70k);
					} else {
						if (umsatz >= rabattSchwelle20K) {
							rabattSatz = 5;
							rabattInEuro = (umsatz * rabattSatz) / 100;
							System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
									+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
							System.out.println(weitereRabatte30k);
							System.out.println(weitereRabatte50k);
							System.out.println(weitereRabatte70k);
						} else {
							if (umsatz >= rabattSchwelle10K) {
								rabattSatz = 3;
								rabattInEuro = (umsatz * rabattSatz) / 100;
								System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
										+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
								System.out.println(weitereRabatte20k);
								System.out.println(weitereRabatte30k);
								System.out.println(weitereRabatte50k);
								System.out.println(weitereRabatte70k);
							} else {
								rabattSatz = 0;
								rabattInEuro = (umsatz * rabattSatz) / 100;
								System.out.println("Ihnen wird  ein Rabatt von " + rabattSatz
										+ "% gewährt, dies entspricht einer Ersparnis von " + rabattInEuro + "€");
								System.out.println(weitereRabatte10k);
								System.out.println(weitereRabatte20k);
								System.out.println(weitereRabatte30k);
								System.out.println(weitereRabatte50k);
								System.out.println(weitereRabatte70k);

//								for (int i = 10; i <= 70 ; i = i+10) {
//									String string = "weitereRabatte"+i+"K";
//									System.out.println(string);
//									
//							}

							}
						}
					}
				}
			}
			System.out.println("Vielen Dank für Ihren Einkauf bei uns !");

		}
		{
			System.out.println("=== KK ===");
			double umsatz = 0;
			double schwelleDrei = 10_000;
			double schwelleFuenf = 20_000;
			double schwelleSieben = 30_000;
			double schwelleZehn = 50_000;
			double schwelleFuenfzehn = 70_000;
			String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
			umsatz = Integer.parseInt(eingabe);
			double rabattDreiProzent = umsatz * 0.03;
			double rabattFuenfProzent = umsatz * 0.05;
			double rabattSiebenProzent = umsatz * 0.07;
			double rabattZehnProzent = umsatz * 0.1;
			double rabattFuenfzehnProzent = umsatz * 0.15;

			if (umsatz >= schwelleFuenfzehn) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 15% Rabatt\n"
						+ "Das entspricht: " + rabattFuenfzehnProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattFuenfzehnProzent) + "€");
			} else if (umsatz >= schwelleZehn) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 10% Rabatt\n"
						+ "Das entspricht: " + rabattZehnProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattZehnProzent) + "€");
			} else if (umsatz >= schwelleSieben) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 7% Rabatt\n"
						+ "Das entspricht: " + rabattSiebenProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattSiebenProzent) + "€");
			}

			else if (umsatz >= schwelleFuenf) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 5% Rabatt\n"
						+ "Das entspricht: " + rabattFuenfProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattFuenfProzent) + "€");
			} else if (umsatz >= schwelleDrei) {
				System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten 3% Rabatt\n"
						+ "Das entspricht: " + rabattDreiProzent + "€\n" + "Somit beträgt ihr Einkaufspreis: "
						+ (umsatz - rabattDreiProzent) + "€");
			} else {
				System.out.println("Sie haben für weniger als 10.000€ eingekauft und erhalten keinen Rabatt");
			}

		}
		{
			{
				System.out.println("=== CB ===");
				Scanner input = new Scanner(System.in);
				int discount01 = 3, border01 = 10_000;
				int discount02 = 5, border02 = 20_000;
				int discount03 = 7, border03 = 30_000;
				int discount04 = 10, border04 = 50_000;
				int discount05 = 15, border05 = 70_000;
				int currentDiscount = 0;
				double shoppingCart = 0;
				double discountAmount = 0;
				double cartAfterDiscount = 0;
				double missingAmount = 0;

				System.out.print("Der bisherige Warenkorb: ");
				shoppingCart = input.nextDouble();

				System.out.println("\n=========================================================");
				System.out.printf("Ihr momentaner Warenkorb bei uns beträgt %, .2f €.\n", shoppingCart);
				System.out.println("=========================================================\n");

				if (shoppingCart < border01) { // less than 10.000 €

					missingAmount = border01 - shoppingCart;

				} else if (shoppingCart < border02) { // less than 20.000 €

					missingAmount = border02 - shoppingCart;
					discountAmount = shoppingCart / 100.0 * discount01;
					cartAfterDiscount = shoppingCart - (discountAmount);
					currentDiscount = discount01;

				} else if (shoppingCart < border03) { // less than 30.000 €

					missingAmount = border03 - shoppingCart;
					discountAmount = shoppingCart / 100.0 * discount02;
					cartAfterDiscount = shoppingCart - discountAmount;
					currentDiscount = discount02;

				} else if (shoppingCart < border04) { // less than 50.000 €

					missingAmount = border04 - shoppingCart;
					discountAmount = shoppingCart / 100.0 * discount03;
					cartAfterDiscount = shoppingCart - discountAmount;
					currentDiscount = discount03;

				} else if (shoppingCart < border05) { // less than 70.000 €

					missingAmount = border05 - shoppingCart;

					discountAmount = shoppingCart / 100.0 * discount04;
					cartAfterDiscount = shoppingCart - discountAmount;
					currentDiscount = discount04;

				} else { // Above 70.000 €

					discountAmount = shoppingCart / 100.0 * discount05;
					cartAfterDiscount = shoppingCart - discountAmount;
					currentDiscount = discount05;

				}

				if (currentDiscount > 0) {
					System.out.printf("Ihr Warenkorb nach Abzug von %d %% Rabatt: %, .2f €\n", currentDiscount,
							cartAfterDiscount);
					System.out.printf("Das ist ein Rabatt von %, .2f €\n", discountAmount);
					System.out.println("---------------------------------------------------------");
				}

				if (currentDiscount != 15) {
					System.out.printf(
							"Wenn Sie noch für mindestens %, .2f € einkaufen, erhalten sie sogar %d %% Rabatt.\n",
							missingAmount, currentDiscount);
				}

				input.close();
			}

		}
		{
			System.out.println("=== GT ===");
			Scanner scanner = new Scanner(System.in);

			System.out.println("Bitte geben Sie ihren Umsatz in Euro ein: ");

			double umsatz = scanner.nextDouble();

			double rabattSatz;

			if (umsatz >= 70000) {

				rabattSatz = 15;

			} else if (umsatz >= 50000) {

				rabattSatz = 10;

			} else if (umsatz >= 30000) {

				rabattSatz = 7;

			} else if (umsatz >= 20000) {

				rabattSatz = 5;

			} else if (umsatz >= 10000) {

				rabattSatz = 3;

			} else {

				rabattSatz = 0;

			}

			System.out.printf("Sie haben für %.2f € eingekauft und erhalten einen Rabattsatz von %.1f%%.%n", umsatz,

					rabattSatz);

			scanner.close();

		}
	}

}
