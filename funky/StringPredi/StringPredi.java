package funky.StringPredi;

import java.util.function.BiPredicate;

public class StringPredi {

	public static void main(String[] args) {
//		Übung: Bitte schreiben Sie einen Lambda-Ausdruck, der 2 Strings nimmt und prüft, ob String 1 mit String 2 beginnt.
//	    Bitte verwenden Sie dazu ein BiPredicate.
//		Prüfen Sie bitte mit Test-Daten.
		
		BiPredicate<String, String> beginntMitPruefen = (wort1, wort2) -> wort2.startsWith(wort1); 
		
		
		String a ="Hallo";
		String b ="HalloWold";
		
		System.out.println(beginntMitPruefen.test(a, b));
		System.out.println(beginntMitPruefen.test(b, a));
		System.out.println("Beginnt \"" + a + "\" mit \"" + b + "\"? " + (beginntMitPruefen.test(a, b) ? "Ja" : "Nein"));
	}

}

//true
//false
//Beginnt "Hallo" mit "HalloWold"? Ja
