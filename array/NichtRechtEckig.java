package array;

public class NichtRechtEckig {

	public static void main(String[] args) {
		{
			int[][] unterschiedlicheGroessen;
			/*int[][]*/ unterschiedlicheGroessen = { { 1, 4 }, { 3 }, { 9, 8, 7 } };

//		Übung: Bitte geben Sie alle Elemente des 2D-Arrays aus.
//		1.) unter Verwendung der for(;;)
//		2.) und for(:)

		}
		{
			System.out.println("==== ST ====");
			int [][] unterschiedlicheGroessen = {{1,4},{3},{9,8,7}};
			
			for(int i = 0; i < unterschiedlicheGroessen.length ; i++) {
				for(int j = 0; j < unterschiedlicheGroessen[i].length; j++) {
					System.out.println(unterschiedlicheGroessen[i][j]);
				}
				System.out.println();
			}
			
			for(int[] zeile : unterschiedlicheGroessen) {
				for(int element : zeile) {
					System.out.println(element);
				}
				System.out.println();
			}
	 
		}
		{
			System.out.println("==== TS ====");
			int [][] unterschiedlicheGroessen = {{1,4},{3},{9,8,7}};
			for (int i = 0; i < unterschiedlicheGroessen.length; i++) {
				for (int j = 0; j < unterschiedlicheGroessen [i].length; j++) {
					System.out.print(unterschiedlicheGroessen[i][j] + "|");
				}
			}
			System.out.println("\n====2.====");
			for (int [] zeile : unterschiedlicheGroessen) {
				for (int zahl : zeile) {
					System.out.print(zahl + "|");
				}
			}
	 
		}
		{
			System.out.println("==== CB ====");
			int [][] unterschiedlicheGroessen = {{1,4},{3},{9,8,7}};
			System.out.println("--- Standart for-Schleife ---");
			for (int i = 0 ; i < unterschiedlicheGroessen.length ; i++ ) {		
				for (int j = 0 ; j < unterschiedlicheGroessen[i].length ; j++) {		
					System.out.print(unterschiedlicheGroessen[i][j] + " ");		
				}
			}
			
			System.out.println("\n\n--- for-each-Schleife ---");
			for (int[] zeile : unterschiedlicheGroessen) {
				for (int wert : zeile ) {
					System.out.print(wert + " ");	
				}
			}
		 
		}
		{
			System.out.println("==== KK ====");
		   	int[][] unterschiedlicheGroessen = {{1, 4}, {3}, {9, 8, 7}};
	    	{
	    	System.out.println("Klassisch:");
	        for (int i = 0; i < unterschiedlicheGroessen.length; i++) {
	            for (int j = 0; j < unterschiedlicheGroessen[i].length; j++) {
	                System.out.print(unterschiedlicheGroessen[i][j] + " ");
	            }
	        }
	        {    
	        System.out.println("");
	        System.out.println("Erweitert:");
	    	for (int[] zeile : unterschiedlicheGroessen) {
	    		for (int element : zeile) {
	    			System.out.print(element + " ");
	            }
	    	}
	        }}}
	} // E
}