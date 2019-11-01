package study02.algorithm;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int r = 0;
		for (int i = 1; i <= x; i++) {
			r += i;
		}
		System.out.println(r);
	}
}
