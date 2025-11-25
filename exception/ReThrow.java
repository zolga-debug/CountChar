package exception;

public class ReThrow { // nestedTry

	public static void main(String[] args) {
		try {
			try {
				System.err.print("A");
				System.out.print(4/0);
			} catch (Exception e) {
				System.err.print("B");
				throw e;
			}
		} catch (Exception e) {
			System.err.print("D");
		}
		System.err.print("C");
	}

}
