package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest3 {

	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // 값이 바뀔리가 없기 때문에 static final로 함.
	public static final String ID = "bdi";
	public static final String PWD = "12345678";
	public static final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";

	public static void main(String[] args) {
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, ID, PWD);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
