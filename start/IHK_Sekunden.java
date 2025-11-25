package start;

import java.text.DecimalFormat;

public class IHK_Sekunden {

	public static void main(String[] args) {
		{
			// Übung:
			// Bitte schreiben Sie ein PRG, dass eine Sekundenzahl in Stunde, Minute und Sekunde umrechnet.
			// Bitte verwenden Sie als Zeit 10.000 Sekunden.
//		Als Ergebnis soll die folgende Ausgabe erscheinen: 
//		10000 Sekunden sind 2 Stunden 46 Minuten und 40 Sekunden.
			int sec = 10_000, hour = 0, minute = 0, second = 0;
//		hier kommt Ihre Berechnung hin
//		hier kommt Ihre Ausgabe hin
		}
		{
			System.out.println("==== KK ====");
			int sec = 13_000;
			int hours = sec / 3600;
			int minutes = (sec % 3600) / 60;
			int seconds = sec % 60;

			System.out.println(sec + " Sekunden sind: ");
			System.out.println(hours + " Stunden, " + minutes + " Minuten und " + seconds + " Sekunden.");
		}
		
		{
			System.out.println("==== AK ====");
			int gesamtSekunden = 10_000;
			
			int stunden = gesamtSekunden /3600;
			int minuten = (gesamtSekunden % 3600)/60;
			int sekunden = gesamtSekunden % 60;
			
			DecimalFormat format = new DecimalFormat("#,###");
			
			System.out.print(format.format(gesamtSekunden)+" Sekunden sind:");
			System.out.print(" "+stunden+" Stunden,");
			System.out.print(" "+minuten+" Minuten und ");
			System.out.print(" "+sekunden+" Sekunden");
		}
		{
			System.out.println("==== ST ====");
			int sec = 10_000, hour=0,minute=0,second=0;
			
			hour = sec / 3600; // Berechnung : Sekunden in volle Stunden
			minute = (sec % 3600) / 60; // Berechnung verbleibender Minuten
			second = sec % 60; // Berechnung verbleibender Sekunden
			
			System.out.println(sec + " Sekunden sind " + hour + " Stunden " + minute + " Minuten und " + second + " Sekunden.");
		}
		{
			System.out.println("==== CB ===="); // Lösung mit Grundrechenarten
			int sec = 13_000;
			 
			int hour = sec / 3600; // Nur Vorkommateil
			int minute = (sec - (hour * 3600)) / 60; // Nur Vorkommateil
			int second = sec - ((hour * 3600) + (minute * 60));
			
			DecimalFormat secFormat = new DecimalFormat("#,###");
			
							
			System.out.println(secFormat.format(sec) + " Sekunden sind " + hour + " Stunden " + minute + " Minuten und " + second + " Sekunden.");
//			10.000 Sekunden sind 2 Stunden 46 Minuten und 40 Sekunden.
		} // EndOfBlock
		{
			System.out.println("==== TS ===="); // Reihenfolge wie in Folien-Lösung
			int sec = 10_000;
			
			int second = sec % 60;		
			int minuteRest = sec / 60; // Übersichtlich / Verständlich durch Zwischenergebnis
			int minute = minuteRest % 60;
			int hour = minuteRest / 60;
			
			
			System.out.println(sec + " Sekunden sind " + hour + " Stunden " + minute + " Minuten " + second + " Sekunden.");
		}
		{
			System.out.println("==== DA ===="); // Reihenfolge wie in Folien-Lösung
			int sec = 10_000, hour = sec / 3600, minute = (sec % 3600) / 60, second = (sec % 3600) % 60;
			 
			System.out.println(hour + " " + minute +" " + second);
		}
		
		
		{
			System.out.println("==== NR ===="); 
		// Code in Main-Methode
			int sec = 10_000;
			int	hour = zeitEinheiten(sec)[0]; // auspacken
			int		minute = zeitEinheiten(sec)[1];
			int	second = zeitEinheiten(sec)[2];
				System.out.println(sec + " Sekunden ergeben " + hour + " Stunden, " + minute + " Minuten und " + second + " Sekunden");
		}
		
	} // EndOfMain
	
	// Methode:
		static int[] zeitEinheiten(int sec) {// Reihenfolge wie in Folien-Lösung
			int sekunden = sec % 60;
			int minuten = (sec / 60) % 60;
			int stunden = sec / 60 / 60;
			return new int[] {stunden, minuten, sekunden};	// verpacken	
		}
	
	
} // EndOfClass
