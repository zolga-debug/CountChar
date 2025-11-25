package exception;

public class HandleInMethod {

	public static void main(String[] args) {
		m();
	}
	static void m() {
		try {
			int i = 7/0;
		} catch (ArithmeticException e) { 
			e.printStackTrace();
			System.err.println("Handle in M.");
		}
	}

}
