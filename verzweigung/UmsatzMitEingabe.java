package verzweigung;

import javax.swing.JOptionPane;

public class UmsatzMitEingabe {

	public static void main(String[] args) {
//		Block_1:
			int rabattSatz/* = 0*/;
			double umsatz =0, rabattInEuro = 0;
			
//		Block_2:
			String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
			umsatz = Integer.parseInt(eingabe);
			
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
