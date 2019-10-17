package study02;

public class StaticTest {

	final static int a;
	static { // 이런식으로 원래 final static int a만 써넣으면 값이 없기때문에(자바가 바꿔주기에는 final이 붙어있기때문에) 안되는데
				// static 영역으로 바로 써버리게 할수 있음
		a = 10;
	}

	public static void main(String[] args) {
		System.out.println(StaticTest.a);
	}
}
