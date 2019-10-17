package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		
		Connection con= null;
		try {
			con = DriverManager.getConnection(ConnectionTest3.URL, ConnectionTest3.ID, ConnectionTest3.PWD);
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제할 아이디를 작성해 주세요 :");
			String id = scan.nextLine();
			String sql = "delete from user_info where id = '" + id + "'";
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql);
			System.out.println("삭제된 갯수 :" + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
				
	}
}
