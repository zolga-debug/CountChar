package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ErstesKommando {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
		
		Connection con = DriverManager.getConnection(url, user, passwort);
 
		Statement stmt = con.createStatement();
//		stmt.executeQuery("show database"); // SQLSyntaxErrorException
		stmt.executeQuery("show databases"); // 
		ResultSet rs = stmt.executeQuery("show databases"); // Rückgabe ist virtuelle Tabelle
		rs.next();//  line 1: DS-Zeiger befindet sich VOR dem ersten DS
		System.out.println(rs.getString(1)); // Beginn mit 1 statt 0 => ohne line 1: SQLException: Before start of result set
		
		System.out.println("Fertig");
	}

}
