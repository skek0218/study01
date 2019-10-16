package study01.test09;

class ObjectTest2 {
	static int num2 = 2;
}

public class ObjectTest {

	int num1;
	static int num2;

	public static void main(String[] args) {
		System.out.println(num2);
		num2 = 3; // 같은 클래스안에 있기 때문에 ObjectTest.num2 라고 따로 안 써줘도 됨 하지만 정석은 ObjectTest.num2이렇게 써주는게
					// 정석이라고함
		System.out.println(num2);
		System.out.println(ObjectTest2.num2); // 다른 클래스 안에 있는 거라면 이렇게 어디있는지 알려줘야댐
		ObjectTest ot = new ObjectTest();
		ot.num2 = 10;
		ot = new ObjectTest(); // 아무리 초기화를 해도 num2는 초기화 되지않음 static 영역에 들어감
		Abc abc = new Abc();
		abc.abc();
		System.out.println(num2);
	}
}

class Abc {
	public static void abc() {
		ObjectTest.num2 = 5;
	}
}