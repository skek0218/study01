package study01.test01;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		System.out.println("1���� �ζ� ��ȣ�� �Է����ּ���.");
		Scanner scan=new Scanner(System.in); 
		int num1=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ù��° ��ȣ:" + num1);
		
		System.out.println("2���� �ζ� ��ȣ�� �Է����ּ���.");
		int num2=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� �ι�° ��ȣ:" + num2);
		
		System.out.println("3��° �ζ� ��ȣ�� �Է����ּ���.");
		int num3=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ����° ��ȣ:" + num3);
		
		System.out.println("4��° �ζ� ��ȣ�� �Է����ּ���.");
		int num4=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ����° ��ȣ:" + num4);
		
		System.out.println("5��° �ζ� ��ȣ�� �Է����ּ���.");
		int num5=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ����° ��ȣ:" + num5);
		
		System.out.println("6��° �ζ� ��ȣ�� �Է����ּ���.");
		int num6=Integer.parseInt(scan.nextLine());
		System.out.println("�ϰ� �Է��� ����° ��ȣ:" + num6);
		
		Random r = new Random();
		System.out.println("�̹��� �ζ� ��ȣ�� �εε�~~");
		int correctCnt=0;
		for(int i=1;i<=6;i++) {
			int rNum = r.nextInt(45)+1;
			System.out.println(i+".��° :" + rNum);
			if(rNum==num1||rNum==num2||rNum==num3||rNum==num4||rNum==num5||rNum==num6) {
				correctCnt++;
			}
		}
		System.out.println("�� ���� ���� :" + correctCnt);
	}
}
