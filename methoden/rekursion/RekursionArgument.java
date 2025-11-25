package methoden.rekursion;

public class RekursionArgument {
	public static void main(String[] args) {
		m(5);
		System.out.println("Fertig");
	}
	static void m(int i) {
		if (i>0) {
			i--;
			System.out.println(i);
			m(i);
		}
	}
}
