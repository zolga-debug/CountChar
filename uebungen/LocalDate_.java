package uebungen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;

public class LocalDate_ {

	public static void main(String[] args) {
		String[] inhalt = {"2024 09 10",
				"2023 27 12",
				"2020 12 27",
				"Hallo",
				"2019 13 10"};
		
//		String s = "2024 09 10";
//		String[] parts = s.split(" ");
//
//		int jahr = Integer.parseInt(parts[0]);
//		int tag = Integer.parseInt(parts[1]);
//		int monat = Integer.parseInt(parts[2]);
//		LocalDate d =LocalDate.of(jahr, tag, monat);
//		System.out.println(d);
		
		ArrayList<LocalDate>daten= convert(inhalt);
		printData(daten);
		
	}


	static ArrayList<LocalDate>convert(String[]input){
		
			ArrayList<LocalDate> list = new ArrayList<LocalDate>();
					for (String s : input) {
		try {
			String[]parts = s.trim().split("\\s+");
				
			if (parts.length !=3){
			System.err.println("Fehlerhafter Format: " + s);	
			continue;
			}
		
			int jahr = Integer.parseInt(parts[0]);
			int tag = Integer.parseInt(parts[1]);
	    	int monat = Integer.parseInt(parts[2]);
	    	
	    	LocalDate date = LocalDate.of(jahr, monat, tag);
	    	list.add(date);
		
			}catch (Exception e) {
				System.err.println("Fehlerhafter String: " + s);	
			}
					}	    
	
	return list;
	
	}
	
	static void printData(ArrayList<LocalDate>dates){
		DateTimeFormatter fms =DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); 
		for (LocalDate d : dates) {
		System.out.println(d.format(fms));
		
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd. MMM YYYY", Locale.GERMAN);
//		for (LocalDate d : dates) {
//		System.out.println(d.format(fmt));
		
		}
	}
}
