package methoden.rekursion;

public class Stackoverflow_lokal {
	public static void main(String[] args) {
		m();
	}
	static void m() {
		int i = 5;
		if (i>0) {
			i--;
			m();
		}
	}
}
//at methoden.rekursion.Stackoverflow_lokal.m(Stackoverflow_lokal.java:11)
