package study01.test01;

import java.util.Scanner;

public class HowOldRU {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�� ����̾�?");
		String age = scan.nextLine();
		System.out.println("��" + age + "���̾�~");
		int num = Integer.parseInt(age); // age��� ������ �м��ؼ� ��Ʈ�� �ٲ��ִ� �� error�� Ȯ���� �ֱ⶧���� �����ϰ� ������ ��� �����������

		if (num <= 10) {
			System.out.println("���");
		} else if (num <= 20) {
			System.out.println("û�ҳ�");
		} else if (num <= 40) {
			System.out.println("û��");
		} else {
			System.out.println("����");
		}
	}
}
