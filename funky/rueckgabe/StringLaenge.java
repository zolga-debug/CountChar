package funky.rueckgabe;

public class StringLaenge {

	public static void main(String[] args) {
	//  Übung: Bitte schreiben Sie einen Lambda-Ausdruck (und das dazugehörige Functional-Interface (FunkInt)), der einen String nimmt und dessen Länge zurück gibt.
//	    Rufen Sie dann diese Methode mini() zum Testen auf.
		FunkInt text = (String sun) ->  sun.length(); 
		String sun = "nkjdfekhfäekfhäefh";
		
		System.out.println("Die länge des Text ist: " + text.mini(sun));
	}

   interface FunkInt{
   int mini(String s);
    }
}