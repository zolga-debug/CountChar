package ldt.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe_saeumigenZahler {

	public static void main(String[] args)throws IOException {
	//  Übung:
//	    Bitte ermitteln Sie mit Daten aus einer Datei (Zahlungen.csv), ob Rechnungen schon bezahlt wurden.
//	    Zahlungsziel ist 90 Tage.
//	    sinnvoll: KdNr;ReNr;ZahlDatumSoll (ISO);ZahlDatumIst (ISO);letztes MahnungsDatum (ISO); Mahnstufe
//	    vereinfacht: Name;RechnungsDatum (ISO);ZahlDatumIst (ISO)
//	    Schreiben Sie die säumigen (nicht im Zeitraum bezahlt) Zahler in eine ArrayList vom Typ Mahnung.
//	    Die Klasse Mahnung enthält nur 2 fields: String name, LocalDate soll (= Rechnugsdatum plus 90 Tage)
//	    Sie können durch die IDE automatisiert einen Konstruktor erstellen lassen.
//	    Sie finden Unterstützung im Projekt-Package CSV
//	    Achtung: CleanCode: YAGNI
//	    Eine Methode soll dann alle säumigen Zahler untereinander ausgeben.
	    
//	    heute: 16.11.2023   => statt now() dieses Datum mit of() verwenden
	    
//	    Hans;2023-07-15;;             => split() erzeugt nur 2 statt 3 Elemente langes Array
//	    Lisa;2023-08-30;
//	    Susi;2023-06-01;2023-07-09    => OK
//	    Peter;2023-06-01;2023-10-02   => so nicht realistisch, da durch unser PRG die Säumigkeit festgestellt worden wäre.
	
		
	
		File quelle = new File("src/ldt/csv/Zahlungen_GermanFormat.csv");
		/*File*/ quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\ldt\\csv\\Zahlungen_GermanFormat.csv");
		BufferedReader bReader = new BufferedReader(new FileReader(quelle));
		bReader.readLine();// Um die Überschrift zu überspringen
		String zeile = bReader.readLine();
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yy");
        LocalDate heute = LocalDate.of(2023,11,16);
        
		ArrayList<Mahnung>mahnungen = new ArrayList<>();
 
		while (zeile != null) {
			String[] parts = zeile.split(";", -1);
			
			if (parts.length >=2) {
				String name = parts[0].trim();
				try {
				LocalDate rechnungDatum = LocalDate.parse(parts[1].trim(), fmt);
				LocalDate soll =  LocalDate.parse(parts[1].trim()).plusDays(90);
			
				LocalDate zahlDatumIst = null;
				
				if (parts.length >=3 && !parts[2].isEmpty()) {
					zahlDatumIst = LocalDate.parse(parts[2].trim());
				}
			    if(zahlDatumIst == null || zahlDatumIst.isAfter(soll)) {
			    	mahnungen.add(new Mahnung(name,soll));
			    }
			
			
			}catch (DateTimeParseException e) {
				System.out.println("Fehler beim Parsen in Zeile: " + zeile);
			}
			}
			zeile = bReader.readLine(); // nächste Zeile
        }

        bReader.close();
        
	for(Mahnung m: mahnungen) {
				System.out.println(m.name + " säumig (Zahlungsziel: " + m.soll + ")");
			}
	}
	static class Mahnung{
		final String name;
	final LocalDate soll;
		
		Mahnung (String name, LocalDate soll){
			this.name= name;
			this.soll= soll;
		}
	}
	}
	
