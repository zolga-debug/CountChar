package methoden.rekursion;

public class Stackoverflow { // StackOverflowError

	public static void main(String[] args) {
		m();
	}
	static void m() {
		m();
	}
}
