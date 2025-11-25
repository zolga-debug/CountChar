package p.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DSeinfügen {

	public static void main(String[] args) throws SQLException {
		Statement stmt = con.createStatement();
		/*ResultSet rs = */ stmt.executeUpdate("insert into e.test (vorname,nachname ) value ('Hans','Wurst')");
		ResultSet rs = stmt.executeQuery("select * from e.test");
		while(rs.next()) {
			System.out.println(rs.getString("vorname") + " " + rs.getString("nachname"));
		}
	}
	static Connection con = null;
	static {
		String url = "jdbc:mysql://127.0.0.1:3306?serverTimezone=UTC";
		String user = "root";
		String passwort = "mySQL";
		
		try {
			/*Connection*/ con = DriverManager.getConnection(url,user,passwort);
		} catch (SQLException e) {
			System.out.println("Da ist etwas schief gelaufen");
		}
	}
}
