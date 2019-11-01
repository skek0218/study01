package study02.algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public boolean solution(String[] phone_book) {
		String str = "";
		boolean answer = true;
		for (int i = 0; i < phone_book.length; i++) {
			str += phone_book[i];
		}
		for (int i = 0; i < phone_book.length; i++) {
			if (str.indexOf(phone_book[i]) == -1) {
				answer = true;
			} else {
				answer = false;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "123";
		strs[1] = "456";
		strs[2] = "789";
		Solution1 s = new Solution1();
		System.out.println(s.solution(strs));
		
		
		String str ="123456789";

	}
}
