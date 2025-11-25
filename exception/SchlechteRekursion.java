package exception;

public class SchlechteRekursion {

	public static void main(String[] args) {
		m();
	}

	static void m() {
		try {
			m(); // KEINE Fehler fangen
		} catch (Throwable e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Es ist ein Fehler aufgetreten: "+e.getClass().getSimpleName());
		}
//		m(); // StackOverflowError
	}
}
