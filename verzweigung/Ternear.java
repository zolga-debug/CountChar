package verzweigung;

import javax.swing.JOptionPane;

public class Ternear {

	public static void main(String[] args) {
		{
		
		//		andere Übung
		String anrede;
		
		boolean regen=false;
		regen = true;
		System.out.println("Es regnet"+ (   regen   ?   "."   :   " nicht."   ));
		String ausgabe = "Es regnet" + ( regen ? "." :  " " +  "nicht.");
		System.out.println(ausgabe);
		
		double umsatz=10000;
		int rabattSatz = umsatz < 10_000 ? 0 : 3;
		
		}

		{	System.out.println("=== Übung: bitte unterscheiden Sie 3 Rabatte und verwenden den ternären Operator ===");
		
		int rabattSatz = 0;
		double umsatz = 9999, rabattInEuro = 0;
		
		rabattSatz = umsatz < 10_000 ? 0 : (umsatz < 20_000) ? 3 : 5;
            
              
 
        rabattInEuro = umsatz * (rabattSatz / 100.0);
 
        System.out.println("Sie haben für " + umsatz + " € eingekauft und erhalten einen Rabattsatz von "
                + rabattSatz + " %. Sie sparen dadurch " + rabattInEuro + " €.");   	
		}
		
    	{
		System.out.println("=== Übung: bitte unterscheiden Sie 3 Rabatte und verwenden den ternären Operator ===");
		
		String eingabe = JOptionPane.showInputDialog("Bitte den Umsatz eingeben");
		
		double umsatz = Integer.parseInt(eingabe);
		
		int rabattSatz = umsatz < 10_000 ? 0 : umsatz < 20_000 ? 3 : umsatz < 30_000 ? 5 : umsatz < 50_000 ? 7 : umsatz < 70_000 ? 10 : 15;
		
		double ersparnis = (umsatz / 100) * rabattSatz;
		
		
		System.out.println("Sie haben für " + umsatz + "€ eingekauft und erhalten somit einen Rabatt in Höhe von " + rabattSatz +
							"%\nSomit haben Sie ein Ersparnis von :  " + ersparnis + "€");
		
		
		
		
    	     }	
		
	
		
	    }	
			
		
		 
	}	//EndOfMain 
		
		


