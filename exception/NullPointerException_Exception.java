package exception;

public class NullPointerException_Exception {
	static String string; // default value
	public static void main(String[] args) {
		System.out.println(string.charAt(0)); // NPE
	}
}
