package study02.algorithm;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for (int i = 1; i < 10; i++) {
			System.out.println(s+"*"+i+"="+Integer.parseInt(s) * i);
		}
	}
}
