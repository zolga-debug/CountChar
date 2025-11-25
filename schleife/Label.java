package schleife;

public class Label {

	public static void main(String[] args) {
		//@formatter:off
//		outer: // line 0
//			//@formatter:on
//			System.out.println(); // CF in line 2, wenn Label sich nicht direkt vor der Schl. befindet
//		for (int i = 0; i < 2; ++i) {
//			for (int j = 0; j < 3; j++) {
//				if (j == 1) {
//					continue outer; // line 2
//				}
//				System.out.println("i: " + i + "\tj: " + j); //
//			}
//		}
//		System.out.println("-------");
		//@formatter:off
		outer: // line 1
			//@formatter:on
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 3; j++) {
					if (j == 1) {
						continue outer; // springt zu line 1, nicht line 0, da Label direkt vor Schleife stehen muss
					}
					System.out.println("i: " + i + "\tj: " + j); //
				}
			}
		
		System.out.println("-------");
		//@formatter:off
		outer: // line 1
			//@formatter:on
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 3; j++) {
					System.out.println("i: " + i + "\tj: " + j); //
					if (j == 1) {
						break outer; 
					}
				}
			}
		
		
		System.out.println("ENTE");
	}

}
