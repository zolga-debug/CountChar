package oop.AutosZaelen;

public class AutosZaelen {

	public static void main(String[] args) {
//		Auto a1 = new Auto();
//		a1.anzahl++;
//		Auto a2 = new Auto();
//		a2.anzahl++;
		
		new Auto(); 
		new Auto(); 
		new Auto(); 
		// Inkrement bei anzahl soll auch hier erfolgen.
		System.out.println("Es wurden "+Auto.anzahl+ " Autos gebaut.");
	}

}
class Auto{
	static int anzahl; // Klassen-Variable gehört nicht zu den Objekten sondern zur Klasse
	
	Auto(){// weil Klasse default ist
        anzahl++;  // щоразу при створенні авто — збільшуємо лічильник
    }


}

// Übung: Bitte automatisieren Sie das Hochzählen der Variablen anzahl immer dann, wenn ein Auto gebaut wurde.

