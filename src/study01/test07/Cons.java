package study01.test07;

import java.util.Scanner;

public class Cons { // constructor

	int num;

	public Cons() { // return type 없는것과 overriding을 제외하고는 매소드가 가지고 있는 것과 똑같은 성질을 가지고 있다.
					// 반드시 class 명과 같은 이름으로 지어야 한다.
					// 접근자는 protected 빼고는 다 쓸수 있음
		System.out.println("아 내가 호출되었구나!");
	}

	public Cons(int num) { // 생성자는 overriding은 되지 않지만 overloading은 왼쪽처럼 가능함.
							// 이렇게 내가 직접 생성하면 기본 생성자를 안만들어줌 그래서 int를 받는 생성자를 만들고 아무것도 안들어간 생성자도 만들고싶을 경우에는
							// 따로 또 만들어야됨
		System.out.println("아 num 파라메터가 있는 날 호출하였구나~");
	}

	public static void main(String[] args) {
		Cons c = new Cons(); // 선행되어야 하는 일이 있을떄 사용한다 (기본생성자말고 내가 만드는 생성자)
		System.out.println(c.num);
		Scanner scan = new Scanner(System.in);
	}
}
