package exception;

public class ThrowsOnly {

	public static void main(String[] args) throws ArithmeticException{
		m();
	}
	static void m()throws ArithmeticException{
		int i= 9/(6-3*2);
	}
}
