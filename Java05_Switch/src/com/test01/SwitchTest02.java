//6.22 ����
//7.5 ����
package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void testSwitch() {
		//���� �ΰ��� �����ȣ����(+,-,*,/)1���� �Է¹޾Ƽ�,
		//�����ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ���.
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ù��° ��: ");
	int no1 = sc.nextInt();
	
	System.out.println("�ι�° ��: ");
	int no2 = sc.nextInt();
	
	System.out.println("������ (+,-,*,/): ");
	char op = sc.next().charAt(0);
	
	int res = 0;
	boolean flag = true;
	
	switch (op) {
	case '+' :
		res = no1+no2;
		break;
	case '-' :
		res = no1-no2;
		break;
	case '*' :
		res = no1*no2;
		break;
	case '/' :
		res = no1/no2;
		break;
	default:
		System.out.println("�߸��� �����ȣ�� �Է��Ͽ����ϴ�.");
		flag = false;
	}
	
	if(flag) {
	System.out.println(no1 + "" + op + "" + no2 + "=" + res);
}
	
}
}
