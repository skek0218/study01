package study01.test04;

//method 와 변수는 반드시 영역안에 들어가야한다. class는 영역안에 들어가도 되고 안들어가도 됨
public class MethodTest {
	static int num = 1; // static 선언을 하지 않으면 main method안에서 변수를 못 가지고와서 실행이 안됨
	/*
	 * static string num="2"; // d같은 영역에서는 같은 변수명으로는 자료형을 다른걸 써도 오류남
	 * System.out.println(num); //왼쪽 처럼 class 바로 밑 영역안에서는 동작하는것들이 안됨 * 선언만 가능
	 */

	static int num() {
		return 1;
	}

	public static void main(String[] args) {

		System.out.println(num);

	}
}
