package study01.test15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("게임1", "롤");
		map.put("게임2", "도타");
		map.put("게임3", "배그");

		Iterator<String> str = map.keySet().iterator();

		while (str.hasNext()) {
			String a = str.next();
			System.out.print(a + "=");
			String b = map.get(a);
			System.out.println(b);
		}
	}
}
