package start;

public class DatentypenBezeichner {

	public static void main(String[] hallo) {
		int fuerGanzeZahlen; // "Becher"
		int a; // dies ist eine Variable für ganze Zahlen
		
		fuerGanzeZahlen=1;
		a=0;
		
		double fueKommaZahlen; // wg. PRG-Kopier-Schutz: maschinelle Umbennenen von Identfiern
		
//		long fuerGanzeZahlen; // ReDeclare
//		int  fuerGanzeZahlen; // ReDeclare
		
		fuerGanzeZahlen=3;
		
		final int ichBinEineKonstante;
		ichBinEineKonstante=1;
//		ichBinEineKonstante=2; // CF: The final local variable ichBinEineKonstante may already have been assigned
		
		int ICH_BIN_AUCH_EINE_KONSTANTE = 1;
		ICH_BIN_AUCH_EINE_KONSTANTE=2; // Beweis: bist gar keine Konstante
		
		final int ICH_BIN_EINE_KONSTANTE;
		int i=0;
		i = i+1;
		System.out.println(4 == 5);
		
		System.out.println(Integer.SIZE); // 32
		System.out.println(Integer.MAX_VALUE); // 2147483647
		System.out.println(Integer.MIN_VALUE); // -2147483648
		
		long lang = 1;
		System.out.println(Long.SIZE); // 64
		System.out.println(Long.MAX_VALUE); // 9.223.372.036.854.775.807 dt. 9 Trillion
		System.out.println(Long.MIN_VALUE); // -9,223,372,036,854,775,808
		
		byte b = 0;
		System.out.println(Byte.SIZE); // 8 => Anzahl Bit
		System.out.println(Byte.MAX_VALUE); // 127
		System.out.println(Byte.MIN_VALUE); // -128
		
		short y = 0;
		System.out.println(Short.SIZE); // 16 => Anzahl Bit
		System.out.println(Short.MAX_VALUE); // 32767
		System.out.println(Short.MIN_VALUE); // -32768
		
		
//		byte - short - int - long - float - double
		
		float f = 0;
		System.out.println(Float.SIZE); // 32
		System.out.println(Float.MAX_VALUE); // 3.4028235E38
		System.out.println(Float.MIN_VALUE); // 1.4E-45
		
		double d =0;
		System.out.println(Double.SIZE); // 64
		System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308
		System.out.println(Double.MIN_VALUE); // 4.9E-324
		
		System.out.println(2.05 - 0.05 == 2); // false
		System.out.println(2.05 - 0.05); // 1.9999999999999998
		
//		f = 1.0; // CF
		f = 1.0F; // 32 Bit float
		
		d = 2.0/*D*/;
		
//		Zeilen-Kommentar
		/*
		hier stehen
		mehrere Zeilen
		Text
		*/
		
		i = 1000000;
		i = 1_000_000; // . , .,
		
//		i = lang;
		i = (int) lang;
		
		short gross = 5_000;
		byte klein;
//		klein = gross; // Type mismatch: cannot convert from short to byte
		klein = (byte) gross;
		System.out.println(klein); // Datenverlust
		
		gross = 1;
		if (gross <= 127) {
			klein = (byte) gross;
			System.out.println("OK");
		} else {
			System.out.println("FEHLER: gross passt nicht in klein.");
		}
		
		gross=128;
		if (gross <= Byte.MAX_VALUE) {
			klein = (byte) gross;
			System.out.println("OK");
		} else {
			System.out.println("FEHLER: gross passt nicht in klein.");
		}
		
		gross = 5_000; // 0001 0011 1000 1000
//		 -120 => 0111 1000 pos. => 1000 0111 + 1 =  1000 1000 ( - 120)
		
//		----------------
		
		long $;
		long €;
		
		int nunEineKurzerVariablenName=1;
		nunEineKurzerVariablenName = nunEineKurzerVariablenName + 1;
//		int einSchlechtesBeispielDuBistWennDuZuLangSeinWillstHastMee=1;
//		einSchlechtesBeispielDuBistWennDuZuLangSeinWillstHastMee = einSchlechtesBeispielDuBistWennDuZuLangSeinWillstHastMee+1;
		
		char zeichen = 'o';
//		char einZeichenMehr = 'ab'; // CF
		
		System.out.println("Hall"+zeichen);
		System.out.println("Hall"+zeichen+1+2);
		System.out.println("Hall"+zeichen+a+i+lang+b); // Hallo0110
		
		System.out.println("A"+"B"); // AB
		System.out.println('A'+'B'); // 131

		int zeichenVerschmelzen = '('+')'; // Beweis
		System.out.println("ASCII-Wert der öffnenden Klammer: "+(int)'(');
		System.out.println(zeichenVerschmelzen);
		System.out.println(  (char) zeichenVerschmelzen); // Q
		
		boolean boo = true;
		boolean falsch = false;
		
		System.out.println(1+3+"Hallo"+4+5+zeichen+boo);
		
		System.out.println("Auswertung des Ausdrucks: "+(falsch == false)); // 
		System.out.println("Auswertung des Ausdrucks: "+(falsch = false)); // 
		
		int optischeTrennung = 1_1;
//		optischeTrennung = 1_;
//		optischeTrennung = _1;
		double komma;
//		komma = 1_.6;
//		komma = 1._6;
		
	}

}
 