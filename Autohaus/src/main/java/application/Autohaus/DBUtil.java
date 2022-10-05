package application.Autohaus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {

	static String url = "jdbc:mysql://localhost:3306/autohaus";
	static String user = "root";
	static String pass = "";
	static Connection con = null;
	
	public static void dbCon() throws SQLException{
		try {
		con = DriverManager.getConnection(url, user, pass);
		System.out.println("DB Verbindung erfolgreich");
			}
		catch (SQLException e) {
			System.out.println(e.getMessage());
			}
	}
	
	
	public static void dbDiscon() throws SQLException {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
				System.out.println("DB geschlossen");
			}
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	
	
	
	
	
	public static void dbExecuteUpdate(String sqlStmt) throws SQLException, ClassNotFoundException {
		Statement stmt = null;
		try {
			dbCon();
			stmt = con.createStatement();
			stmt.executeUpdate(sqlStmt);
		} catch (SQLException e) {
			System.out.println("Problem on " + e);
			throw e;
		} finally {
			if (stmt != null) {
				stmt.close();
			}
			dbDiscon();
			}
		}
	


}
