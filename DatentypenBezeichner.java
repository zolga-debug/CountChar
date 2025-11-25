

public class DatentypenBezeichner {

	public static void main(String[] hallo) {
		int fuerGanzenZahlen; //"Becher" Deklarierung
		int a; // dies ist eine Variable für ganze Zahlen

		fuerGanzenZahlen=1; // Inizialisierung
		a=0;
		
		double fueKommaZahlen; //wg. PRG-Kopier-Schutz: maschinelle Umbennenen von Indentfiern
		
//		long fuerGanzenZahlen; //ReDeclare ошибка которая возникает когда пытаешься 
//      обьявить переменную которая уже была обьявлена ранее в том же коде
//		int fuerGanzenZahlen; //ReDeclare
	
		fuerGanzenZahlen=3; // Wert zuweisung
		final int ichBinEineKonstante;
		ichBinEineKonstante=1;
//		ichBinEineKonstante=2;  CF: The final local variable ichBinEineKonstante may already have been assigned
		
	//	int ICH_BIN_EINE_KONSTANTE = 1;
//		ICH_BIN_EINE_KONSTANTE = 2; // beweis:bist gar keine Konstante
		
		
		final int ICH_BIN_EINE_KONSTANTE;
		int i=0;
		i = i+1;
		System.out.println(4 == 5); //false
		
		System.out.println(Integer.SIZE); //32
		System.out.println(Integer.MAX_VALUE); // 2147483647/ Classe (Integer) mit Grossen Buchtaben schreiben
		System.out.println(Integer.MIN_VALUE); // -2147483648
		
		long lang = 1;
		System.out.println(Long.SIZE); //64 Bit
		System.out.println(Long.MAX_VALUE); //9.223.372.036.854.775.807 dt. 9 Trillion
		System.out.println(Long.MIN_VALUE);  //-9223372036854775808
		
		byte b = 0;
		System.out.println(Byte.SIZE); // 8 Bit  => 
		System.out.println(Byte.MAX_VALUE); //127
		System.out.println(Byte.MIN_VALUE);  //-128
		
		short y = 0;
		System.out.println(Short.SIZE); //16 Bit
		System.out.println(Short.MAX_VALUE); //32767
		System.out.println(Short.MIN_VALUE);  //-32768
		
		// byte - short - int - long - float - double // Wichtig!!
		
		float f = 0;
		System.out.println(Float.SIZE); //32 Bit
		System.out.println(Float.MAX_VALUE); //3.4028235E38
		System.out.println(Float.MIN_VALUE);  //1.4E-45
		
		double d = 0;
		System.out.println(Double.SIZE); //64 Bit
		System.out.println(Double.MAX_VALUE); //1.7976931348623157E308
		System.out.println(Double.MIN_VALUE);  //4.9E-324
		
		System.out.println(2.05 - 0.05 == 2);// false
		System.out.println(2.05 - 0.05); //1.9999999999999998  //изза двоичного представления
		
	//	f = 1.0; // CF Compiler Fehler
		f = 1.0F; // 32 Bit float / обавляем f иначе восприн как double 
		
		d = 2.0/*D*/;
		
  //    Zeilen Kommentar
		/*
		 hier stehen 
		 mehrere Zeilen
		 Text
		 */
	 
		i = 1000000000;
		i = 1_0000_000; //  .  ,  . ,
		
	//	i = lang;
		i = (int) lang;
		
		
		short gross = 5_000;
		byte klein;
//		klein = gross; // Type mismatch: cannot convert from short to byte
		klein = (byte) gross;
		System.out.println(klein); //-120
		
		if (gross < 127) {   // passt Danentyp byte, 128 => Fehler
			klein = (byte) gross;
			System.out.println("OK");
			
		}else {
			
			System.out.println("Fehler: gross passt nicht in klein");
		}
		
		gross = 5_000; //0001 0011 1000 1000  zweier Komliment
//		-120 => 0111 1000 pos. => 1000 0111 +1 = 1000 1000 ( -120)   
		
// -------------------
		long $;
//		long $; /Fehler
		long €;
		
		int einSchletesBeispuelDuBistWennZuLangSeinWilstHastMeee=1;
		einSchletesBeispuelDuBistWennZuLangSeinWilstHastMeee = einSchletesBeispuelDuBistWennZuLangSeinWilstHastMeee;
		
		char zeichen = 'o';
//		char einZeichenMehr = 'ab'; //CF
		System.out.println("Hall"+zeichen);
		System.out.println("Hall"+zeichen+1+2);
		System.out.println("Hall"+zeichen+a+i+lang+b);// Hallo0110
		
		System.out.println('A'+'B');// 131 ASCII  65+66
		System.out.println("A"+"B");// AB
		
		int zeichenVerschmelzen = '('+')'; //Beweis
		System.out.println("ASCII-Wert der öffenden Klammer: "+(int)'('); //40
		System.out.println(zeichenVerschmelzen);
		System.out.println( (char) zeichenVerschmelzen); // Q 40+41=81 => Q
		
		boolean boo = true;
		boolean falsch = false;
		
		System.out.println(1+3+"Hallo"+4+5+zeichen+boo);
		
		
		int optischeTrennung = 1_1;// richtig
//		optischeTrennung = 1_;
//		optischeTrennung = _1;		
		double komma;
//		komma = 1_.6;		falsch
//		komma = 1._6;		falsch		
		
		
		
		}
	
}
