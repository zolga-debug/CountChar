package exception;

public class LeeresCatch {
	static String string;
	public static void main(String[] args) {
		int i=0;
		try {
			int laenge = string.length();
			i++;
		} catch (NullPointerException e) {
//			leerer Catch-Block
		}
		System.out.println("PRG wird ohne Fehlermeldung fortgesetzt");
		System.out.println(i);
	}

}
