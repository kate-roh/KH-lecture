//6.22 ����
//7.5 ����

package com.test02;

public class Test {
	public void test01(int i) {
		if(i%5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		}

	}
	public void test02(int i) {
		if ((i%2==0) && (i%3==0)){
			System.out.println("2�� 3�� ����Դϴ�.");
		} else {
			System.out.println("2�� 3�� ����� �ƴմϴ�.");
		}

	}
	public void test03(char c) {
		if(Character.isUpperCase(c)) {
			System.out.println("�빮�� �Դϴ�.");
		} else if(Character.isLowerCase(c)) {
			System.out.println("�ҹ��� �Դϴ�.");
		}


	}
}