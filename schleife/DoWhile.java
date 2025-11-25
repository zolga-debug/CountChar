package schleife;

public class DoWhile {

	public static void main(String[] args) {
		
		do
			System.out.println("Drin");
		while (false);
		
	//  Übung 1:
		//Bitte geben Sie die Zahlen von 9 bis 1 untereinander aus.
		//In der Spalte daneben soll das Produkt aus der Zahl mit sich selbst erscheinen (Quadrieren)

		//9     81
		//8     64
		//7     49
		//6     36
		// ....
//		    hier kommt ihre Lösung hin
		
		{
			System.out.println("=== ST ===");
			int i = 9;
			int unterGrenze = 1;
			
			do {
				System.out.println(i + " | " + (i * i));
				i--;
			}
				
			while (i >= unterGrenze);
	 
		}
		{
			System.out.println("=== Ak ===");

			int x = 9;
			do {
				System.out.println(x+"² = "+(int)Math.pow(x, 2)); // Alt-gr + 2
				x--;
			}while(x >= 1);
	 
	 
		}
		{
			System.out.println("=== CB ===");
			{	
				int number = 9;
				System.out.println("Number | *Number");
				System.out.println("================");
				
				do {
					System.out.printf("%4d   | %5d\n",number, number * number);
					number--;
				} while (number > 0 );
			}
			 
			{
				System.out.println("=== IT ===");
				int i = 9;
				do {
		            System.out.println(i + "     " + (int) Math.pow(i, 2)); // wg.double
		            i--;
				} while (i > 0);
			}
		}
		{
			System.out.println("=== NR ===");
			int x = 9;
			do
				System.out.println(x + " " + x*x--); // tricky
			while(x>0);
	 
		}
	}

}
