package study01.test01;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();
		System.out.println("난" + age + "살이야~");
		int num = Integer.parseInt(age); // age라는 변수를 분석해서 인트로 바꿔주는 것 error날 확률이 있기때문에 인지하고 오류날 경우 수정해줘야함

		if (num <= 10) {
			System.out.println("어린이");
		} else if (num <= 20) {
			System.out.println("청소년");
		} else if (num <= 40) {
			System.out.println("청년");
		} else {
			System.out.println("꼰대");
		}
	}
}