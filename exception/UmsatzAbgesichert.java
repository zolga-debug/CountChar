package exception;

import javax.swing.JOptionPane;

public class UmsatzAbgesichert { // Ohne Exception handle or declare

	public static void main(String[] args) {
		{
			// Rabattsatz in Abhängigkeit vom Umsatz
			// Umsatz (€) Rabattsatz (%)
//	    ab 0            0
//	    ab 10.000       3  => meint inkl. 10.000€ (Info an den Kunden, das Umsatz 9700€ beträgt und ab 10.000€ 3% Rabatt mögl. sind)
			int rabattSatz = 0;
			double umsatz = 0, rabattInEuro = 0;
			boolean korrekt = false;
//	    gewünschte Ausgabe: Sie haben für y € eingekauft und erhalten einen Rabattsatz von z. Sie sparen dadurch w €

//			Übung: 
//			Bitte lesen Sie einen Umsatz von der Tastatur ein, der dann weiter verarbeitet wird.
//			Bitte sichern Sie evtl. Fehleingaben ob, so dass kein PRG-Abbruch (rote Schrift) passieren.
//			Dabei können Sie alles verwenden, das wir bislang hier gelernt haben - kein Exception-Handling.
			
			
		    while(!korrekt) {
		    	String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
			  		    	
			   if (eingabe == null) {
				JOptionPane.showMessageDialog(null, "Eingabe abgebrochen.");
                return;
            }
			eingabe = eingabe.trim().replace(",", ".");

            // Проверка: именно десятичное число (обязательно точка и цифры после неё)
            if (eingabe.matches("-?\\d+(\\.\\d+)?")) {
                umsatz = Double.parseDouble(eingabe);
                korrekt = true;
            } else {
                JOptionPane.showMessageDialog(null, "Bitte eine gültige Dezimalzahl eingeben! (z.B. 12.34)");
            }
        }
//		Block_3:
			if (umsatz < 10_000) { // Andere Reihenfolge der geschachtelten Fallunterscheidungen
	            rabattSatz = 0; // CleanCode: schlanke Lösung
	        } else if (umsatz < 20_000) {
	            rabattSatz = 3;
	        } else {
	            rabattSatz = 5; // Kommentar entfernt
	        }
	 
//		Block_4:
	        rabattInEuro = umsatz * (rabattSatz / 100.0); // CleanCode: schlanke Lösung
	 
//		Block_5:
	        System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten einen Rabattsatz von "
	                + rabattSatz + " %. Sie sparen dadurch " + rabattInEuro + " €.");    // CleanCode: schlanke Lösung
	}

}

		
		
		
	} // EndOfMain
