package p;

import java.io.File;
import java.util.function.Predicate;

public class NurJavaPrgsFindenPredicate {

    public static void main(String[] args) {
		 File  f = new File("G:\\P\\ws_jee2025_03\\J_2506"); // Verzeichnis
		Predicate <String> p = s -> s.endsWith(".java"); // z.B.: endet "Hallo.class" mit ".java"?
        dir(f,p);
    }
 
    static void dir(File dir,Predicate <String> p) {
        File[] fa = dir.listFiles();
        if (fa == null) {
            return;
        }
 
        for (File e : fa) {
            if (e.isDirectory()) {
                dir(e,p); 
            } else { // Datei 
                tuwas(e,p);
            }
        }
    }
    static void tuwas(File e,Predicate <String> p) {
    	if...  e.getName() ...
                System.out.println("File: " + e);
    }
}