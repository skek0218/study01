package study01.test05;

import java.util.Random; //�ٸ� ��Ű���� �ִ°� �ҷ��� ��� crtl, shift,o�� ���ؼ� import�ؾߴ�

import study01.test04.PrivateTest;

public class PublicTest {

	public int num;
	
	Random ran;
	
	public static void main(String[] args) {
		PublicTest publicTest = new PublicTest();
		System.out.println(publicTest.num);
		PrivateTest privateTest = new PrivateTest();
		System.out.println(privateTest.num);
	}
}
