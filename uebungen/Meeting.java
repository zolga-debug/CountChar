package uebungen;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class Meeting {

	public static void main(String[] args) {
	
		String[] meetings = {
	            "2025 30 08 14:30",
	            "2024 01 12 09:00",
	            "Hello World",
	            "2023 15 13 18:45",
	            "2025 10 11 25:61"
	        };

	        // 1. Конвертируем строки в список LocalDateTime
	        ArrayList<LocalDateTime> result = convert(meetings);

	        // 2. Печатаем встречи
	        printMeetings(result);
	    }

	    // Метод для преобразования строк в LocalDateTime
	    public static ArrayList<LocalDateTime> convert(String[] meetings) {
	        ArrayList<LocalDateTime> list = new ArrayList<LocalDateTime>();
	        for(String s : meetings) {
	        	try {
	    			String[]parts = s.trim().split("\\s+");
	    			int jahr = Integer.parseInt(parts[0]);
		        	int tag = Integer.parseInt(parts[1]);
		        	int monat = Integer.parseInt(parts[2]);
		        	
		        	String[]timeparts =parts[3].split(":");
		        	
		        	int stunde = Integer.parseInt(timeparts[0]);
		        	int min = Integer.parseInt(timeparts[1]);
		        	
	    			if (parts.length != 4) {//у нас длина в рез стала 4, 3 часть разбита на 2 
	    				System.out.println("Fehler: "+ s);
	    				continue;
	    			}
	    				LocalDateTime data = LocalDateTime.of(jahr, monat, tag, stunde, min);
	    				list.add(data);
	    		}catch (Exception e) {
	    			System.out.println("Fehler: "+ s);
	    			}
	    
	        	
	        // TODO: реализуй здесь логику
	        // - пройти по массиву строк
	        // - разделить строку на части (год, день, месяц, часы:минуты)
	        // - собрать LocalDateTime.of(...)
	        // - в случае ошибки пропустить запись (try-catch)
	        	
	        	}
	        return list;
	    }
	    
	    // Метод для красивого вывода
	    public static void printMeetings(List<LocalDateTime> meetings) {
	        // TODO: пройти по списку и вывести дату
	        // Формат: Samstag, 30. August 2025, 14:30 Uhr
	        // Используй DateTimeFormatter.ofPattern(..., Locale.GERMAN)
	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, d. MMMM yyyy, HH:mm 'Uhr'", Locale.GERMAN);
	    	for(LocalDateTime d :  meetings) {
	    		System.out.println(d.format(dtf));
	    	}
	    }
	}