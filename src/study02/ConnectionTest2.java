package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest2 {

	public static void main(String[] args) {

		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String id = "bdi";

			String pw = "12345678";

			con = DriverManager.getConnection(url, id, pw);

			Statement stmt = con.createStatement();

			String sql = "select * from user_info";

			ResultSet rs = stmt.executeQuery(sql);

			// rs.next();
			// System.out.println(rs.getString("id"));

			List<Map<String, String>> userList = new ArrayList<Map<String, String>>();

			while (rs.next()) {
				// System.out.print(rs.getString("id")+",");
				Map<String, String> userMap = new HashMap<String, String>();
				userMap.put("id", rs.getString("id"));
				userMap.put("pwd", rs.getString("pwd"));
				userMap.put("name", rs.getString("name"));
				userMap.put("age", rs.getString("age"));
				userMap.put("etc", rs.getString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close(); // 연결을 끊어주는것 이것도 무조건 try catch가 있어야됨
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
