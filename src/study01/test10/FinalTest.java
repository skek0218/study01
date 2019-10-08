package study01.test10;

public class FinalTest {

	final int num = 1; // 선언과 동시에 초기화를 해주지않으면 java가 초기화 해버리기때문에 final int; 로는 사용할 수 없다.
						// 그렇기 때문에 static과 같이 쓴다(new *** 하면 안되기 때문)

	public static void main(String[] args) {
		final int a = 3; // 한번 final 선언하면 값을 바꿀수 없다!
		int num = 3;
		String str = "넘은 3이 맞습니다.";
		if (num != 3) {
			str = "넘은 3이 아닙니다.";
		}
		System.out.println(str);

		str = (num == 3) ? "넘은 3이 맞습니다." : "넘은 3이 아닙니다."; // 삼항 연산자라고 함, 맞으면 첫번째꺼, 틀리면 뒤에꺼 나온다고함
		System.out.println(str);

		System.out.println(str instanceof String);
	}
}
