package study01.test04;

//method �� ������ �ݵ�� �����ȿ� �����Ѵ�. class�� �����ȿ� ���� �ǰ� �ȵ��� ��
public class MethodTest {
	static int num = 1; // static ������ ���� ������ main method�ȿ��� ������ �� ������ͼ� ������ �ȵ�
	/*
	 * static string num="2"; // d���� ���������� ���� ���������δ� �ڷ����� �ٸ��� �ᵵ ������
	 * System.out.println(num); //���� ó�� class �ٷ� �� �����ȿ����� �����ϴ°͵��� �ȵ� * ���� ����
	 */

	static int num() {
		return 1;
	}

	public static void main(String[] args) {

		System.out.println(num);

	}
}
