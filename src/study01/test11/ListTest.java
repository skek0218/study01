package study01.test11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {
		List<String> strList1 = new ArrayList<String>();
		List<String> strList2 = new LinkedList<String>(); // 순서를 외우는게 아님, 자기 앞뒤를 알고있음. 앞뒤로 연결고리가 있다고 생각하면됨
															// 리스트의 변환(삭제)의 경우 이게 처리가 빨라서 씀
		strList1.add("1"); 
		strList1.add("2");
		strList1.add("3");
		strList2.add("1");
		strList2.add("2");
		strList2.add("3");

		System.out.println(strList1.get(1));
		System.out.println(strList2);
		strList1.set(1, "4");
		System.out.println(strList1.get(1));
	}
}
