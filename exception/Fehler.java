package exception;

public class Fehler {

	public static void main(String[] args) {
		try {
			System.err.println("G");
		 try {
			System.err.println("B");
			System.err.println(9/0); // Ausnahme
			System.err.println("H");
		} catch (ArithmeticException hallo) {
			System.err.println("D");
//			Übung: Bitte werfen Sie einen Fehler mit dem Info-Text: "Ich bin ein Fehler
			throw new Error("Ich bin ein Fehler"); // Fehler
//			System.err.println("I");
		} catch (Error hallo) {
			System.err.println("J");
			System.err.println("Fehler gefangen");
		}
		System.err.println("C");
	} catch (Error welt) {
		System.err.println("A"+welt);
	}
		
		System.err.println("K");
	} // EOM

}
//GBDAjava.lang.Error:Ich bin ein FehlerK