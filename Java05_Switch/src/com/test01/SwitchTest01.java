//6.22 ����
//7.5 ����
package com.test01;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		

	}

	public void test2() {
		char ch = 'd';
		
		switch(ch) {
		case 'a' :
			System.out.println("a�Դϴ�.");
			break;
		case 'b' :
			System.out.println("b�Դϴ�.");
			break;
		case 'c' :
			System.out.println("c�Դϴ�.");
			break;
		default : 
			System.out.println("�ٸ� ���� �Դϴ�.");
		}
	}
	
	public void test3() {
		int i = 1;
		
		switch(i) {
		case '1' :
			System.out.println("Ȧ��");
			break;
		case '2' :
			System.out.println("¦��");
			break;
		case '3' :
			System.out.println("Ȧ��");
			break;
		case '4' :
			System.out.println("¦��");
			break;
		default : 
			System.out.println("�ٸ� �����Դϴ�.");
		}		
	}
	
	public void test4() {
		String s = "����";
		
		switch(s) {
		case "�ѱ�" :
			System.out.println("KOR");
			break;
		case "�̱�" :
			System.out.println("USA");
			break;
		case "����" :
			System.out.println("UK");
			break;
		default : 
			System.out.println("�ٸ� ���� �Դϴ�.");
		}
	}
	
	public void test5() {
		
//		//���� �ϳ��� �Է�! �������...
//		�Է¹��� ���ڰ�
//		12,1,2 �� �ܿ�
//		3,4,5�� ��
//		6,7,9�̸� ����
//		9,10,11�� ���� �̶�� ���
//		��, 1~12������ ���� �ƴϸ� "1~12������ ���� �Է����ּ���"��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է�: ");
		int month = sc.nextInt();
		
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : 
			System.out.println("�ܿ�");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("��");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("����");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("����");
			break;
		default : 
			System.out.println("1~12������ ���� �Է��� �ּ���.") ;
			}
	}
	
}
