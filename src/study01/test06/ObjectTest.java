package study01.test06;

public class ObjectTest {

	int num1;
	int num2;
	String str = "abc";

	public static void main(String[] args) {
		ObjectTest objectTest = new ObjectTest();
		objectTest.num1 = 5;
		objectTest.num2 = 10;
		System.out.println(objectTest.num1);
		System.out.println(objectTest.num2);
		objectTest = new ObjectTest(); // 이건 덮어쓰는게아니고 새로 메모리가 만들어진것 그 후에 전에있던 메모리랑 objectTest에 연결고리가 끊기고 새로운 메모리에
										// 연결이되는것
		System.out.println(objectTest.num1);
		System.out.println(objectTest.num2);
		ObjectTest objectTest2 = new ObjectTest();
		System.out.println(objectTest == objectTest2); // 이거는 변수가 ObjectTest라는 정해져있지 않은 변수기 때문에 false 임
		System.out.println(objectTest.num1 == objectTest2.num1); // 이거는 각각의 num1이라는 변수에 자료형이 int며 정해져있는 자료형이기 때문에 true 임
		System.out.println(objectTest.str == objectTest2.str); // 이거는 true인데 아마 string 자료형이 new 값이 필요하지않은 자바가 메모리 할당을 하기
																// 때문에 true인것같음

	}
}
