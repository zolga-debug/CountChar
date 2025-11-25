package p;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InDateiSuchenDA {

	public static void main(String[] args) {
		File f = new File("/");
		// GT
		/* File */ f = new File("C:\\Users\\User\\eclipse-workspace\\j_2506");
		String sucheInDatei = "irgendwasIrgendwo";// только InDateiSuchenDA будет найден
//		String sucheInDatei = "== null";
		dir(f, sucheInDatei);
	}

	static void dir(File dir, String sucheInDatei) {
		File[] fa = dir.listFiles();
		if (fa == null) {
			return;
		}

		for (File e : fa) {
			if (e.isDirectory()) {
				dir(e, sucheInDatei);
			} else { // Datei
				if (e.getName().endsWith(".java"))
					try {
						tuwas(e, sucheInDatei);
					} catch (IOException e1) {
						System.out.println("Fehler beim \"in die Datei schauen\" aufgetreten.");
					}
			}
		}
	}

	static void tuwas(File e, String sucheInDatei ) throws IOException {

		BufferedReader bReader = new BufferedReader(new FileReader(e));
		String zeile = bReader.readLine();
		while (zeile != null) {
			if (zeile.contains(sucheInDatei)) { // Übung: "hard codierten" String variabel machen (Tipp: übergeben)
				System.out.println("File: " + e);
				break;//Damit Dateiname nur einmal erscheint auch wenn Suchstring öfter enthalten ist
			}
			zeile = bReader.readLine();
		}
		bReader.close();
	}
}





