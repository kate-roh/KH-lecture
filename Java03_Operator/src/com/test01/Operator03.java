package com.test01;
import java.util.Scanner;
public class Operator03 {
	public static void main(String[] args) {
		Operator03 test = new Operator03();
		test.opTest1();
	}

	//&(�׸���, ~�鼭)
	//�Ӥ�(�Ǵ�, ~�ų�)
	//����&&����, �����Ӥӳ���
	public void opTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է�: ");
		int num = sc.nextInt();
		
		System.out.print("1���� 100�������� Ȯ��: " + (num>=1 && num<100));
	
		System.out.print("�����ϳ� �Է�: ");
		char ch = sc.next().charAt(0);
		//�빮������ Ȯ��
		System.out.println("���빮������ Ȯ�� : " + ( ch>='A'&& ch<='Z' ));
		
		//ll
		//�Է��� ���ڰ� ��ҹ��ڿ� ������� 'y', 'Y'���� Ȯ���Ҷ�
		
		System.out.print("��� �Ͻ÷��� y�Ǵ� Y�� �Է��ϼ���:");
		char ch2 = sc.next().charAt(0);
		System.out.println("������ y���� Ȯ�� : " + (ch2 == 'y' ll ch2 =='Y'));
		
	
	}
	
	
	
}
