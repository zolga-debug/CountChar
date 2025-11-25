package api;

public class StringMethoden {

	public static void main(String[] args) {
		int[] ia = {};
		int Laenge = ia.length;
		String s = "Hallo";
		int laenge = s.length();
//	    public int length() { // API
//	        return value.length;
//	    }
		System.out.println(Laenge + laenge);

		System.out.println("Hallo Welt".length());

		char[] text = { 'H', 'a', 'l', 'l', 'o' };
		String string = new String(text);

		System.out.println(string.charAt(4)); // n-1

//		Übung: Bitte geben Sie die Buchstaben des Arrays text durch ein Komma getrennt mit einer Schleife Ihrer Wahl nebeneinander aus.
		System.out.println("==== AK ====");
		for (int i = 0; i < text.length; i++) {
			if (i < text.length - 1) {
				System.out.print(text[i] + " Komma ");
			} else
				System.out.print(text[i]);
		}
		System.out.println();

		System.out.println("==== KK ====");
		for (int i = 0; i < text.length; i++) {
			System.out.print(text[i] + ",");

		}

		System.out.println("==== CB ====");
		for (int i = 0; i < text.length; i++) {
			if (i < text.length - 1) {
				System.out.print(text[i] + ", ");
			} else {
				System.out.print(text[i]);
			}

		}

//		Übung: Bitte geben Sie die Buchstaben des Strings string durch ein Komma getrennt mit einer Schleife Ihrer Wahl nebeneinander von hinten nach vorne aus: o, l, l, a, H
//		
		System.out.println("==== KK ====");
//        char[] text = {'H', 'a', 'l', 'l', 'o'};
//        String string = new String(text);

		for (int i = text.length - 1; i >= 0; i--) { // Array nicht String
			if (i >= 1) {
				System.out.print(text[i] + ",");
			} else {
				System.out.println(text[i]);
			}
		}

		System.out.println("==== CB, AK ====");
		for (int i = string.length() - 1; i >= 0; i--) {
			if (i > 0) {
				System.out.print(string.charAt(i) + ", ");
			} else {
				System.out.print(string.charAt(i));
			}
		}

		System.out.println("\n==== DA ====");
		int a = -1;
		for (int i = 4; i > a; i--) { // Test auf -1 da > statt >=
			if (i > 0) {
				System.out.print(string.charAt(i) + ",");
			} else {
				System.out.print(string.charAt(i));
			}
		}

//		Übung: Bitte schreiben Sie eine Klassen-Methode, die einen String und ein Zeichen nimmt und ein boolean zurück gibt.
//		In der Methode soll geprüft werden, ob der übergebene String mit dem übergebenen Zeichen endet.
//		Bitte verwenden Sie nur die String-Methoden length() und charAt().
		System.out.println(endenTest("Hallo", 'o')); // true
		
		System.out.println("==== KK ====");
		System.out.println(endenTest("Hallo", 'o')); // true
		System.out.println(endenTest("Hallo", 'a'));
		
		System.out.println(endenTest(null, 'a'));
		
		System.out.println("Hallo".endsWith("o"));
		System.out.println("Hallo".endsWith(""+'o'));
	}

//	System.out.println("==== KK ====");
//	public static boolean endenTest(String text, char c) {
//		if (text.length() == 0)
//			return false;
//		return text.charAt(text.length() - 1) == c;
//	}
	
//	System.out.println("==== ST ====");
//	public static boolean endenTest(String text, char zeichen) {
//		char letztesZeichen = text.charAt(text.length() - 1);
//		if (letztesZeichen == zeichen) {
//			return true;
//		} else {
//			return false;
//		}
//	}

	
//	System.out.println("==== AK ====");
//	static boolean endenTest(String string, char c) {
//		return string.charAt(string.length()-1) == c;
//	}
 
// Jetzt mit Absicherung gegen null
	
//	System.out.println("==== KK ====");
//    public static boolean endenTest(String text, char c) {
//        if (text == null || text.length() == 0) return false;
//        return text.charAt(text.length() - 1) == c;
//    }

//	System.out.println("==== ST ====");
//    public static boolean endenTest(String text, char zeichen) {
//		if ( text == null || text.length() == 0) {
//			return false;
//		}else {
//			char letztesZeichen = text.charAt(text.length() - 1);
//			return letztesZeichen == zeichen;
//		}
//	}
 
//	System.out.println("==== CB ====");
//	static boolean endenTest (String inputString, char inputChar) {
//		
//		boolean retBool = false;
//	
//		if (inputString != null) {
//			if (inputString.charAt(inputString.length() - 1) == inputChar) {
//			retBool = true;
//			}
//		}
//		return retBool;
//	}
 
	
//	System.out.println("==== AK ====");
	static boolean endenTest(String string, char c) {
		if (string == null) {
			System.out.println("Der String ist null");
			return false;
		}else if(string.isEmpty()){
			System.out.println("Der String ist Leer");
			return false;
		}else
		return string.charAt(string.length()-1) == c;
	}
 
 
	
	
}
