//7.08 2���� ����

package com.poly.part0.test07;

public class Profile {
	private String name;
	private String phone;
	
	public Profile() {}
	public Profile(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void printProfile() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + phone);
	}
	
}
