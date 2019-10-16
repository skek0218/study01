package study01.test10;

import java.util.ArrayList;

public class IntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>(); // <>이거 안 쓸경우 Object가 default로 들어감
		al.add(10);
		al.add(20);
		al.add(30);

		for (int i = 0, j = 1; i < al.size(); i++) {
			System.out.println(j + "." + al.get(i));
			j++;
		}
	}
}
