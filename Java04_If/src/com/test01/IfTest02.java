package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//���߿� �Ѱ��� �����ϴ� ���ǹ�, ������ ���� ���� ���� �ƴ� ��쿡 �����ϴ� ��ɾ
	//���� �ۼ��ϴ� ��쿡 ���
	
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i+"�� 10���� �۽��ϴ�.");
			}else {
				System.out.println(i+"�� 10���� ũ�ų� �����ϴ�.");
			}
	}
	
	public void test2() {
		//���ڸ� �ϳ� �Է¹޾� Ȧ��¦������ �����.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���:");
		int num = sc.nextInt();
		
		//���ǽ��� �ݵ�� true, false�� �������� �ۼ�!!
		if(num %2 == 0) {
			//������ true�϶� ������ ����
			System.out.println("¦���Դϴ�!");
		}else {
			//������ false�϶� ������ ����
			System.out.println("Ȧ���Դϴ�!!");
		}			
	}
	
	public void test3() {
		//���ڸ� �ϳ� �Է¹޾�
		//1)50���� ū �����? ->¦������ Ȧ������ �Ǵ��� ����Ѵ�.
		//2)50���� ���� �����? -> '�۴�'��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("0���� ū ���� �Է�: ");
		int no = sc.nextInt();
	
 		if(no >= 50) {
			
 			if(no%2==0) {
 				System.out.println("i�� 50���� ū ¦��");
 				
 			}else {
 				System.out.println("i�� 50���� ū Ȧ��");
 			}
 			
		}else {
			System.out.println("i�� 50���� �۴�");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
