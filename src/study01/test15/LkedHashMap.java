package study01.test15;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LkedHashMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String, String>();
		map.put("음료수1", "커피");
		map.put("음료수2", "맥주");
		map.put("음료수3", "진로");
		map.put("음료수4", "와인");
		map.put("음료수8", "럼주");
		map.put("음료수5", "막걸리");
		map.put("음료수6", "칵테일");
		map.put("음료수7", "두유");
		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println("Key:" + key + "Value:" + map.get(key));
		}
	}
}
