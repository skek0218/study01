package study01.test11;

interface Promise {
	void test();// 선언만 가능 자기의 영역을 가질수 없음, interface내에서 접근제어자를 public 밖에 사용하지 못함, 그래서 안쓰면 걍 public으로 선언됨
	void test1();
}

class ParentClass {
	void test() {

	}
}

public class InterfaceTest implements Promise {

	int test;

	public void test() { // interface영역안에 있는 것을 그대로 가져와서 써줘야됨 (설계서대로 사용하겠다고 강제로 하는것)overriding 무조건 해줘야됨
						//overriding에 경우 상위 class 혹은 interface에 있는 접근제어자보다 큰거를 써야됨 

	}
	public void test1() {
		
	}
	
	public String toString() {
		return "핫둘셋넷";
	}
	public int a() {
		return 1;

	}
}
