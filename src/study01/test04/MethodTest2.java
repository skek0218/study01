package study01.test04;

public class MethodTest2 {

	static void test() {
		System.out.println(1);
	}

	static int getNum() {

		return 0;
	}

	public static void main(String[] args) {
		test();
		int a = getNum();
		System.out.println(a);
	}
}
