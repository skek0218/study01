package study01.test06;

public class MethodTest {

	public static void main(String[] args) {
		/*
		 * String str = "123"; String str1 = new String ("123"); String str2 = new
		 * String ("123"); System.out.println(str1=="123"); //이거 다 false가 나옴 "123"문자가 새로
		 * 생성되지않고 str에 저장 되어 있기 때문에 str1이랑 위치가 달라서 다른 위치라고 false가 나옴
		 * System.out.println(str==str1); System.out.println(str1==str2);
		 * System.out.println(str==str2);
		 * 
		 * System.out.println(str.contentEquals(str1)); //이것만 true가 나옴 이게 값을 비교하는 것
		 */

		String str = "가나다라마";
		int idx = str.indexOf("라"); // 글자 찾는 method 몇 번째 방에있는지 확인해줌
		System.out.println("10는 str의" + idx + "index자리에 있네요");

		String name = "경훈,선호,영현,종서,동민,혜영";
		String[] strs = name.split(",");
		for (int i = 0; i < strs.length; i++) {
			System.out.println("이름 :" + strs[i]);
		}
	}
}
