//6.22 ����
//7.5 ����

package com.test01;

import java.util.Scanner;

public class SwitchTest02 {

	public void testSwitch() {
		//���� �ΰ��� �����ȣ����(+,-,*,/) 1���� �Է¹޾Ƽ�, 
		//���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ��: ");
		no = sc.nextInt();
		
		System.out.println("�ι�° ��: ");
		no1 = sc.nextInt();
		
		System.out.println("������(+,-,*,/): ");
		no1 = sc.next().charAt(0);
		
			= 0;
			(op){
				:
				no1+no2;
			}
				no1-no2;
				
				no1*no2;
				
				no1/no2;
				
		System.out.println("�߸��� �����ȣ�� �Է��Ͽ����ϴ�.");			
				
		System.out.println("no1 + "" + op + "" + no2 + "=" + res);				
	}
		

	}