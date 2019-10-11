package study01.test11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapTest {

	public static void main(String[] args) {
		HashMap<String,String> human = new HashMap<String,String>(); //앞에꺼가 key(방번호로 이해하면됨), 뒤에가 들어갈 내용
		human.put("이름", "홍길동"); 
		human.put("나이", "33");
		human.put("주소", "서울 강서구");
		human.put("성별","남자"); 
		human.put("성별","여자"); //같은 key에 새로운 값을 집어넣으면 마지막에 저장한 값만 나옴 
		System.out.println(human);
		
		List<HashMap<String, String>> people = new ArrayList<HashMap<String,String>>(); //이렇게 쓸수도있음
		people.add(human);
		people.add(human);
		people.get(1).put("이름","김길동"); //두개의 방이 human 이라는 변수가 바라보는 메모리에 있는 값으로 만들어진 방에 있는 것이라 하나만 바껴도 두개의 방의 값이 다 바뀜
		human = new HashMap<String,String>(); //이거는 메모리 새로 생성해도 people에 있는 값이 안바뀜 그 전 메모리 그대로 바라보고 있음.
		System.out.println(people);
		
		//정리를 해보자면, 처음 초기화를 하고 값을 넣은 후 new 메모리 생성 할 때 기존에 값이 있던 메모리를 초기화 시키는게 아니고 
		//새로운 메모리 방을 생성하는 것이기 때문에 기존 방을 바라보던 명령어는 그대로 기존 방을 보면서 실행된다.

	}
}
