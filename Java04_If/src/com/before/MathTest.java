package com.before;
import java.util.Random;

public class MathTest {
	public static void main(String[] args){
		MathTest test = new MathTest();
		
		//test.testMath();
		//test.testRandom();
		test.pracRandom();
	}
	
	public void testMath() {
		System.out.println("PI: " + Math.PI);
		
		System.out.println("-7�� ���밪: " + Math.abs(-7));
		System.out.println("-123.4�� ���밪: " + Math.abs(-123.4));
		
		System.out.println("������ ����: " + Math.random());
	}
	
	public void testRandom() {
		//1���� 100������ ���� ���ϱ�
		int random = (int)(Math.random()*100)+1;
		
		System.out.println("random:"+ random);
		
		//0~99����
		int ran = new Random().nextInt(100);
		System.out.println("ran: " + ran);

	}
	
	public void pracRandom() {
		//int ran1 : 0~9������ ������
		//int ran2 : 1~10������ ������
		//int ran3 : 20~35������ ������
		//int ran4 : 0 �Ǵ� 1 
		
		int ran1 = new Random().nextInt(9);
				//����: (Math.random()*10); or  new Random().nextInt(10);
		int ran2 = new Random().nextInt(10);
				//���� : (int)(Math.random()*10)+1; or  new Random().nextInt(10) +1 ;
		int ran3 = new Random().nextInt(35);
				 //���� : (int)(Math.random()*16)+20; or new Random().nextInt(10) +20 ; 
		int ran4 = new Random().nextInt(1);
				//���� : (int)(Math.random()*2); or new Random().nextInt(2) ;

		System.out.println("0~9������ ������ : " + ran1);
		System.out.println("1~10������ ������ : " + ran2);
		System.out.println("20~35������ ������ : " + ran3);
		System.out.println("0 �Ǵ� 1 : " + ran4);
	}
}
