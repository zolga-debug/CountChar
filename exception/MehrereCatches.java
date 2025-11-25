package exception;

public class MehrereCatches {
	static String string;
//	static String string="";

	public static void main(String[] args) {
		try {
			System.out.println(string.charAt(0));
		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Es ist ein Fehler aufgetreten.");
			System.out.println("Es ist eine nicht verfügbare StringPosition angesprochen worden.");
		} catch (NullPointerException e) {
//			System.out.println("Es ist ein Fehler aufgetreten.");
			System.out.println("Es gibt kein Objekt."/*+nr*/+"!");
//			e.getMessage();
//			e.printStackTrace();
			e.getCause();
			System.out.println(e.getCause()); // null
			System.out.println(e);
		}
	}

}
