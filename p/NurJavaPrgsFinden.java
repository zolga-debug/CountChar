package p;

import java.io.File;

public class NurJavaPrgsFinden {

    public static void main(String[] args) {
        File f = new File("/"); // GT
		/* File */ f = new File("G:\\P\\ws_jee2025_03\\J_2506"); // Verzeichnis
        dir(f);
    }
 
    static void dir(File dir) {
        File[] fa = dir.listFiles();
        if (fa == null) {
            return;
        }
 
        for (File e : fa) {
            if (e.isDirectory()) {
                dir(e); 
            } else { // Datei 
//            	Übung: Bitte nur .java Dateien an die Methode tuwas() übergeben.
            	 if (e.getName().endsWith(".java")) // ST
                tuwas(e);
            }
        }
    }
    static void tuwas(File e) {
                System.out.println("File: " + e);
    }
}