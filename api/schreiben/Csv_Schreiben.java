package api.schreiben;

import java.io.PrintWriter;

public class Csv_Schreiben  {

//	public static void main(String[] args) throws Exception{ // FileNotFoundException - wenn csv-Datei (noch) geöffnet ist.

//		PrintWriter out = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\schreiben/Excel.csv");
//		
//		
//		out.println("Spalte 1;Spalte 2;Spalte 3;Summe");
//		out.println("15;10;2;=a2+b2+c2");
//		out.println("Müller"); // CharSet-Problem
//		out.close();
//		/*PrintWriter*/ out = new PrintWriter("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\schreiben/Excel.csv","ISO-8859-1"); // Windows-Zeichensatz
//		Keine Frage nach Überschreiben
//		out.println("Spalte 1;Spalte 2;Spalte 3;Summe");
//		out.println("15;10;2;=a2+b2+c2");
//		out.println("Müller"); // CharSet-Problem
//		out.close();
//		System.out.println("Bin fertig.");
//	}
//	{
//	
		// Aтоматический вариант
		
//		public class Csv_Schreiben {
		    public static void main(String[] args) throws Exception {
		        String projectPath = System.getProperty("user.dir"); // путь к папке проекта
		        String filePath = projectPath + "/src/api/schreiben/Excel.csv";

		        PrintWriter out = new PrintWriter(filePath, "ISO-8859-1"); // кодировка для ü, ä, ö

		        out.println("Spalte 1;Spalte 2;Spalte 3;Summe");
		        out.println("15;10;2;=a2+b2+c2");
		        out.println("Müller");
		        out.close();

		        System.out.println("Файл создан: " + filePath);//Файл создан:
		        //C:\Users\User\eclipse-workspace\j_2506/src/api/schreiben/Excel.csv
		    }
		
		    
	}

