package licence.pro.td_banque_skopal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMysql {

	private static String url = "jdbc:mysql://url:port/nomDb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String user = "user";
	private static String password = "password";
	private static Connection instance;
	
	public static Connection getInstance() {
		if (instance == null) {
			try {
				instance = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return instance;	
	}	
}
