package com.test01;

import java.util.Scanner;

public class IfTest01 {
	
	//�ܵ� if�� , �ƴϸ� �ǳʶڴ�...
	//1) ���ǹ��� ��� ���� ��(true)�� {}�ȿ� �ִ� �ڵ带 ����
	//2) ���ǽ��� ��� ���� ����(false)�� {}�ȿ� �ִ� �ڵ带 �����ϰ� �Ѿ��.
	
	public void testIf(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		//¦������ ������ Ȯ��
		if(num %2 == 0 ) {
			//���ϰ�� ������(true)
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�. ");

			//¦���� �ƴ��� ������ Ȯ����(Ȧ���� �����ϴ� ��!)
			if(num % 2!= 0) {System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");}
		
			//���ǰ� ������� ����
			System.out.println("���α׷� ����");
			
		}
	}
}
