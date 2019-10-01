package study01.test05;

import java.util.Random; //다른 패키지에 있는걸 불러올 경우 crtl, shift,o를 통해서 import해야댐

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
