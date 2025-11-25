package api.lesen_namenMethAK;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

class Person {
	String nachName;
	String vorName;
 
	public Person(String vorName, String nachName) {
		this.vorName = vorName;
		this.nachName = nachName;
	}
 
	@Override
	public String toString() {
		return vorName + " " + nachName;
	}


}
 
public class LesenNamenMethAK {
 
	public static void main(String[] args) throws IOException {
		
//		Übung: Bitte bringen Sie den Code zum Wählen der Datei in einer Methode unter.
//		Die Methode soll ein Default-Verzeichnis nehmen.
//		z.B.: G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachNameWin.csv
//		Der Benutzer kann das verwenden oder in ein anderes im Verzeichnisbaum klicken.
//		Die M. soll eine Datei an die readAllLines-M. liefern.
//		Der Name sei "dateiAuswaehlen()"
		
List<String> inhalt = Files.readAllLines(dateiAuswerten().toPath(), StandardCharsets.ISO_8859_1);
		
		ArrayList<Person> personen = new ArrayList<Person>();
		
		
		for (int i = 1; i < inhalt.size(); i++) {
			String[] zeile = inhalt.get(i).split(";");
			personen.add(new Person(zeile[0], zeile[1]));
		}
		
		for (Person p : personen) {
			System.out.println("Hallo " + p + ", ich grüße Dich!");
		}
 
	}
	
	static File dateiAuswerten() {
		
		File quelle = new File("");
		JFileChooser file = new JFileChooser();
		file.setDialogTitle("Bitte eine Quelldatei wählen.");
		int returnWert = file.showDialog(null, "OK");
		if (returnWert == JFileChooser.APPROVE_OPTION) {
			quelle = file.getSelectedFile();
			System.out.println("Sie haben die Datei "+quelle+" gewählt!");
			return quelle;
		} else {
			System.out.println("Wenn du nicht wählst, wähle ich für Dich!!!!!!!");
			//return new File("G:\\P\\ws_jee2025_03\\J_2506\\src\\api\\lesen_namen\\VorUndNachNameWin.csv");//mrEfflingsQuelle
			return new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\lesen_namen\\VorUndNachName.csv");
		}
 
	}
 
 
}
 