package oop.kapselung.defaultTest;

import oop.kapselung.Klasse;
//import oop.kapselung.PackageVersuch; // funktioniert nicht, da PackageVersuch nicht public sein darf => 
import oop.kapselung.*; // alle Klassen sind erreichbar in dem Package, die sichtbar sind.

public class DefaultTest  {
	public static void main(String[] args) {
		Klasse k;
		Klasse klasse = new Klasse();
//		klasse.zahl; // CF private  
//		klasse.name="Susi"; // CF default(ohne String name;)
//		klasse.umsatz=100_00; // The field Klasse.umsatz is not visible
		klasse.artikelNr=1;
		AusserhalbSichtbar a;
	}
}

class Child extends Klasse{
	public static void main(String[] args) {
		Child c = new Child();
		c.umsatz=1;//ist protected in class Klasse- können wir zugreifen
	}
}