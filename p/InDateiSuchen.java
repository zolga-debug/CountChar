package p;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InDateiSuchen {


    public static void main(String[] args) {
        File f = new File("/"); // GT
		/* File */ f = new File("C:\\Users\\User\\eclipse-workspace\\j_2506"); 
		String sucheInDatei = "==null";
	
        dir(f, sucheInDatei);
    }
 
    static void dir(File dir, String sucheInDatei ) {
        File[] fa = dir.listFiles();
        if (fa == null) {
            return;
        }
 
        for (File e : fa) {
            if (e.isDirectory()) {
                dir(e, sucheInDatei ); 
            } else { // Datei 
            	 if (e.getName().endsWith(".java")) 
                tuwas(e, sucheInDatei);
            }
        }
    }
    static void tuwas(File e, String sucheInDatei ) {
        try {
            List<String> lines = java.nio.file.Files.readAllLines(e.toPath());
            for (String line : lines) {
                if (line.contains(sucheInDatei)) {
                    System.out.println("File: " + e.getAbsolutePath());
                    System.out.println("   --> " + line.trim());
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}