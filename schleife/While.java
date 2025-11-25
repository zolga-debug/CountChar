package schleife;

public class While { // Heize solange wie Zieltemp. noch nicht erreicht ist.

	public static void main(String[] args) {{
//		for (int i = 0; i < 3; i++) 
		int i = 0;
		while (i<3) {
			++i;
			System.out.println(i);
		}}
		
	//  Übung:
	//  Bitte geben Sie die Zahlen von 1 bis 9 untereinander aus.
	//  In der Spalte daneben soll das Produkt aus der Zahl mit sich selbst erscheinen (Quadrieren)
	//  1     1
	//  2     4
	//  3     9
	//  4     16
		
		{
			System.out.println("=== KK ===");
	    	int i = 1;
	    	while (i<=9) {
	    		System.out.println(i + "\t" + (i*i));
	    		i++;
	    	}
	 
		}
		{
			System.out.println("=== ST ===");
			int i = 0;
			while (i < 9) { // OK, da Beginn bei 0 und zuerst inkrementieren
				i++;
				System.out.println(i + " | " + Math.pow(i, 2)); // power liefert double
			}
 
		}
		{
			System.out.println("=== CB ===");
			{	
				int number = 1;
				int numberEnd = 9;
				
				System.out.println("Nummer | *Nummer");
				System.out.println("================");
				
				while (number != numberEnd +1) {
					System.out.printf("%4d   | %4d\n", number, number * number);
					number++;		
				}	
			}
			 
		}
		{
			System.out.println("=== AK ===");
			int i = 1;
			System.out.println("Addieren\tQuadrieren\t");
			System.out.println("---------------------------");
			while (i <= 9) {
		
				System.out.println(i+" + "+i+" = "+(i+i)+"\t"+i+" * "+i+" = "+i*i);
				i++;
			}
	 
		}		
	} // E

}
