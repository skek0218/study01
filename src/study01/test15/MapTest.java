package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		/*
		 * String str = "2019-08-01"; System.out.println(str.replace("-", ",")); //이것도
		 * substring처럼 데이터 자체가 변하는건아니다 다른 스트링에 저장해서 리턴해서 보여주는것 System.out.println(str);
		 * str = str.replace("-", ","); //완전히 바꾸려먼 이렇게 새로 정의해줘야댐
		 * System.out.println(str);
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("보물1호", "컴퓨터");
		map.put("선호음식", "초밥");
		map.put("해야할일", "많다...");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) { // is,has 이런것들은 리턴값이 boolean이다. hasNext는 다음거 가지고있어라고 묻는 명령어
			String key = it.next(); // 하나씩 key를 뺴와서 key라는 곳에 담는것
			System.out.println(key);
			String value = map.get(key); // 나온 키값을 가지고 value에 담는것
			System.out.println(value);
		}
	}
}
