package study02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		List<Integer> lot = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 6; i++) {
			int x = r.nextInt(45) + 1;
			if (lot.indexOf(x) == -1) {
				lot.add(x);
			} else {
				i--;
			}
		}
		System.out.println(lot);
	}
}
