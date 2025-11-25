package methoden.rekursion;

public class Stackoverflow_static {
	static int i = 5;
	public static void main(String[] args) {
		m();
		System.out.println("Fertig");
	}
	static void m() {
		if (i>0) {
			i--;
			System.out.println(i);
			m();
		}
	}
}

// Übung:Bitte verwenden Sie keine Klassenvariable, sondern eine Instanz-Variable.
public class Stackoverflow_nonstatic {
	 
	int i = 5;
	
	public static void main(String[] args) {
		
		Stackoverflow_nonstatic sof = new Stackoverflow_nonstatic();
		sof.m();
		System.out.println("Fertig");
	}
	 void m() {
		if(i>0) {
			i--;
			System.out.println(i);
			m();
			
		}
	}
}
 
