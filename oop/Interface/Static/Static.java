package oop.Interface.Static;

interface Hop{
	int m(); // abstr.
	static int getJumpHeigth() { // konkret
		return 8;
	}
}

public class Static {

	public static void main(String[] args) {
		statischeKlassenMethode(); // KlassenPrefix wahlweise
		System.out.println(Static.statischeKlassenMethode()); // CleanCode 
		System.out.println(AndereKlasse.m()); // KlassenPrefix  ist Pflicht
		System.out.println(Hop.getJumpHeigth()); // Prefix ist Pflicht
	}

	static String statischeKlassenMethode() {
		return "Hallo";
	}
	
}

class AndereKlasse{
	static String m() {
		return "Welt";
	}
}