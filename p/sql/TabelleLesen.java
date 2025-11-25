package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TabelleLesen {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
		
		Connection con = DriverManager.getConnection(url, user, passwort);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from e.test");
		rs.next(); // von VOR dem ersten DS den DS-Zeiger auf den 1. DS pos. (Returns: true if the new current row is valid; false if there are no more rows)
		System.out.println(rs.getString(1) + " heisst mit Vornamen " + rs.getString(2)); // Walkes heisst mit Vornamen Otto
		System.out.println(rs.next());
		System.out.println(rs.getString(1) + " heisst mit Vornamen " + rs.getString("vorname")); // Sorglos heisst mit Vornamen Susi
		System.out.println(rs.next()); // false
//		System.out.println(rs.get);
//		Übung: Iterieren Sie bitte über die virtuelle Tabelle (ResultSet).
//		Geben Sie Vor- und Nachnamen i.d. Console aus.
	}

}
