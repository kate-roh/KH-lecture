//7.15 1���� ����
//7�� 16 ����

package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ArrayListTest {
	public void test() {
		//ArrayList test 
		//������ ���� �ȴ�. ���� �ִ� ������� �ε����� ����.
		
		ArrayList alist = new ArrayList();
		
		//������ ����
		List list = new ArrayList();
		Collection clist = new ArrayList();
		
		alist.add("apple");
		alist.add(123);
		alist.add(45.67);
		alist.add(new Date());		
		
		for(int i=0; i<alist.size(); i++) {
		System.out.println(i+ ":" + alist.get(i));
	}
		
		
		//�ߺ��������
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		//���ϴ� ��ġ�� �߰��Ǹ�, �߰��� ��ŭ �и���. 
		alist.add(1,"banana");
		System.out.println("alist: " + alist);
		
		//����
		alist.remove(2);
		System.out.println("alist: " + alist);
		
		//���� ������(�ε���, ���氪)
		alist.set(2,45);
		System.out.println("alist: " + alist);
		
		//��ü����!
		alist.clear();
		System.out.println("alist: " + alist);
		
		//Arraylistsms �������� ������ �Ҽ� �ֵ��� sort()�޼ҵ� ����
		//����
		System.out.println();
		alist.add("apple");
		alist.add("orange");
		alist.add("banana");
		alist.add("mango");
		alist.add("grape");
		
		System.out.println("alist: " + alist);
		
		Collections.sort(alist);
		System.out.println("alist Sort: " + alist);

}
}