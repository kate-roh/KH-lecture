package Silsub1;

import java.util.Scanner;

public class Munjae {

	public void test1(){
		
	}
	
	public void test2(){
		
	}
	
	public void test3(){
		
	}
	
	public void test4(){
		
	}
	
	
	
	public void test5() {
		
		//����԰� ���� ǰ
	 Scanner sc = new Scanner(System.in);
			
	 System.out.print("�̸�:");
	 String name = sc.next();
	 System.out.print("����:");
	 int age = sc.nextInt();
	 System.out. print("Ű:");
	 double height = sc .nextDouble();
			
//// if ((name ! = null) && (name.length() >0) && (age>0) && (height>0) ) {
//			System.out.println("�̸�: "+ name);
//			System.out.println("����: " +age);
//			System.out.println("Ű: " + height);
//			System.out.println(name+"�� ���̴�" + age + "�̰�, Ű��"+ height + "cm�̴�");
//			}else 1){System.out.println("������ �߸� �Է��߽��ϴ�.");	 }
////	              2){if (name==null){
//	 					System.out.println("�̸��� null");}
	 
	 
	 if(name!=null) {
		 if(name.length()>0) {
			 if(age>0) {
				 if(height>0) {
					System.out.println("�̸�: " +name);
					System.out.println("����: " + age);
					System.out.println("Ű: " + height); 
					System.out.println(name+"�� ���̴�" + age + "�̰�, Ű��"+ height + "cm�̴�");
				 }else {
					 System.out.println("Ű�� �߸� �Է��߽��ϴ�.");
				 }
			 }else {
					 System.out.println("Ű�� �߸� �Է��߽��ϴ�.");
				 }
			 }else {
				 System.out.println("�̸��� �Է����� �ʾҽ��ϴ�.");
			 }
		 }else {
			 System.out.println("�̸��� null�Դϴ�.");
	 }

//		System.out.println("�̸�:"+name);
//		System.out.println("�̸�:"+name);
		}

public void test6(){
	
}

public void test7(){
	
}









}