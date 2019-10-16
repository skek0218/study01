package study01.test07;

public class OverLoading { // overloading에 대한 개념, 매소드는 parameter에 따라 매소드명이 같게도 가능 예)) println ㅎㅎ
	public void test() {
		System.out.println("test() 메소드 호출!");
	}

	public void test(int num) {
		System.out.println("test(int num) 매소드 호출!");
	}

	public void test(String str) { // parameter에 variable 에 datatype이 다르면 가능
		System.out.println("test(String str) 매소드 호출!");
	}

	public void test(String str, int num) { // parameter에 variable에 datatype 갯수가 다르면 가능
		System.out.println("test(String str, int num) 매소드 호출!");
	}

	public void test(int num, String str) { // parameter에 들어간 datatype에 위치가 달라도 가능(어차피 호출할때 순서대로 찍기때문에 위치에 대한 자각능력이 있음을
											// 확인할수있음)
		System.out.println("test(int num, String str) 매소드 호출!");
	}

	public static void main(String[] args) {
		OverLoading over = new OverLoading();
		over.test();
		over.test(1);
		over.test("a");
		over.test("a", 1);
		over.test(1, "a");
	}
}
