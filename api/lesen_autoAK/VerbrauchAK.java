package api.lesen_autoAK;

public class VerbrauchAK {

}
class Auto{
	String hersteller;
	String modell;
	char antriebsArt;
	double verbrauch; // KWh für alle einheitlich
	
	Auto(String hersteller, String modell, char antriebsart, double verbrauch){
		this.hersteller = hersteller;
		this.modell = modell;
		this.antriebsArt = antriebsart;
		if (antriebsArt!='E') { // wandeln in switch-case wg. unterschiedlicher Energieinhalte der Treibstoffe
			this.verbrauch = verbrauch*10; // Liter in KWh wandeln
		}else {
			this.verbrauch = verbrauch;
	}
		
}
	@Override
	public String toString() {
		
		return "Der "+hersteller+" "+modell+" verbraucht auf 100 km "+verbrauch+" was"+
//	für E die KWh übernehmen und für die Liter durch 10 teilen
//	für anderen: KWh 
//z.B. ternär
	}
}
 
public class CarJacker {
 
	public static void main(String[] args) {
		
		List<String> inhalt = Files.readAllLines(dateiAuswerten().toPath(), StandardCharsets.ISO_8859_1);
		
		ArrayList<Auto> autos = new ArrayList<Auto>();
		
		
		for (int i = 1; i < inhalt.size(); i++) {
			String[] zeile = inhalt.get(i).split(";");
			autos.add(new Auto(zeile[0], zeile[1], zeile[2].charAt(0), Double.parseDouble(zeile[3])));
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
			return new File("src/api/lesen/VorUndNachName.csv");
		}
		package api.lesen_autoAK;

		import java.io.File;
		import java.io.IOException;
		import java.nio.charset.StandardCharsets;
		import java.nio.file.Files;
		import java.util.ArrayList;
		import java.util.List;
		import javax.swing.JFileChooser;

		class Auto {
			String hersteller;
			String modell;
			char antriebsArt;
			double verbrauch; // in kWh / 100 km

			Auto(String hersteller, String modell, char antriebsArt, double verbrauch) {
				this.hersteller = hersteller;
				this.modell = modell;
				this.antriebsArt = antriebsArt;

				// Verbrauch umrechnen in kWh für alle außer Elektro
				switch (antriebsArt) {
					case 'B': // Benzin
					case 'D': // Diesel
					case 'W': // Wasserstoff
						this.verbrauch = verbrauch * 10; // Umrechnung Liter in kWh
						break;
					case 'E': // Elektro
					default:
						this.verbrauch = verbrauch; // bleibt wie ist
				}
			}

			@Override
			public String toString() {
				// Info je nach Typ mit ternärem Operator
				String info = (antriebsArt == 'E')
					? "Der " + hersteller + " " + modell + " verbraucht " + verbrauch + " kWh/100km (elektrisch)"
					: "Der " + hersteller + " " + modell + " verbraucht umgerechnet " + verbrauch + " kWh/100km";

				return info;
			}
		}

		public class VerbrauchAK {

			public static void main(String[] args) throws IOException {

				// Datei wählen (GUI oder Standardpfad)
				File datei = dateiAuswaehlen();

				List<String> inhalt = Files.readAllLines(datei.toPath(), StandardCharsets.ISO_8859_1);
				ArrayList<Auto> autos = new ArrayList<>();

				// Datei ab der 2. Zeile einlesen
				for (int i = 1; i < inhalt.size(); i++) {
					String[] zeile = inhalt.get(i).split(";");
					if (zeile.length >= 4) {
						String hersteller = zeile[0];
						String modell = zeile[1];
						char art = zeile[2].charAt(0);
						double v = Double.parseDouble(zeile[3]);
						autos.add(new Auto(hersteller, modell, art, v));
					}
				}

				// Ausgabe aller Autos
				for (Auto a : autos) {
					System.out.println(a);
				}
			}

			static File dateiAuswaehlen() {
				JFileChooser chooser = new JFileChooser();
				chooser.setDialogTitle("Bitte Datei auswählen");
				int result = chooser.showDialog(null, "Öffnen");
				if (result == JFileChooser.APPROVE_OPTION) {
					System.out.println("Datei gewählt: " + chooser.getSelectedFile());
					return chooser.getSelectedFile();
				} else {
					System.out.println("Keine Auswahl – Standarddatei wird verwendet");
					return new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\api\\lesen_namen\\AutoDaten.csv");
				}
			}
		}

	}
 
}
 
 