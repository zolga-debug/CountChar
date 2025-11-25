package uebungen.skiPassAKCB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public 
 class Loesung {
	
	public static void main(String[] args) throws IOException{
		
		File quelle = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\uebungen\\skiPass\\LogSkipassProblem.txt");
		List<String> inhalt = Files.readAllLines(quelle.toPath());
		
		final int SkipassNummer = 30201;
		int liftLaengeGesamt = 0;
		
		for (int i = 1; i < inhalt.size(); i++) {
			String[] zeile = inhalt.get(i).split(";");
			if(Integer.valueOf(zeile[2]).equals(SkipassNummer)) {
				liftLaengeGesamt += Integer.valueOf(zeile[5]);
			}
		}
		
		System.out.println("Der Skipass mit der Nummer: "+SkipassNummer+" ist "+liftLaengeGesamt+" m Lift gefahren.");
			
	}
 
}
 
 