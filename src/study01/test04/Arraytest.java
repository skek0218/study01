package study01.test04;

import java.util.Random;

public class Arraytest {

	public static void main(String[] args) {
		int[] nums = new int[6];
	
		//System.out.println(nums.length);
		/*long l = 12345678912l; // �⺻ �ڷ����� int �� ������ int������ �Ѿ�� ���ڴ� long ����  ���� �ڿ� l�� �ٿ������
		
		double db = 1.1;
		float f = 1.1f; // �̰͵� �⺻ �ڷ�����  double�̱⶧���� float�� ������ float�̶�� �˷��ֱ����� �ڿ� f�� �ٿ���ߵ�*/
		
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i]= r.nextInt(45)+1;
			for (int j=i-1;j>=0;j--) {
				if(nums[i]==nums[j]) {
					i--; //�̰� ���ؼ� i���� ��� j������(�� �����)�� �� i�� ���̳ʽ� �ؼ� ū for�� �� i++�� �ٽ� ���������� ���ư�
					break;
				}
			}
		}
	}
}
