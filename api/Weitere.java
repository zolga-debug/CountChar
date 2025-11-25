package api;

public class Weitere {

	public static void main(String[] args) {
//@formatter:off      
		              // 01234567
		String string = "animals";
		//@formatter:on
		System.out.println(string.charAt(1)); // n

		System.out.println(string.indexOf('a'));
		System.out.println(string.indexOf('a', 2)); // API: starting the search at the specified index.
		System.out.println(string.indexOf("a"));
		System.out.println(string.indexOf("al"));
		System.out.println(string.indexOf("t"));
		System.out.println(string.indexOf("a", 2)); // API: starting the search at the specified index.
		System.out.println(string.indexOf("a", 5)); // API: starting the search at the specified index.
		System.out.println(string.indexOf("a", -1)); // API: starting the search at the specified index.

//		Übung: Bitte schreiben Sie eine M., die alle Zeichen des übergeben Strings untereinander ausgibt.
//		rechts neben dem jeweiligen Zeichen soll die Anzahl des Vorkommens im String stehen.
//		Bsp.: Hallo
//		H	1
//		a	1
//		l	2
//		o	1

		System.out.println(" ".isEmpty());
		System.out.println("".isEmpty());
//	    public boolean isEmpty() {
//	        return value.length == 0;
//	    }

		System.out.println("Hallo".toLowerCase());
//		System.out.println(" ".isBlanc()); // in jüngerer Version

		System.out.println("Hallo".toUpperCase());

		System.out.println("abc".startsWith("a"));
		System.out.println("abc".startsWith("b", 1));
		System.out.println("Hallo".startsWith("l", 3));

		System.out.println("abc".contains("a"));
		System.out.println("abc".contains("B"));

		System.out.println("Hallo" + " " + "Welt");
		String s = "Hallo ".concat("Welt");
		System.out.println(s);

		String t = "Hallo";
		t.concat(" Welt"); // String ist nicht mutable
		System.out.println(t);

//	    public String concat(String str) {
//	        int otherLen = str.length();
//	        if (otherLen == 0) {
//	            return this;
//	        }
//	        int len = value.length;
//	        char buf[] = Arrays.copyOf(value, len + otherLen);
//	        str.getChars(buf, len);
//	        return new String(buf, true);
//	    }

		t = t.concat(" Welt"); // nötig da immutable
		System.out.println(t);

		String a = "Hallo";
		String b = "Welt";

		a = a.concat(" ").concat(b).concat("!").toLowerCase()/* .contains("!") */;
		System.out.println(a);
		boolean bol = a.concat(" ").concat(b).concat("!").toLowerCase().contains("!");

	//@formatter:off
	boolean boly =a.
			concat(" ").
			concat(b).
			concat("!").
			toLowerCase().
			contains("!");
	//@formatter:on

		System.out.println("abcabc".replace('a', 'A'));
		System.out.println("abcabc".replace("ab", "AB"));
		System.out.println("abcabc".replace("st", "AB"));

		System.out.println("   Text   ".trim().concat("!"));
		System.out.println("   Text   und  noch  ein Text".trim().concat("!"));

//	Übung: Bitte schreiben Sie eine Klassen-Methode, die einen String nimmt und darin alle vorkommenden Leerzeichen (auch die zwischen Textteilen) löscht.
//	Um dann diesen neuen String zurückzugeben.
//	Der Name sei: trimPlus()

		System.out.println(trimPlus("   Text   und  noch  ein Text"));

	} // E

//	static String trimPlus(String s) { // AK
//		String result = "";
//		for(int i = 0;i < s.length(); i++) {
//			if(s.charAt(i) != ' ' ) {
//				result = result.concat(""+s.charAt(i));
//			}
//		}
//		return result;
//	}

//	Refactor
//static String trimPlus(String text) { // ST
//		return text.replace/*All*/(" ", "");
//	}

	static String trimPlus(String input) { // CB
		if (input != null) {
			if (input.isEmpty()) {
				return "Im String stand nüschts";
			} else {
				return input.replace(" ", "");
			}
		} else {
			return "Der String war total leer, sozusagen NULL!";
		}

	}

}
