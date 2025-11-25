package uebungen.arbeits_kosten;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Kosten_readline {

	public static void main(String[] args)throws IOException{
		
		Kosten_readline rechnung = new Kosten_readline();
		String sklavenID = JOptionPane.showInputDialog("ID eingeben, um gesamte Arbeitkosten und durchschnittlichen Stundenlohn zu sehen:");
				
				rechnung.kostenrechnung(Integer.parseInt(sklavenID));
		 		
	}


void kostenrechnung(int ID)throws IOException {
	File quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\uebungen\\arbeits_kosten\\kosten.txt");
	BufferedReader bReader = new BufferedReader(new FileReader(quelle));
	
	String zeile = bReader.readLine();
	zeile = bReader.readLine();
	
	int stundenlohn = 0;
	int gesamtKosten = 0;
	int arbeitszeit = 0;
	int durchschnit = 0;
	
	while (zeile != null) { // null if the end of the stream has been reached
		
		    String[] zeilen = zeile.split(";");
		    if (zeilen.length >= 4 && Integer.parseInt(zeilen[0]) == ID) {
                 arbeitszeit = Integer.parseInt(zeilen[2]);
                 stundenlohn = Integer.parseInt(zeilen[3]);
			gesamtKosten += arbeitszeit * stundenlohn;
		    
	}
	
	zeile = bReader.readLine();
	}
	
	durchschnit = gesamtKosten/arbeitszeit;

	JOptionPane.showMessageDialog(null, "Gesamte Arbeitskosten: "+ gesamtKosten + "\n" +"Durchschnittlicher Stundenlohn: "+ durchschnit);
	bReader.close();

}
}
