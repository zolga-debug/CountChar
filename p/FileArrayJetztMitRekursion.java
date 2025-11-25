package p;

import java.io.File;

public class FileArrayJetztMitRekursion {

	public static void main(String[] args) {
		File f = new File("c:\\");
//		dirOhneRekursion(f);
//		dirMitRekursion(f);
		dirMitRekursionUndStandardFor(f);
	}
	static void dirOhneRekursion(File dir) { // passBy Reference
		File [] fa = dir.listFiles();
		for(File e : fa) {
			if(e.isDirectory()) {
				System.out.println("DIR: " + e);
			}else { // an dieser Stelle ist "sichergestellt", dass es sich um eine Datei handelt.
				System.out.println("File: " + e);
			}
		}
	}
	static void dirMitRekursion(File dir) { // 
		File [] fa = dir.listFiles(); // If this abstract pathname does not denote a directory, then this method returns null
		for(File e : fa) {
			if(e.isDirectory()) {
				dirMitRekursion(e);
			}else { 
				System.out.println("File: " + e);
			}
		}
	}
	static void dirMitRekursionUndStandardFor(File dir) { // 
		File [] fa = dir.listFiles(); // If this abstract pathname does not denote a directory, then this method returns null
		for(int i = 0 ; i < fa.length ; i++) { // NPE
			if(fa[i].isDirectory()) {
				dirMitRekursionUndStandardFor(fa[i]);
			}else {
				System.out.println("File: "+ fa[i].getName());
			}
		}
	}
}
