package schleife;

public class MoeglicheOcaPruefungsaufgabe {

	public static void main(String[] args) {
//		Schleife läuft in falsche Richtung
		byte i =0;
		i--;
		System.out.println(i);
		
		System.out.println("--------------");
		
		i=Byte.MIN_VALUE;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		
	}

}
