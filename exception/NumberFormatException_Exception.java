package exception;

public class NumberFormatException_Exception {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1€")); // NumberFormatException: For input string: "1€"
	}
}
