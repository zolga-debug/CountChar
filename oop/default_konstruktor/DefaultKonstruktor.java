package oop.default_konstruktor;

public class DefaultKonstruktor {

	public static void main(String[] args) {
		Auto auto = new Auto(); // Default-Konstruktor
		Automobil mobil = new Automobil(); // Default-Konstruktor wird bei Anlage eines eigenen K. gelöscht.
		Automobil mobile = new Automobil(1);
	}

}
class Auto{}

class Automobil{
	int serienNr;
	
	public Automobil() { // Bei neuem K. sofort(!) NoArg-Konstr. erstellen
		// TODO Auto-generated constructor stub
	}
	
	Automobil(int serienNr){ // Ein K. heisst wie die Klasse und hat KEINEN Rückgabetypen.
		this.serienNr=serienNr;
	}
}