package study01.test14;

import java.util.ArrayList;

public class Execute {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("박도영");
		p.setAge(24);
		p.setAddr("안양");
		ArrayList<Person> pList = new ArrayList<Person>();
		pList.add(p);
		p = new Person();
		p.setName("하늘");
		p.setAge(24);
		p.setAddr("인천");
		pList.add(p);
		p=pList.get(0);
		//p.setName("재빈");
		System.out.println(pList.get(0));
		System.out.println(pList.get(1));
	}
}
