package api;

public class ToString {

	public static void main(String[] args) {
		String einGruss = "Hallo";
//		String-Klasse verfügt nicht über eine reverse()-M.
//		Lös. 1: Mit einem kleinen PRG die Zeichen in umgekehrter Reihenfolge anordnen und wieder dem String zuweisen.
		StringBuilder temp = new StringBuilder(einGruss);
		temp.reverse();
		einGruss = temp.toString();
		System.out.println(einGruss); // alternatives Spanisch
		
		StringBuilder sb = "Hallo"; // CF
	}

}
