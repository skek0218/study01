package study01.test08;

class Animal {

}

class Dog extends Animal {

	public void test() {
		System.out.println("난 도그의 테스트 메소드야!");
	}
}

public class Jindo extends Dog {

	public static void main(String[] args) {
		Jindo j = new Jindo(); // 상속 받는쪽에서 생성자를 호출해도 상속해 주는 쪽의 메모리를 불러올 수 있다.
								// 그리고 상속의 상속 관계에서도 불러올수있음 (animal을 jindo랑 dog를 불러올수있음)

	}
}
