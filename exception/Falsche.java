package exception;

//public class LeeresCatch {
	public class Falsche {
	static String string;
	public static void main(String[] args) {
		try {
			System.out.println(string.charAt(0));
		} catch (StringIndexOutOfBoundsException $hallo) {
			System.out.println("gefangen");
		}
		
	}

}
