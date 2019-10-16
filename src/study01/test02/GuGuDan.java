package study01.test02;

public class GuGuDan {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.print(i + "��" + "   ");
			for (int h = 1; h < 10; h++) {
				System.out.print(i + " X " + h + " = " + (i * h));
				if (h != 9) {
					System.out.print(" , ");
				}
			}
			System.out.println();
		}
	}
}
