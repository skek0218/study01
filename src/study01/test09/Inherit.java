package study01.test09;

import java.util.Scanner;

import study01.test08.Atom;

public class Inherit extends Atom { // import를 쓰지 않고 public class inherit extends study01.test08.Atom이라고 써서 할 경우 같은
									// 패키지 내에 Atom이 또 있을 경우 밑에서 Atom 초기화는 같은 패키지내에 Atom이 초기화됨

	public static void main(String[] args) {
		System.out.println(new Inherit()); // 이러면 주소가나오지만 toString메소드 오버라이드로 다른것도 쓸수있당
		/*
		 * Object obj = 1; obj= "1"; obj = "true"; obj = new Scanner(System.in); obj =
		 * new Atom(); obj = new Inherit();
		 */ // 이런식으로 object는 다 넣을수있음 java에 있는 것들이 다 객체기때문

	}
}
