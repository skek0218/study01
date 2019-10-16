package study01.test14;

interface Test12 {

}

public abstract class AbstractTest { // 추상클래스는 new로 메모리 생성이 안된다. 상속주기 위한 용도로 쓰임
										// 공통으로 쓸만한거는 추상메소드로 안만들어서 그냥 상속주고 각각에 필요한 것들은
										// 추상메소드로 선언만해주고 상속받는곳에서 개인의 맞게 사용하는것

	public abstract void test();

	public void test1() {

	}

	public static void main(String[] args) {
		Son at = new Son();
		at.test1();
	}
}

class Son extends AbstractTest implements Test12 {
	public void test() {
		System.out.println("test");
	}
}
