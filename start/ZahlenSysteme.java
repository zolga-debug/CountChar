package start;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class ZahlenSysteme {

	public static void main(String[] args) {
		System.out.println(0b111); // 7
//		System.out.println(0b112); // CF
		
		System.out.println(0x101); // 257
//		System.out.println(0x10g); // CF
		System.out.println(017); // 15
		System.out.println(0xACDC); // 44252 => hier nicht caseSensitiv
		System.out.println(0xadac); // 44460

		System.out.println(0xACE); // 2766

//		System.out.println(018); // The literal 018 of type int is out of range
		System.out.println((char) 0x58); // X
		System.out.println((char) 0b0101_1000);
//		Übung: 
//		Wie viele Reiskörner passen insgesamt auf ein Schachbrett (8*8=64), wenn sich auf dem ersten Feld 1 Reiskorn und auf dem nächsten, jeweils die doppelte Anzahl des vorherigen Feldes befindet.
//		1,2,4,8,16,...
//		Lös. A: ungefähre Anzahl => in syso: pow(2, 64) - 1 => Hilfmittel bedienen (z.B. Excel)
//		Lös. B: exakt Anzahl auf ein(!) Reiskorn genau. => pow(2, 64) - 1 am Taschenrechner => schriftl. Addieren (mit 2 multiplizieren)
		{
			System.out.println("====== DA ======");
			System.out.println(Math.pow(2, 64) - 1); // 1.8446744073709552E19 => Trillion (Lange Skala (z.B. Europa))
//		18.446.744.073.709.551.615 mit Windows-Rechner
			
//			18 Trillionen, 446 Billiarden, 744 Billionen, 73 Milliarden, 709 Millionen, 551 Tausend, 615 Reiskörner
			
			
		}
		{
			System.out.println("====== KK ======");
			BigInteger reiskorn = BigInteger.valueOf(1);
			BigInteger summe = BigInteger.valueOf(0);

			for (int feld = 0; feld < 64; feld++) { // bis 63
				summe = summe.add(reiskorn); // Algo: alle Feldinhalte addieren(!)
				reiskorn = reiskorn.multiply(BigInteger.valueOf(2));
			}

			System.out.println("Reiskörner auf dem Schachfeld " + summe);
//	        Reiskörner auf dem Schachfeld 18446744073709551615
		}
		{
			System.out.println("====== CB ======");
			int schachBrett = 64;
			double reisGrob = 1;
			BigInteger reisGenau = BigInteger.ONE;

			for (int i = 1; i <= schachBrett; i++) { // bis 64

				reisGrob = reisGrob * 2;
				reisGenau = reisGenau.multiply(BigInteger.valueOf(2));
				System.out.println(reisGenau);

			}

			System.out.println("Grobe Angabe: " + reisGrob);
			System.out.println("Genaue Angabe: " + reisGenau);
//			Grobe Angabe: 1.8446744073709552E19
//			Genaue Angabe: 18446744073709551616 => Inhalt des 65. Feldes
			
			/*
Antwort Gemini: Die von mir genannte Zahl, 18.446.744.073.709.551.615, ist in der Kurzen Skala ausgedrückt. Das ist das System, das hauptsächlich in den USA und den meisten englischsprachigen Ländern verwendet wird.
In der Kurzen Skala ist die Reihenfolge:
Million (106)
Billion (109, also tausend Millionen)
Trillion (1012, also tausend Billionen)
Quadrillion (1015, also tausend Trillionen)
Quintillion (1018, also tausend Quadrillionen)
Das bedeutet, meine ursprüngliche Aussage mit "18 Quintillionen" war korrekt für die Kurze Skala, da die Zahl nahe an 18×1018 liegt.

Aber warum die Verwirrung? Die Lange Skala
In vielen europäischen Ländern, einschließlich Deutschland, wird die Lange Skala verwendet. Hier sind die Bezeichnungen anders:
Million (106)
Milliarde (109, also tausend Millionen)
Billion (1012, also eine Million Millionen)
Billiarde (1015, also tausend Billionen)
Trillion (1018, also eine Million Billionen)
Wenn man die Zahl 18.446.744.073.709.551.615 in der Langen Skala bezeichnen würde, wäre es gerundet 18 Trillionen.			
			*/
		}
		
//		--------------------------
		
		{
			System.out.println("====== NR ======");
			System.out.println((float) Long.MAX_VALUE  * 2); // 1.8446744E19 => liefert Reiskornanzahl des 65(!) Feldes
			
			System.out.println(Long.MAX_VALUE); // 9223372036854775807 => Inhalt des 64. Feldes, also 2 hoch 63
		}
		
		System.out.println("====== Übung ======");
//		Eine DIN A 4 Seite soll 50 mal gefaltet werden.
//		Wie dick wird der Papierstapel (wie viele Millimeter)?
//		Eine Seite sei 0,1 mm dick (Druckerpapier-Packung: 500 Seiten sind ca. 5 cm dick = 50 mm)
		
		System.out.println("====== KK ======");		   
			BigInteger blattDickeMikro = BigInteger.valueOf(100); // 0,1 mm sind 100 µm
	        
	        BigInteger dicke = blattDickeMikro.multiply(BigInteger.valueOf(2).pow(50)); // speziell
	        
	        System.out.println("Enddicke nach 50 Faltungen:");
	        System.out.println("- In Mikrometern: " + dicke + " µm");
	        System.out.println("- In Millimetern: " + dicke.divide(BigInteger.valueOf(1_000)) + " mm");
	        System.out.println("- In Zentimetern: " + dicke.divide(BigInteger.valueOf(10_000)) + " cm");
	        System.out.println("- In Metern: " + dicke.divide(BigInteger.valueOf(1_000_000)) + " m");
//	        Enddicke nach 50 Faltungen:
//	        	- In Mikrometern: 112589990684262400 µm
//	        	- In Millimetern: 112589990684262 mm
//	        	- In Zentimetern: 11258999068426 cm
//	        	- In Metern: 112589990684 m (112 Mrd. m)
	        
	        
	        System.out.println("====== ST ======");		   
	        
	        double startThickness = 0.1; // mm
			int folds = 50;
			
			double finalThickness = startThickness * Math.pow(2, folds); // Calculation => allgem. Formulierung
			
			System.out.println("Nach dem man das Papier 50 mal gefaltet hat, ist der Papierstapel:   \n" + finalThickness + " mm dick"); //Outcome
	        
			System.out.println("====== AK ======");		   
			
			int falten = 50;
			double papierDicke = 0.1;
			double endErgebnisMM = papierDicke * Math.pow(2, falten);
			double endErgebnisCM = endErgebnisMM/10;
			double endErgebnisM = endErgebnisMM/1_000;
			double endErgebnisKM = endErgebnisMM/1_000_000;
			
			DecimalFormat format = new DecimalFormat("#,###.#");
			System.out.println("Nach " + falten + " Faltungen, hat Das Papier eine Dicke von: "
								+format.format(endErgebnisMM)+" mm");
			System.out.println("Oder\t\t\t\t\t\t  "+format.format(endErgebnisCM)+" cm");
			System.out.println("Oder\t\t\t\t\t\t  "+format.format(endErgebnisM)+" m");
			System.out.println("Oder\t\t\t\t\t\t  "+format.format(endErgebnisKM)+" km");
			
			
			System.out.println("====== TS ======");		   
			
			int anzahlFalten = 50;
			/*double*/ papierDicke = 0.1;
			
			double ergebnis = papierDicke * Math.pow(2, anzahlFalten);
			
			System.out.printf("Ergebnis nach " + anzahlFalten + " Faltungen: %.2f Millimeter\n", ergebnis); // printf: Text mit Formatierung (hier gemischt)
			System.out.printf("Ergebnis nach %d Faltungen: %.2f Millimeter", anzahlFalten, ergebnis); // printf: Text mit Formatierung
			
			
			System.out.println("\n====== CB ======");		   
			
			double pageThickness = 0.1;		// Variable for original Thickness in mm
			double endThickness = 0;			// Variable for result
			int timesToFold = 50;			// how often to fold
					
			// Calculate paper thickness after folding, doubling with each fold
			endThickness = pageThickness * Math.pow(2, timesToFold);
					
			// Initialize "DecimalFormat object" to format large numbers for readability
			// Format pattern "#,##0.0" determines the output format of the number
			DecimalFormat formatterA = new DecimalFormat("#,##0.0");				
				
			//Create String from formatted Object
			String formattedEndThickness = formatterA.format(endThickness);
					
			//Output
			System.out.println("Dicke nach " + timesToFold + " Faltungen: " + formattedEndThickness + " mm");
			
			System.out.println("\n====== GT ======");	
			BigDecimal anfangsDicke = new BigDecimal("0.1");
			/*int*/ falten = 50;
			BigInteger potenz = BigInteger.valueOf(2).pow(falten);
			BigDecimal faktor = new BigDecimal(potenz);
			BigDecimal dickeNachFaltung = anfangsDicke.multiply(faktor);
			System.out.println("Höhe des Papierstapels nach " + falten + " Faltungen:");
			System.out.println("= " + dickeNachFaltung.toPlainString() + " mm");
			
			System.out.println("\n====== NR ======");	
			long stapelDickeinmikrometer = 100;
			long anzahlPapierSchichten = 0b1_0000000000_0000000000_0000000000_0000000000_0000000000L; // 2^50 tricky
			System.out.print("Dicke: " + ((stapelDickeinmikrometer * anzahlPapierSchichten) / 1000) + " mm und ");
			System.out.println(((stapelDickeinmikrometer * anzahlPapierSchichten) % 1000) + " mikrometer");
	}
}