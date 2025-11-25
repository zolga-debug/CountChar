package p;

import java.io.File;

public class OhneNPE_GT {

    public static void main(String[] args) {
        // das Root-Verzeichnis von Linux:
        File f = new File("/"); // GT
//		/*File*/ f = new File("c:\\");
		/* File */ f = new File("C:\\Windows\\System32");
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
            } else {
                System.out.println("File: " + e.getAbsolutePath());
            }
        }
    }
}
 