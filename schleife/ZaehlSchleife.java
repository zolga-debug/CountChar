package schleife;

public class ZaehlSchleife {

	public static void main(String[] args) {
		{
			for (int i = 0; i < 3; i++) /*{*/ // Standardfall
				System.out.print(i);
			/*}*/

//		System.out.println(i); // CF: out of scope

		}
		{
			System.out.println("\n-------------------------");
			int i;
			for (i = 0; i < 3; ++i) {
				System.out.print(i);
			}
			System.out.println(i);
		}
		{
			System.out.println("-------------------------");
			int i = 0;
			for (   ; i < 3; i++) {
				System.out.print(i);
			}
			System.out.println(i);
		}
		{
			System.out.println("-------------------------");
			int i = 0;
			for (; i < 3;/* i++ */) {
				System.out.print(i);
				i++;
			}
			System.out.println(i);
		}
		{
			System.out.println("-------------------------");
			int i = 0;
			for (; i < 3;/* i++ */) {
				System.out.print(i);
				++i;
			}
			System.out.println(i);
		}
		{
			/*
			 * System.out.println("-------------------------"); int i=1; for ( ; true ; ) { System.out.print(i); ++i; } // System.out.println(i);
			 */
		}

		{
			System.out.println("------ Übung: 0 - 9 nebeneinander -------------------");

		}
		{
			System.out.println("==== ST ====");
			for (int i = 0; i <= 9; i++) {
				System.out.print(i + "|");
			}
		}
		{
			System.out.println("\n==== AK===");
			for (int i = 0; i <= 900; i = i + 100) {
				System.out.print(i / 100);
			}
			System.out.println();
		}
		{
			System.out.println("==== DA===");
			int i = 0;
			for (; i < 10;) {
				System.out.print(i);
				++i;
			}
		}
		System.out.println("=== Übung: Bitte die Zahlen von 0 bis 9 addieren und nur die Summe ausgeben ===");
		{
			System.out.println("=== CB ===");
			int sum = 0;

			for (int i = 0; i < 10; i++) {

				sum += i;

			}

			System.out.println(sum);

		}
		{
			System.out.println("=== ST, AK ===");
			int summe = 0;
			for (int i = 0; i <= 9; i++) {

				summe = summe + i;

				System.out.print(summe + "|");
			}

		}
		{
			System.out.println("\n=== KK ===");
			int summe = 0;
			for (int i = 0; i <= 9; i++) {
				summe += i;
			}
			System.out.print(summe);

		}
		{
			System.out.println("\n=== OZ ===");
			int sum = 0;
			int n = 9;

			for (int i = 0; i <= n; i++) {
				sum += i;
			}
			System.out.println("Die Summe der Zahlen von 0 bis " + n + " ist: " + sum);
			System.out.println("Probe: " + (n * n + n) / 2);
		}
		{
			System.out.println("=== Übung ===");
			// Bitte geben Sie die Zahlen von 0 bis 9 untereinander aus.
			// Neben jeder Zahl soll die Summe aus der Addition mit sich selbst stehen.
			// 0 0
			// 1 2
			// 2 4
			// 3 6
			// . .
			// . .
			// . .
			// 9 18
			// Bitte mit for-Schleife realisieren.
		}
		{
			System.out.println("\n=== KK, AK ===");
			for (int i = 0; i <= 9; i++) {
				System.out.println(i + " | " + (i + i));
			}

		}
		{
			System.out.println("\n=== ST, TS ===");
			int summe = 0;
			for (int i = 0; i <= 9; i++) {

				summe = i + i;

				System.out.println(i + "|" + summe);
			}

		}
		{
			System.out.println("\n=== CB ===");
			{
				System.out.println("Zahl | *2 | *Zahl");
				System.out.println("-----------------");
				for (int i = 0; i < 10; i++) {
					System.out.printf("%2d %6d %5d\n", i, i * 2, i * i);
				}
			}
		}
		{
			System.out.println("\n=== DA ===");
			for (int i1 = 0; i1 < 10; i1++) {

				System.out.println(i1 + " " + i1 * 2);
			}
		}
		System.out.println("\n======== Übung ==========================");
		// Übung:
		// Bitte geben Sie die Zahlen von 9 bis 0 nebeneinander aus - mit der for-Schleife.
		// Zwischen den Ziffern soll sich ein Leerzeichen befinden.
//	    Gesucht sind 2 Lösungen
//	    1.) einfache wie gewohnt
//	    2.) kompliziert: mit leerem Deklarations- und Initialisierungsblock und ohne Update-Zone
		// for ( /* bleibt leer */ ; i >= 0; /* bleibt leer */ ) {

		// hier kommt Ihre Lösung hin: Zahlen von 9 bis 0 nebeneinander mit Leerzeichen dazwischen aus.

		// }
		{

			int i = 0;
			for (; i > 0;) {
				// hier kommt Ihre Lösung hin: Zahlen von 9 bis 0 nebeneinander mit Leerzeichen dazwischen aus.

			}
		}
		{
			System.out.println("\n=== KK ===");

			System.out.println("Lösung 1:");
			for (int i = 9; i >= 0; i--) {
				System.out.print(i + " ");
			}

			System.out.println("\n--------------------\nLösung 2:");
			int i = 9;
			for (; i >= 0;) {
				System.out.print(i + " ");
				i--;
			}

		}
		{
			System.out.println("\n=== AK ===");
			System.out.println(" ----Variante 1---- ");
			for (int i = 0; i <= 9; i++) {
				System.out.print(i + " ");
			}

			System.out.println();
			System.out.println();

			System.out.println(" ----Variante 2---- ");
			int i = 0;
			for (; i <= 9;) {
				System.out.print(i + " ");
				i++;
			}

		}

		{
			System.out.println("\n=== CB ===");
			{
				/* Lösung 1 - Einfach */
				System.out.println("Lösung 1 - Einfach");

				for (int i = 9; i >= 0; i--) {
					System.out.print(i + " ");
				}

				/* Lösung 2 - unnötig kompliziert */
				System.out.println("\n\nLösung 2 - unnötig kompliziert");

				int number = 9;

				for (; number >= 0;) {
					System.out.print(number + " ");
					number--;
				}
			}

		}

		{
			System.out.println("\n=== ST ===");
			{
				for (int i = 9; i >= 0; i--) {
					System.out.print(i + " ");
				}
			}

			{
				System.out.println("\n");
				int i = 9;
				for (; i >= 0;) {

					System.out.print(i + " ");
					i--;
				}
			}
		}
		{
			System.out.println("\n=== DA ===");
			int i1 = 10;
			for (; i1 > 0;) {
				i1--;
				System.out.print(i1 + " ");

			}
		}
		{
			System.out.println("===== Übung =====");
		//  Übung:
			//Bitte geben Sie die Zahlen von 9 bis 0 nebeneinander aus - mit der for-Schleife.
			//Zwischen den Ziffern soll sich ein Komma und ein Leerzeichen befinden: 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 OHNE letztem Komma

			//for (int i = 9; i >= 0; i--) ...
		}
		
		{
			System.out.println("===== AK =====");
			int i;
			for (i = 9; i > 0; i--) { //  tricky wg. > und nicht >=
				System.out.print(i+", ");	
			}
			System.out.println(i);
		}
		{
			System.out.println("===== KK, ST, TS =====");
    		for (int i = 9; i >= 0; i--) {
    			if (i >=1) {
    				System.out.print(i + ",");
    			}
    			else {
    				System.out.print(i);
    			}
    		}
 
		}
		{
			System.out.println("===== DA =====");
			{
				//  Übung:
							//Bitte geben Sie die Zahlen von 9 bis 0 nebeneinander aus - mit der for-Schleife.
							//Zwischen den Ziffern soll sich ein Komma und ein Leerzeichen befinden: 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 OHNE letztem Komma
		 
							//for (int i = 9; i >= 0; i--) ...
					
					for(int i1 = 9; i1 > -1 ;i1--) {
						if(i1 < 1) {
							System.out.print(i1);
						}else
							System.out.print(i1 + ", ");			
					}
				}
				System.out.println("==== mit case =============");
				{
					for(int i1 = 9; i1 > -1 ;i1--) {
						switch(i1) {
						case 0: System.out.print(i1);
						break;
						default:
							System.out.print(i1 + ", ");
						}				
					}
				}
		 
		}
		System.out.println("===== CB =====");
		{
			{
				for (int i = 9 ; i >= 0 ; i--) {
					
					System.out.print(i);
					
					if (i != 0) {
						System.out.print(", ");
					}
				}
			}
			
		}
		System.out.println("===== GT =====");
		{
				for (int g = 0; g <= 9; g++) {
					if (g < 9) {
						System.out.print(g + " \u2605, "); // 65.536 mögl. Zeichen mit 16 Bit
					} else {
						System.out.print(g);
					}
				}
		 
			}
		 
	} // E
}
