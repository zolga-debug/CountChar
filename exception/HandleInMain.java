package exception;

public class HandleInMain {
	public static void main(String[] args) {
		try {
			m();
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.err.println("Handle in aufrufender M.");
		}
	}
	static void m() throws ArithmeticException { // Hochleiten der Exc.
		int i = 3/0;
	}
}
