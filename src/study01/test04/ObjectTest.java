package study01.test04;

import java.util.Random;

public class ObjectTest {

	int age; //클래스 바로 밑에있는 변수는 멤버변수라고 하여 초기값이 0 으로 잡힌다!
	String name;
	
	String getStr() {
		return null;
	}
	// Random r;
	/*public ObjectTest() { //이거 method가 아니고 생성자라고 함, 자바에서는 소멸자는 따로없음
		
	}
	*/
	public static void main (String[] args) {
	
		ObjectTest objectTest = new ObjectTest();
		
		System.out.println(objectTest.age);
		System.out.println(objectTest.name);
	// System.out.println(objectTest.r.nextInt()); 이거는 오류남, r값이 초기화되지 않았기때문에 (runtime exception)
	}
}
