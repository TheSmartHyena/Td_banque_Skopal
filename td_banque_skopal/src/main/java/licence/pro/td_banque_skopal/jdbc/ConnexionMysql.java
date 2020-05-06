package licence.pro.td_banque_skopal.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionMysql {

	private static String url = "jdbc:mysql://mysql-thesmarthyena.alwaysdata.net:3306/thesmarthyena_test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String user = "199681";
	private static String password = "Rejvesh789?";
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
