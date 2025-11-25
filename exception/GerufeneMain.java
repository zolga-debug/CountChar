package exception;

public class GerufeneMain {

	public static void main(String[] args) /* throws ArithmeticException*/ {
		m();
	}

	static void m() /*throws ArithmeticException*/ { // kein CF mit oder ohne Declare
		throw new NullPointerException();
//		System.out.println(1/0); // VF: Unreachable code
	}
}
