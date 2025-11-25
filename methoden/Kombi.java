package methoden;

import java.util.Random;

public class Kombi {

	public static void main(String[] args) {
		System.out.println(zufall(6)); // 0 ... 5
//		Übung: Bitte schreiben Sie eine Methode, die wuerfeln heisst und eine Zahl zw. 1 und 6 zurück liefert. 
	}

	static int zufall(int i) {
//		return new Random().nextInt(i); // Code den es zu verbessern gilt
//	     return new Random().nextInt(6) + 1; // KK
//	     return new Random().nextInt(i + 1); // DA: int value between 0 (inclusive) and the specified value (exclusive)
	    return new Random().nextInt(i); // ST mit Aufruf  System.out.println(wuerfeln(6) + 1);
	}

}

//// ===== CB =====
//public static void main(String[] args) {
//	wuerfeln();
//}
//
//static void wuerfeln() {
//	boolean isNull = true;
//	int diceRoll = new Random().nextInt(7);
//
//	while (isNull) {
//		if (diceRoll == 0) {
//			diceRoll = new Random().nextInt(7); // bei 0 erneut würfeln
//		} else {
//			isNull = false; // wenn nicht 0, nicht erneut würfeln
//		}			
//	}
//	System.out.println(diceRoll);	
//}
