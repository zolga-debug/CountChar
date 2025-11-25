package oop.kapselung;

public class Sichtbarkeit { // 

	public static void main(String[] args) {
		Klasse klasse = new Klasse();
//		klasse.zahl=1; // CF: The field Klasse.zahl is not visible
		klasse.name="Otto"; // sichtbar, da in demselben Package
		klasse.umsatz=1_000;
		klasse.artikelNr=1;
	}
}
//class Klasse {
//	private int zahl;
//	String name; // default
//	protected double umsatz;
//	public long artikelNr;
//}
//





