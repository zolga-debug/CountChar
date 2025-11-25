package methoden;

public class ArrayLaenge {

	public static void main(String[] args) {
//		Übung:
//		Bitte schreiben Sie eine M., die ein int-Array nimmt, dessen Länge ermittelt und diese zurück gibt.
//		Die M. soll arrayLaenge heissen.

		int[] meinArray = { 1, 2, 3, 4, 5 };
		System.out.println("Das Array ist: " + arrayLaenge(meinArray) + " Zeichen/Int lang."); // KK, AK, ST, CB
		meinArray=null;
		System.out.println("Das Array ist: " + arrayLaenge(meinArray) + " Zeichen/Int lang."); // KK, AK, ST, CB
	}
//
//	static int arrayLaenge(int[] array) { // KK, AK, ST, CB
//		return array.length;
//	}
//	Übung: Bitte sichern Sie die M. so ab, dass keine NPE geworfen wird.
//	static int arrayLaenge(int[] array) { // ST
//		if(array != null){
//			return array.length;
//		}
//		
//		return 0;
//	}
//	static int arrayLaenge(int[] array) { // KK
//	    if (array != null) {
//	        return array.length;
//	    }
//	    else {
//	        System.out.println("Das Array ist null.");
//	        return -1; // da unmöglich, zeigt -1 einen Fehler an.
//	    }
//	}
//	static int arrayLaenge(int[] array) { // CB
//		if (array == null) { return 0; }
//		return array.length;
//	}
	
	static int arrayLaenge(int[] array) { // GT
		if (array == null) {
			System.out.println("Attention: Passed Array is null.");
			return -1;
		}
		return array.length;
	}
	
}
