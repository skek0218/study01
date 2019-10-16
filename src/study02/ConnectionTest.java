package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//오라클로 서버접속한다는 명령어
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "bdi";
			String pwd = "12345678";
			
			Connection con = DriverManager.getConnection(url, id, pwd);//접속하는 포트 id 비번 등등 연결
			
			String sql = "select * from user_info"; // 쿼리문 명령어
			
			Statement stmt = con.createStatement(); //쿼리에서 하얀색 창을 만들어 주는것과 같은느낌
			
			ResultSet rs = stmt.executeQuery(sql); //그 하얀색창안에서 쿼리문 명령어를 쓰라고 하는 그런 느낌
			
			while(rs.next()) { //이게 쿼리에 그리드결과에 나오는 값을 보기위한 문장, 처음에 시작은 테이블 바로 위 시야기때문에 원하는 데이터를 찾고자하면은 next해야한다
				System.out.println(rs.getString("id"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
