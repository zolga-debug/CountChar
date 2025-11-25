package funky.rueckgabeCB;

public class StringLaenge {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie einen Lambda-Ausdruck (und das dazugehörige Functional-Interface (FunkyInt)), der einen String nimmt und dessen Länge zurück gibt.
//	    Rufen Sie dann diese Methode mini() zum Testen auf.		
		 FunkyInt length = (word) -> {
	            if (word == null) {
	                return -1;  // если null → вернуть -1
	            }
	            return word.length();
	        };
	        String wort1 = "Superkalifragilistikexpialigetisch";
	        System.out.println("Wortlänge von \"" + wort1 + "\" ist: " + length.mini(wort1));

	        String wort2 = null;
	        System.out.println("Bei null ist Rückgabe: " + length.mini(wort2));
	    }

	    public interface FunkyInt {
	        int mini(String s);
	    }
	}
