package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if : ���� ������ �� �� �ִ� ����.
	
	
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i>j)	{
			System.out.println(i+"��" + j+ "���� Ů�ϴ�.");
		}else if(i==j) {
			System.out.println(i+"��"+j + "�� �����ϴ�.");
		}else {
			System.out.println(i+"��"+j+ " ���� �۽��ϴ�.");
		}
	}
	
	public void test2() {
		//���� �ϳ� �Է¹޾�, ����� ������ ������ ����� �������
		//���,
		//90�� �̻� A���
		//90�� �̸� 80�� �̻� B���
		//80�� �̸� 70�� �̻� C���
		//70�� �̸� 60�� �̻� D���
		//60�� �̸��� F���
		
	
		//���� Ǭ��...
		//*int i = 90;
		//*int j = 80;
		//*int d = 70;
		//*int a = 60;
		
		//*if(i>100) {
		//*	System.out.println("A");}
	//*else if(i>j) {
		//*	System.out.println("B");}
		//*else if(j>d) {
		//*	System.out.println("C");}
	//*else if(d>a) {
		//*	System.out.println("D");}	
	//*else {
		//*	System.out.println("F");}	*//
		
		
		//����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point>=90) {
			grade = 'A';
		}else if(point<90 && point>=80) {
			grade = 'B';
		}else if(point<80 && point>=70) {
			grade = 'C';
		}else if(point<90&&point>=80) {
			grade = 'D';
		}else{grade = 'F';
		}

		System.out.printf("����� ������ %d�̰�, ����� %c�Դϴ�.",point, grade);

	}
	 
	public void test3() {
		//6.21�� ����...! 
		//���� �������� �� ��޺� �߰� ���� �̻��� ��쿡��
		//��޿� "+"�� �߰��Ͽ� ���.
		//��)95���̻��̸� ����� A+�� ��µǰ� ��.
		
		//6.22 Ǯ���ִ� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int point = sc.nextInt();
		char grade = ' ';
		
		if(point>=90) {
			grade = 'A';
		}else if(point<90 && point>=80) {
			grade = 'B';
		}else if(point<80 && point>=70) {
			grade = 'C';
		}else if(point<90&&point>=80) {
			grade = 'D';
		}else{grade = 'F';
		}

		System.out.printf("����� ������ %d�̰�, ����� %c�Դϴ�.",point, grade);

	}
		
		
	}
	

