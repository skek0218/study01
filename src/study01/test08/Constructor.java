package study01.test08;

class Father {
	int a;

	Father() {
		System.out.println("1. 난 아빠클래스의 생성자임!");
	}
}

public class Constructor extends Father {
	Constructor() {
		System.out.println(a);
		System.out.println("2. 난 생성자 클래스의 생성자임!");
	}

	public static void main(String[] args) {
		Constructor c = new Constructor(); // father에 있는 메모리를 먼저 실행 후 정보를 받고 constructor로 내려옴
	}
}
