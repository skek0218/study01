package study01.test11;

class Father {
	public void test() {
		System.out.println("나는 아빠 테스트");
	}
}

public class Son extends Father {
	public void test() {
		System.out.println("난 아들 테스트");
	}

	public void sonsTest() {
		System.out.println("난 아빠한테는 없는 기능이 있음.");
	}

	public static void main(String[] args) {
		Father s = new Son();

		Father f = new Father();

		s.test();
		f.test();

		Son s2 = (Son) s; // 형변환, 메모리 생성을 Son으로 했을 경우에만 가능
		s2.sonsTest();

		if (f instanceof Son) { // 이걸로 메모리 생성을 뭘로했는지 확인 가능 f라는 변수가 Son으로 메모리 생성을 했는지, Father로 메모리 생성을 했는지 확인
			s2 = (Son) f; // 이거는 메모리생성도 Father로 했기 때문에 형변환 할수가없음
			s2.sonsTest();
		}
	}
}
