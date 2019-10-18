package study02.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Execute {
	
	Connection con = DBCon.getCon();
	Scanner scan = new Scanner(System.in);
	String a[] = new String[5];
	Statement stmt;
	
	Execute () {
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		this.a[0] = "id";
		this.a[1] = "pwd";
		this.a[2] = "name";
		this.a[3] = "age";
		this.a[4] = "etc";
	}
	
	
	void insert() {
		try {
			String sql = "insert into user_info(id,pwd,name,age,etc) values(";
			String[] strs = new String[5];
			for (int i=0;i<strs.length;i++) {
				System.out.println(a[i]+"값을 입력해주세요");
				strs[i] = scan.nextLine();				
			}
			for (int i=0;i<strs.length;i++) {
				sql += "'"+strs[i]+"',";
			}
			sql = sql.substring(0,sql.length()-1);
			sql += ")";
			int result = stmt.executeUpdate(sql);			
			System.out.println("인서트 된 갯수 :" + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	void update() {
		System.out.println("변경하고자 하는 데이터의 아이디를 입력해주세요");
		String idid = scan.nextLine();
		System.out.println("변경할 나이를 입력해주세요");
		String ageage = scan.nextLine();
		String sql = "update user_info set age="+ageage+" where id='"+idid+"'";
		try {
			stmt.executeUpdate(sql);
			String sql2 = "select * from user_info where id='" + idid +"'";
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				for (int i=0;i<a.length;i++) {
				System.out.print(rs.getString(a[i])+"  ");
				}
				System.out.println("");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void delete() {
		try {
			System.out.println("지우려는 "+a[0]+"를 입력해주세요");
			String id = scan.nextLine();
			String sql = "delete from user_info where id='" + id + "'";
			int result = stmt.executeUpdate(sql);
			System.out.println("지우기 성공한 아이디 갯수 : " + result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	void select() {
		try {
			System.out.println("아이디를 적어주시면 해당 아이디에 대한 정보가 나옵니다.");
			String id = scan.nextLine();
			String sql = "select * from user_info where id like '%" + id +"%'";
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				for (int i=0;i<a.length;i++) {
				System.out.print(rs.getString(a[i])+"  ");
				}
				System.out.println("");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	void initResponse() {
		Execute execute = new Execute();
		while (1==1) {
			System.out.println("========================================");
			System.out.println("원하는 서비스를 선택해 주세요");
			System.out.println("1. 유저생성");
			System.out.println("2. 유저삭제");
			System.out.println("3. 유저수정");
			System.out.println("4. 유저조회");
			System.out.println("q. 종료");
			System.out.println("========================================");
			String a = execute.scan.nextLine();
			if (a.equals("1")) {
				execute.insert();
			}else if (a.equals("2")) {
				execute.delete();
			}else if (a.equals("3")) {
				execute.update();
			}else if (a.equals("4")) {
				execute.select();
			}else if (a.equals("q")) {
				System.out.println("시스템 종료합니다.");
				break;
			}
			else System.out.println("잘 못 입력하셨습니다.");
		} 	
	}
	
	public static void main(String[] args) {
		Execute execute = new Execute();
		/*while (1==1) {
			System.out.println("========================================");
			System.out.println("원하는 서비스를 선택해 주세요");
			System.out.println("1. 유저생성");
			System.out.println("2. 유저삭제");
			System.out.println("3. 유저수정");
			System.out.println("4. 유저조회");
			System.out.println("q. 종료");
			System.out.println("========================================");
			String a = execute.scan.nextLine();
			if (a.equals("1")) {
				execute.insert();
			}else if (a.equals("2")) {
				execute.delete();
			}else if (a.equals("3")) {
				execute.update();
			}else if (a.equals("4")) {
				execute.select();
			}else if (a.equals("q")) {
				System.out.println("시스템 종료합니다.");
				break;
			}
			else System.out.println("잘 못 입력하셨습니다.");
		}*/
		execute.initResponse();
	}
}
