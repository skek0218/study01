package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {

		Connection con = null;
		String sql = "insert into user_info(id,pwd,name,age,etc) ";
		
		try {
			con = DriverManager.getConnection(ConnectionTest3.URL, ConnectionTest3.ID, ConnectionTest3.PWD);

			Scanner scan = new Scanner(System.in);
			System.out.println("입력할 값을 아이디, 비밀번호, 이름, 나이, 기타 순으로 입력해주세요\",\"를 기준으로");//""이런 특수문자를 쓸수없는곳에 쓸 때 \이거를 쓰면 특수문자를 쓸수있다
			String[] abc = new String[5]; 

			sql += "values (";
			for (int i=0;i<abc.length;i++) {
				abc[i] = scan.nextLine();
			}
			
			for (int i=0;i<abc.length;i++) {
				sql += "'"+ abc[i] + "',";
			}
			sql = sql.substring(0,sql.length()-1);
			sql += ")";
			
			/*			
			String info = scan.nextLine();
			String[] infos = info.split(",");  //이거는 선생님이 하신 ,기준으로 나눠서 저장한것
			sql += "values (";
			for (int i=0;i<infos.length;i++) {
				sql += ("'" + infos[i]+ "',");
			}
			sql = sql.substring(0,sql.length()-1);
			sql += ")";*/
			Statement stmt = con.createStatement();
			

			int result = stmt.executeUpdate(sql);
			
			System.out.println("인서트된 갯수 : " + result);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
