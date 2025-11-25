package p.sql;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;



public class BundesLaenderAusCsvInDb {
	
	 public static void main(String[] args) throws IOException, SQLException {

	        Statement stmt = con.createStatement();

	        // SQL-Statement für Insert vorbereiten
	        String einfuegeZeile = "INSERT INTO bundeslaender (id, Bez, Kuerzel) VALUES (?, ?, ?)";
	        PreparedStatement pstmt = con.prepareStatement(einfuegeZeile);

	        // CSV-Datei einlesen
	        File daten = new File("C:\\Users\\User\\eclipse-workspace\\MeineImporte\\src\\p\\sql\\Bundesländer_CodesAbk.csv");
	        BufferedReader br = new BufferedReader(new FileReader(daten));

	        // Erste Zeile (Überschrift) überspringen
	        String zeile = br.readLine();

	        // Jetzt Zeilen einlesen
	        while ((zeile = br.readLine()) != null) {
	            String[] fragmente = zeile.split(";");
	            if (fragmente.length == 3) {
	                pstmt.setString(1, fragmente[0].trim()); // id
	                pstmt.setString(2, fragmente[1].trim()); // Bez
	                pstmt.setString(3, fragmente[2].trim()); // Kuerzel
	                pstmt.executeUpdate();
	            }
	        }
	        br.close();

	        // Daten aus DB anzeigen
	        ResultSet rs = stmt.executeQuery("SELECT * FROM bundeslaender");
	        while (rs.next()) {
	            System.out.println(
	                rs.getString(1) + " " +
	                rs.getString(2) + " " +
	                rs.getString(3)
	            );
	        }
	    }

	    // Verbindung zur DB
	    static Connection con = null;
	    static {
	        String url = "jdbc:mysql://127.0.0.1:3306/e?serverTimezone=UTC";
	        String user = "root";
	        String passwort = "mySQL";

	        try {
	            con = DriverManager.getConnection(url, user, passwort);
	        } catch (SQLException e) {
	            System.out.println("404 - Verbindung fehlgeschlagen!");
	            e.printStackTrace();
	        }
	    }
	}