//6.23 ����

package com.test01;

import java.util.Scanner;

public class WhileTest01 {
	public static void main(String[] args) {
		
//		WhileTest01.test1(); 
////		WhileTest01.test2();
//		WhileTest01.test3();
//		WhileTest01.test4();
		WhileTest01.test5();
	}

	public static void test1() {
		int i = 1;
		
		while(true) {
			System.out.println(i+"��° �ݺ��� ������...");
			i++;
			}
		System.out.println("while ���� �� i��: " +i);
		}
	public static void test2() {
		//���ڿ��� �Է¹޾� �ε������� �������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = sc.next();
		
		//1.
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4));
	
		//2.
//		int index = 1;
//		int no =0;
//		while(index<6);
//		  System.out.println(str.charAt(no));
//		  no++;
//		  index++;

//		//3.
//		int index = 1;
//		while(index<6) {
//		  System.out.println(str.charAt(index-1));
//		  index++;
//		}
			
//		//4.
//		int index = 0;
//		while(index<5) {
//		  System.out.println(str.charAt(index));
//		  index++;
//		}
		
		//5.
		int index = 0;
		while(index<str.length()) {
		  System.out.println(str.charAt(index));
		  index++;
		}		
		
		
		
		
		
}
	public static void test3() {
//		1���� �Է¹��� �� ������ ������ ���� ���� �������.
		System.out.print("���� �ϳ� �Է�: ");
		int num = new Scanner(System.in).nextInt();
		
		int sum = 0;
		
		int i = 1;
		while(i<=num) {
			sum += i;
			
			i++;
		}
		System.out.println("sum: "+ sum);
		
		
		
	}
	public static void test4() {
		int i = 1;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==100) {
				break;
			}
		}
		System.out.println("while�� ���� �� �� i�� : : " + i);
	}
	public static void test5() {
		//Ű����� 4�� �Է¹����� ���� �ݺ�
		//4�� �ԷµǸ� while�� ����.
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�����Է�[1~10]: ");
			int i = sc.nextInt();
			
			if(i==4) {
				System.out.println("4�Է�!!!! ����!!!");
				break;
			}
			}
		}
	
	}





