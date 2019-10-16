package study01.test12;

public class PadTest {

	public static void main(String[] args) {
		String str = "1";
		int max = 4 - str.length();
		for (int i = 1; i <= max; i++) { // 디버깅하는 법, 옆에 파란색에 더블클릭, alt shift d -> j
											// 메소드 보는거는 그 메소드 드래그해서 crtl shift i
											// 그 다음줄로 내려가는명령어는 f6
											// f8이 끄는거
			str += "0";
			System.out.println(str);
		}
	}
}
