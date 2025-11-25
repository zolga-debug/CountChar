package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TabelleLesen2 {

	public static void main(String[] args) throws SQLException{
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
		
		try (Connection con = DriverManager.getConnection(url, user, passwort);
	             Statement stmt = con.createStatement();
	             ResultSet rs = stmt.executeQuery("SELECT * FROM e.test")) {
			
			while (rs.next()) {
                // Zugriff mit Spalten-Index
                String nachname = rs.getString(1); 

                // Zugriff mit Spalten-Name
                String vorname = rs.getString("vorname");

                System.out.println(nachname + " heisst mit Vornamen " + vorname);
            }

        } catch (SQLException e) {
            System.out.println("Fehler: " + e.getMessage());
        }
    }
}



