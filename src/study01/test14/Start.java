package study01.test14;

final class End{ //final 하고 클래스를 쓰면 상속을 받을 수가 없음! 
	final void test() { //final 하고 메소드를 쓰면 overriding을 할 수가 없음, 약간 규칙을 강요하려고 할때 사용
		System.out.println("난 test 메소드");
	}
}

public class Start {
	
	public static void main(String[] args) {
		
	}

}
