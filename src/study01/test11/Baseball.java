package study01.test11; //작업중!

import java.util.Random;
import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int[] set = new int[3];
		int[] con = new int[3];

		// 입력부
		for (int i = 0; i < set.length; i++) {
			set[i] = r.nextInt(10);
			for (int j = i - 1; j >= 0; j--) {
				if (set[i] == set[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < set.length; i++) {
			con[i] = Integer.parseInt(s.nextLine());
		}

		// 출력부
		for (int i = 0; i < set.length; i++) {
			System.out.println(con[i]);

		}

		for (int i = 0; i < set.length; i++) {
			if (con[i] == set[i]) {
				System.out.println("1strike");
			} else if (con[0] == set[1] || con[0] == set[2] || con[1] == set[0] || con[1] == set[2] || con[2] == set[0]
					|| con[2] == set[1]) {
				System.out.println("1ball");
			} else
				System.out.println("out");
		}

	}
}