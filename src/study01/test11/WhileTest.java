package study01.test11;

import java.util.ArrayList;

public class WhileTest {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		while (strList.size() < 7) {
			strList.add("암거나");
		}

		do { // while 문 과의 차이는 무조건 한번은 실행하게 되어있음 조건이 만족하지 않더라도
			strList.add("암거나");
		} while (strList.size() < 7);
	}
}
