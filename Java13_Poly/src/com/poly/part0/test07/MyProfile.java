//7.08 2���� ���� 

package com.poly.part0.test07;

public class MyProfile extends Profile implements Display, Job{

	private String loc;
	
	public MyProfile() {}
	public Myprofile(String name, String phone) {
		super(name, phone);
	}
	
	@Override
	public void jobLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public void display() {
		super.printProfile();
		System.out.println("ȸ�� �ּ�: " + loc);
		System.out.println("ȸ�� ����: " + jobId);
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
