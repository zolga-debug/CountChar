package exception;


public class Konstruktoren {

	public static void main(String[] args) {
		try {
			throw new RuntimeException("Ich bin eine RTE");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}