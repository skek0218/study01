package study01.test04;

import java.util.Random;

public class ObjectTest {

	int age; //Ŭ���� �ٷ� �ؿ��ִ� ������ ���������� �Ͽ� �ʱⰪ�� 0 ���� ������!
	String name;
	
	String getStr() {
		return null;
	}
	// Random r;
	/*public ObjectTest() { //�̰� method�� �ƴϰ� �����ڶ�� ��, �ڹٿ����� �Ҹ��ڴ� ���ξ���
		
	}
	*/
	public static void main (String[] args) {
	
		ObjectTest objectTest = new ObjectTest();
		
		System.out.println(objectTest.age);
		System.out.println(objectTest.name);
	// System.out.println(objectTest.r.nextInt()); �̰Ŵ� ������, r���� �ʱ�ȭ���� �ʾұ⶧���� (runtime exception)
	}
}
