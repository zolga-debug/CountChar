package p.sql;

import java.io.*;

import java.nio.file.Files;
import java.sql.*;
import java.util.List;

public class PV_DatenEinlesenInDB {

public static void main(String[] args) throws IOException, SQLException {
		
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
 
		Connection con = null;
 
		try {
			con = DriverManager.getConnection(url, user, passwort);
		} catch (SQLException e) {
			System.out.println("Da ist etwas schief gelaufen");
		}
		System.out.println("Verbindung aufgebaut");
		
		con.setAutoCommit(false);
		
		File pfad = new File("C:\\Users\\User\\eclipse-workspace\\j_2506\\src\\p\\sql\\Solar");
		File[] dateien = pfad.listFiles();
		List<String> inhalt = null;
		String[] zeile = null;
		
		final int BATCH_MAX_SIZE = 10_000;
		int batchGroesse = 0;
		int anzahl = 0;
		
		String einfuegeZeile = "insert into e.pv "
								+ "(BundeslandID,PLZ,Ort,InbetriebnahmeDatum,PVModulLeistung_brutto,WechselRichterLeistung_netto) "
								+ "values (?,?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(einfuegeZeile);
 
		
		for(int i = 0; i < dateien.length; i++) {
			
			inhalt = Files.readAllLines(dateien[i].toPath());
			
			
			for(int j = 1; j < inhalt.size(); j++) {
				
				zeile = inhalt.get(j).split(";");
				
				String bundeslandID = zeile[0];
				String plz = zeile[1];
				String ort = zeile[2];
				String inbetriebnahmeDatum = zeile[3];
				String pvModulLeistung_brutto = zeile[4];
				String wechselRichterLeistung_netto = zeile[5];
				
				pstmt.setString(1, bundeslandID);
				pstmt.setString(2, plz);
				pstmt.setString(3, ort);
				pstmt.setString(4, inbetriebnahmeDatum);
				pstmt.setString(5, pvModulLeistung_brutto);
				pstmt.setString(6, wechselRichterLeistung_netto);
 
				pstmt.addBatch();
				batchGroesse++;
				anzahl++;
				
				if(batchGroesse >= BATCH_MAX_SIZE) {
                    pstmt.executeBatch();
                    con.commit();
                    batchGroesse = 0;
                    System.out.println("Batch wurde commitet! \nZwischenstand: "+anzahl);
				}
			}
		}
		
		if(batchGroesse > 0) {
            pstmt.executeBatch();
            con.commit();
            System.out.println("Restlicher Batch wurde commitet!");
		}
		
		System.out.println("Fertig, es wurden insgesamt "+anzahl+" Einträge Generiert!");
		
        pstmt.close();
        con.setAutoCommit(true);
        con.close();
 
	}
}
 