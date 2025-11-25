package exception;

import javax.swing.JOptionPane;
 
public class Division {
 
	public static void main(String[] args) {
		try {
			int dividen = Integer.parseInt(JOptionPane.showInputDialog("Bitte gebe den Dividen ein:"));
			int divisor = Integer.parseInt(JOptionPane.showInputDialog("Bitte gebe den Divisor ein:"));
			int division = dividen / divisor ;
			System.out.println(division);
		}
		catch(NumberFormatException e) {
			System.out.println("Bitte eine Zahl eingeben");
		}
		catch(ArithmeticException e) {
			System.out.println("Division durch 0 ist nicht erlaubt");
 
		}
	}
 
}
 
 