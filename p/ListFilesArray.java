package p;

import java.io.File;

public class ListFilesArray {

	public static void main(String[] args) {
		File f = new File("C:\\");
		f.listFiles();
		File [] fa = f.listFiles();
//	    Übung: 
	//  Die API-Beschreibung sagt, dass die M. ein File-Array zurück gibt.
	//  Bitte geben Sie den Inhalt des Arrays in der Console aus.
//		
//		if (fa != null) {
//			for (File file : fa)
//				System.out.println(file.getAbsolutePath()+"-"+file.length());
//				
//		 } else {
//	            System.out.println("Verzeichnis nicht gefunden oder Zugriff verweigert.");
//			}     //			System.out.println(file.getName());	
				
		
	
		for (File file : fa) {
			if (file.isDirectory()) {
				System.out.println("DIR: " + file.getName());	
			}else {
				System.out.println("File: " + file.getName());
			}
			
	 }
   }
}

