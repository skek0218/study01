package study01.test05;

class Father{
	void work() {
		System.out.println("�ƹ����� ���� �Ͻʴϴ�.");
	}
}
public class Son extends Father {
	void work() {
		System.out.println("���� ���� �Ѵ�!");
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.work();
	}
}
