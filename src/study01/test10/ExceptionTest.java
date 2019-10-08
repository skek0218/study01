package study01.test10;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		String strNum = scan.nextLine();
		try {
			int num = Integer.parseInt(strNum);
			System.out.println("입력하신 숫자는 " + strNum + " 입니다.");
		} catch (Exception e) {
			System.out.println(strNum + "은 숫자가 아닙니다.");
		} finally {	//오류 여부와 상관없이 뭔가 실행하게 할 때 씀
			System.out .println("오류가 나든 안나든 실행되는 것"); 
		}
		System.out.println("종료합니다.");
	}
}
