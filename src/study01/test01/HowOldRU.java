package study01.test01;

import java.util.Scanner;

public class HowOldRU {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("너 몇살이야?");
		String age = scan.nextLine();
		System.out.println("난" + age + "살이야~");
	}
}
