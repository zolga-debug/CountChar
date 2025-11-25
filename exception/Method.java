package exception;

public class Method {

	public static void main(String[] args) {
		m();
	}
	static void m() {
		int i = 7/0;
	}
}
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at exception.Method.m(Method.java:9)
//at exception.Method.main(Method.java:6)