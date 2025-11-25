package p;

import java.io.IOException;

//import java.io.File;

public class LogischerPfadUndDateiname {

	public static void main(String[] args) throws IOException {
//		java.io.File f1 = new java.io.File(); // Klasse enthält keinen NoArg-Konstr.
		java.io.File f1 = new java.io.File("123Hallo.txt"); // logischer Dateiname 
		f1.createNewFile(); // wird im Dateisystem (Workspace) korrekt erstellt. Keine Anzeige in IDE
		/*java.io.File*/ f1 = new java.io.File("123:Hallo.txt"); // logischer Dateiname immer noch OK
		f1.createNewFile(); // keine Fehlermeldung und keine erzeugte Datei
		System.out.println(f1.createNewFile()); // false => Datei nicht erstellt
		/*java.io.File*/ f1 = new java.io.File("C:\\Users\\User\\eclipse-workspace\\j_2506\\123:Hallo.txt"); // logischer Dateiname immer noch OK
		System.out.println(f1.createNewFile()); // true => Datei erstellt: Dateiname gekürzt auf 123
		/*java.io.File*/ f1 = new java.io.File("C:/Users/User/eclipse-workspace/j_2506/dateien"); // alternativ ist / OK
		
		System.out.println("Fertig");
	}

}
