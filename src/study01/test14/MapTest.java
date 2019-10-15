package study01.test14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("이름", "홍길동");
		map.put("나이", "33");
		List<HashMap<String, String>> mapList = new ArrayList<HashMap<String, String>>();
		mapList.add(map);
		map = new HashMap<String, String>();
		mapList.add(map);
		for (int i=0;i<5;i++) {
			map.put("이름", "홍길동"+(i+1));
			map.put("나이", "33."+(i+1));
			mapList.add(map);
			map = new HashMap<String, String>();
		}
		for (int i=0;i<mapList.size();i++) {
			System.out.println(mapList.get(i));
		}
		// List<List<HashMap<String,String>>> mapListMapList; 이렇게도 사용가능
		/*HashMap<String, List<HashMap<String, String>>> totalMap = new HashMap<>();
		totalMap.put("주소록", mapList);
		mapList = new ArrayList<>();
		map.put("구구", "후후");
		map.put("고고", "호호");
		mapList.add(map);
		map = new HashMap<String, String>();
		map.put("주주", "두두");
		map.put("조조", "도도");
		mapList.add(map);
		totalMap.put("막쓴거", mapList);
		System.out.println(totalMap);*/
	}
}
