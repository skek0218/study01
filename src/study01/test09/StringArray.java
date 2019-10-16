package study01.test09;

import java.util.ArrayList;
import java.util.Random;

public class StringArray {

	public static void main(String[] args) {
		/*
		 * String[] strs = new String[10]; //입력부 Random ran = new Random(); for(int
		 * i=0;i<strs.length;i++) { int rNum = ran.nextInt(10)+1; //strs[i] =
		 * Integer.toString(rNum); strs[i] = rNum+""; for(int j=i-1;j>=0;j--) { if
		 * (strs[i].equals(strs[j])) { i--; break; } } } //출력부 for(int
		 * i=0;i<strs.length;i++) { System.out.println(strs[i]); }
		 */
		String[] strs = new String[0];
		strs = new String[1];
		strs[0] = "1";
		strs = new String[2]; // 이렇게 해버리면 2개의 방을 새로 만들어서 값이 없는 채로 초기화됨
		strs[1] = "2";
		strs = new String[1]; // 방 줄일떄 다시 초기화됨

		ArrayList<String> strList = new ArrayList<String>(); // <>이거 안에 Arraylist 구조를 정해주는 것, 방 갯수를 유동적으로 조정가능
		System.out.println(strList.size()); // 기본 사이즈는 0 아무것도없을때
		strList.add("하나");
		strList.add("둘");
		System.out.println(strList.size());
		System.out.println(strList);
		strList.remove(0); // 이거는 이렇게 지워버릴수있음
		System.out.println(strList);

		String str = "ABCD";
		System.out.println(str.indexOf("C"));

		ArrayList<String> strList2 = new ArrayList<String>();
		strList2.add("홍길동");
		strList2.add("임꺽정");
		strList2.add("이문수");
		strList2.add("김문수");

		System.out.println("==우리반 출석부==");
		for (int i = 0; i < strList2.size(); i++) {
			System.out.println((i) + ". " + strList2.get(i));
		}
		System.out.println("박문수는" + strList.indexOf("박문수") + "번째 있어요~"); // 이걸로 몇번 째 있는지 찾을 수 있음

		// java에서 정해져있는 데이터타입 primary 데이터타입들을 정해져있지않은 데이터타입으로 가지고있는것들이 있음 다 앞에것만 대문자로
		// 바꾸면 됨 ,Integer이랑 Character 만 이름이 다름 이런걸 wrapper class 라고 부름
		// int a =1;
		// Integer i = 1; // 혹은 new Integer(1)로 쓸수도있음

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		System.out.println(numList);
	}
}
