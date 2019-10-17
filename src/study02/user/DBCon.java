package study02.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL; // 값이 바뀔리가 없기 때문에 static final로 함.
	private static final String ID;
	private static final String PWD;
	private static final String DRIVER_NAME;

	static {
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "bdi";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static Connection con;

	/*public static Connection getCon() throws SQLException { // throws는 그냥 미룬느낌, 니가 이걸쓸꺼면 알아서 exception 처리를 해라~!
		if (con == null) {
			con = DriverManager.getConnection(URL, ID, PWD);
		}
		return con;
	}*/
	public static Connection getCon() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, ID, PWD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	
	public static void main (String[] args) {
		
	}

}
