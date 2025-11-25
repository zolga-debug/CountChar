package api.schreiben;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class Benutzer_Account {

	public static void main(String[] args) throws Exception {
		
		File quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\uebungen\\loginAccount\\namen.txt");
		BufferedReader bReader = new BufferedReader( new FileReader(quelle));

        PrintWriter writer = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\schreiben/Login.csv","ISO-8859-1");
        String zeile = bReader.readLine();
    	zeile = bReader.readLine();
		
    	while (zeile != null) {
    		String[] zeilen = zeile.split(";");
    		if (zeilen.length<2)
    			continue;
    	String nachname = zeilen[0].toUpperCase();//берем первые два слова Ф и И
    	String vorname = zeilen[1].toUpperCase();
    	
    	//если длина nachname меньше 6 заменяем на Х
    	if (nachname.length()<6) {
    		nachname = String.format("%-6s", nachname).replace(' ', 'X');
    	}else{
    		nachname = nachname.substring(0, 6);
    	}
    	//если длина vorname меньше 2 заменяем на Х
    	if (vorname.length()<2) {
    		vorname = String.format("%-2s", vorname).replace(' ', 'X');
    		
    	}else{
    		vorname = vorname.substring(0, 2).toLowerCase();
    	}
    	
    	String login = nachname + vorname;
        writer.println(login);

       zeile = bReader.readLine(); // читаем следующую строку
    }

    	bReader.close();
        writer.close();
        
    	System.out.println("File ist fertig!");
    	}
    	
    

	}

//MÜLLERku
//SCHÖNEri
//KLUGEXma
//SCHNELma


