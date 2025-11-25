package funky.endet_mit_string;

public class EndetMitString {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie ein funk. Interf. (EndetMit) mit der Methode m.
	//  Sie soll zwei Strings nehmen und einen Wahrheitswert zurück geben:
//	    true, wenn der erste String mit dem zweiten String endet - andernfalls false.
	 
	//  Erweiterung:
	    // Bitte verwenden Sie nicht die Methode endsWith sondern bilden das
	    // Funktionieren mit den Funktionen substring() und length() ... nach.
         FuncInt vergleich;
		
		vergleich = (String one, String two) -> {
			if (two.length() > one.length()) return false;
			String endevonOne = one.substring(one.length()- two.length());
			return endevonOne.equals(two);
			
		};
		
		System.out.println("Vergleiche mit verschiedenen Fällen:");
		System.out.println("Fall 1: \"HalloWelt\" endet mit \"Welt\"(Erwartet):"+ (vergleich.similar("HalloWelt", "Welt")
         ? "Ja" : "Nein"));
		System.out.println("Fall 2: \"HalloWelt\" endet mit \"Hallo\"(Erwartet):"+ (vergleich.similar("HalloWelt", "Hallo")
		         ? "Ja" : "Nein"));
		
	}
	
	interface FuncInt{
		boolean similar(String one, String two);
	}
			}


