package start;

public class Promotion {

	public static void main(String[] args) {
		{
			short y = 10; // 16 Bit
			short z = 10; // 16 Bit
//			short ergebnis = y + z ; // CF: Type mismatch: cannot convert from int to short
			int ergebnis = y + z ; // 
		} // hier "sterben" alle Variablen, die im Block "erschaffen" wurden.
		{
			short y = 10; // 16 Bit
			short z = 10; // 16 Bit
//			short ergebnis = y + z ; // CF: Type mismatch: cannot convert from int to short
//			short ergebnis = y + z ; // Übung: Bitte casten Sie zu short um CF zu verhindern.
			short ergebnis = (short) (y+z);
		}
		{
			short y = Short.MAX_VALUE; // 16 Bit
			System.out.println("höchster Wert von short (16 Bit): "+y);
			short z = Short.MAX_VALUE; // 16 Bit
			short ergebnis = (short) (y+z);
			System.out.println("Datenverlust: "+ergebnis);
		}
		
		{
			int y = Integer.MAX_VALUE; 
			System.out.println("höchster Wert von int (32 Bit): "+y);
			int z = Integer.MAX_VALUE; 
			int ergebnis = y+z;
			System.out.println("Datenverlust: "+ergebnis);
		}
		
		{
			short y = 10; // 16 Bit
			short z = 10; // 16 Bit
			y += z; // durch "kombinierten Zuweisungsoperator" findet casten autom. statt. Bedeutet: y = y + z
		}
	}

}
