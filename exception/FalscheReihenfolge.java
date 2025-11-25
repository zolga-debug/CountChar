package exception;

public class FalscheReihenfolge {
	static String string;
	public static void main(String[] args) {
		try {
			string=" ";
			int laenge = string.length();
			char zeichen = string.charAt(laenge/*-1*/);
		} catch (Exception e) {
			System.out.println("Es ist ein Fehler aufgetreten.");
		} catch (StringIndexOutOfBoundsException e) { // CF: Unreachable catch block for StringIndexOutOfBoundsException. It is already handled by the catch block for Exception
			System.out.println("Es wurde eine StringIndexOutOfBoundsException geworfen");
		}
	}
}
