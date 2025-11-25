package uebungen.arbeits_kosten;


import java.io.File;

import java.io.IOException;


import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.util.List;



public class Kosten {

	public static void main(String[] args) throws IOException {

		Kosten rechnung = new Kosten();
 String sklavenID = JOptionPane.showInputDialog("ID eingeben, um gesamte Arbeitkosten und durchschnittlichen Stundenlohn zu sehen:");
		
		rechnung.kostenrechnung(Integer.parseInt(sklavenID));
 
			
			}
		
	 void kostenrechnung(int ID)throws IOException {
		File quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\uebungen\\arbeits_kosten\\kosten.txt");
		List<String> inhalt = Files.readAllLines(quelle.toPath());	
		
		int stundenlohn = 0;
		int gesamtKosten = 0;
		int arbeitszeit = 0;
		int durchschnit = 0;
		
		for (int i = 1; i < inhalt.size(); i++) {
			String[] zeile = inhalt.get(i).split(";");
			if(zeile.length >= 4 && Integer.valueOf(zeile[0]).equals(ID)){
			arbeitszeit = Integer.valueOf(zeile[2]); 
			stundenlohn = Integer.valueOf(zeile[3]);
			gesamtKosten += arbeitszeit * stundenlohn; 
			
			}	
		}
		durchschnit = gesamtKosten/arbeitszeit;
		JOptionPane.showMessageDialog(null, "Gesamte Arbeitskosten: "+ gesamtKosten + "\n" +"Durchschnittlicher Stundenlohn: "+ durchschnit);
//			System.out.println("Gesamte Arbeitskosten: " + gesamtKosten);
//		System.out.println("Durchschnittliche Arbeitskosten: " + durchschnit);
	}
	}	
	
	
		
		
		

		


