package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "c##test";
	private static String password = "c##test";
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static Connection conn = null;
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	public static Connection getConnection() throws SQLException {
		if(conn==null) {
			conn = DriverManager.getConnection(url, user, password);
		}
		return conn;
	}
	public static void close() {
				if(conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}conn = null;
	}

}
