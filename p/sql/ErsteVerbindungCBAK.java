package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ErsteVerbindungCBAK {

	public static void main(String[] args) throws SQLException {
		//Bitte suchen Sie auf Ihrer Windows-Festplatte die Datei 
		//z.B.: mysql-connector-java-8.0.16.jar
		//Mit unserem PRG  suchen z.B.: mysql connector jar
		
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
		
		
		try (Connection con = DriverManager.getConnection(url, user, passwort)) {
            System.out.println(" Verbindung erfolgreich hergestellt!");
        } catch (SQLException e) {
            System.out.println(" Da ist etwas schief gelaufen: " + e.getMessage());
        }

        System.out.println("Programm beendet.");
	}

}
