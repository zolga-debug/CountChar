package array;

public class Enhanced {

	public static void main(String[] args) {
		{
		int lokaleVariable;
		int[] ia = {1,9,2,8,3,7}; // evtl. geeignete Daten zum leichten Testen wählen
		for (int element : ia) {
			System.out.println(element);
		}
		}
		
//		Übung: Bitte geben Sie NUR die Summe des Arrays nach der Schleife aus.
		{
			System.out.println("==== KK, ST, AK ====");
            int summe = 0;
            int[] ia = {1, 9, 2, 8, 3, 7};
            for (int element : ia) {
                summe += element;
            }
            System.out.println(summe);
		}
//			Übung: Und jetzt mit Standard-For-Loop
		{
			System.out.println("==== ST, CB, AK, GT ====");
			int [] ia = {1,9,2,8,3,7};
			int sum = 0;
			for (int i = 0 ; i < ia.length; i++ ) {
				sum += ia [i];
			}
			System.out.println(sum);
	 
		}
		{
			System.out.println("==== KK ====");
            int summe /*= 0*/;
            int[] ia = {1, 9, 2, 8, 3, 7};
            for (int i= 0; i < ia.length; i++) {
                summe = summe +ia[i];
            }
            
            System.out.println(summe);
        
    }	// BlockEnde für summe
 
	} // EndOfMain
int defaultWert;
}
