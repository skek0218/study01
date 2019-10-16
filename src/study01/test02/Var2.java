package study01.test02;

public class Var2 {
	static int a = 5;

	static void A() {
		System.out.println("A ����");
	}

	public static void main(String[] args) {
		for (; a >= 1; a--) {
			A();
		}
	}
}
