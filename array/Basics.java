package array;

public class Basics {

	public static void main(String[] args) {
		String s;
		s = new String("Hallo");
		
		int [] zahlenSchrank;
		zahlenSchrank = new int[4];
		
		for (int i=0;i</*=*/zahlenSchrank.length;++i) {
			System.out.println(zahlenSchrank[i]); // default-values
		}
		
		zahlenSchrank[0] = 5;
		System.out.println(zahlenSchrank[0]);
		
		zahlenSchrank[0] = 5+6;
		System.out.println(zahlenSchrank[0]);
		zahlenSchrank[1]=zahlenSchrank[0];
		System.out.println(zahlenSchrank[1]);
		System.out.println(zahlenSchrank[0]); // line 1
		
		final int KONSTANTE = 9;
		zahlenSchrank[2]=KONSTANTE;
		
		int[] platzHalter = zahlenSchrank;
		
		zahlenSchrank = new int[] {1,0};
		int [] neuesObjekt = {};
		zahlenSchrank=neuesObjekt;
		
		final int[] FINALES_ARRAY = {1};
//		FINALES_ARRAY = new int[] {1,0}; // CF wg. final, da kein neues Objekt finalesArray zugewiesen werden darf.
		System.out.println(FINALES_ARRAY[0]);
		System.out.println(FINALES_ARRAY[0]=9);
		
//		Übung: Welche Anweisung verhindert die RTE ab "Ausgabe" und zeigt bei "Ausgabe" den Inhalt bis line 1
		zahlenSchrank = platzHalter;
		
//Ausgabe:
		System.out.println(zahlenSchrank[0]);
		System.out.println(zahlenSchrank[1]);
		System.out.println(zahlenSchrank[2]);
		System.out.println(zahlenSchrank[3]);
		
//		Übung: Bitte geben Sie den gesamten Inhalt des Arrays mit einer Schleife aus, so wie das unter Ausgabe beschrieben ist.
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print(zahlenSchrank[i] + "|");
		}
		System.out.println("==== ST ====");
		for (int i = 0 ; i < zahlenSchrank.length; i++) {
			System.out.print(zahlenSchrank[i] + "|");
		}
 
		System.out.println("==== CB, AK ====");
		for (int i = 0 ; i < zahlenSchrank.length ; i++ ) {
			System.out.println(zahlenSchrank[i]);
		}	
	 
		System.out.println("==== DA ====");
		for(int wert : zahlenSchrank) {
			System.out.println(wert);
		}
		
//		Übung: Bitte realisieren Sie die obige Übung mit der while-Schleife
		{
			System.out.println("==== KK ====");
    	int i = 0;
    	while (i < zahlenSchrank.length) {
    	    System.out.println("zahlenSchrank[" + i + "] = " + zahlenSchrank[i]);
    	    i++;
    	}
 
		}
		{
			System.out.println("==== CB ====");
			int i = 0;
			while (i < zahlenSchrank.length) {
				System.out.println(zahlenSchrank[i]);
				i++;
			}
		 
		}
		{
			System.out.println("==== St ====");
			System.out.println();
			int i = 0;
			while (i < zahlenSchrank.length) {
				System.out.print(zahlenSchrank[i] + " | ");
				i++;
				
			}
		}
		{
			System.out.println("\n==== AK ====");
			zahlenSchrank = new int[] {};
			int k = 0;
			do {
				System.out.println(zahlenSchrank[k]); // ArrayIndexOutOfBoundsException
				k++;
			} while (k < zahlenSchrank.length);
	 
		}
		
		
	} // EoM

}
