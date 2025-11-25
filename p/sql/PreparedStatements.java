package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class PreparedStatements {

	public static void main(String[] args) throws SQLException {
		Statement stmt = con.createStatement();
		
		String einfuegeZeile = "insert into e.test (vorname, nachname) values (?,?)"; 
		PreparedStatement pstmt = con.prepareStatement(einfuegeZeile);
		
		String vorname = "Karl";
		String nachname = "vom Dach";
		
		pstmt.setString(1, vorname);
		pstmt.setString(2, nachname);
		pstmt.executeUpdate();
		
		ResultSet rs = stmt.executeQuery("select * from e.test");
		while (rs.next()) {
			System.out.println(rs.getString("vorname") + " " + rs.getString("nachname"));
		}
	}

	static Connection con = null;
	static {
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";

		try {
			/* Connection */ con = DriverManager.getConnection(url, user, passwort);
		} catch (SQLException e) {
			System.out.println("Da ist etwas schief gelaufen");
		}
	}
}
