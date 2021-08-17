//7.16 2���� ����
//7.16,17 ����

package com.collection.part04_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericsTest {
	public void test1() {
		ArrayList list = new ArrayList();
		
		list.add(new String("Object"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		System.out.println("����� ��ü ��: " + list.size());
		System.out.println("list:"+ list);
		
		for(int i= 0; i<list.size(); i++) {
			Object obj=list.get(i);
			
			System.out.println(obj);
			if(obj instanceof Book) {
				((Book)obj).printBook();
			}else if(obj instanceof Student) {
				((Student)obj).score();
			} else if(obj instanceof Car) {
				((Car)obj).printCar();
			}
			
		}
		
	}

	public void test2() {
		//���׸���: �÷��ǿ� ����Ǵ� ��ü�� �ڷ����� ������ �Ŵ� ���

		//������ 1.add�Ҷ� ��Ŭ���� add�� ���� �ִ�. 
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		//list.add("test");
		
		list2.add(new Book());
		list2.add(new Book());
		//list2.add("test");
		
		for(Object obj: list2) {
			((Book)obj).printBook();
		}	
			
		for(Book obj:list)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 {
			obj.printBook();
		}
		

	}
	
	public void test3() {
		HashMap<String, Book> map = new HashMap<>();
		//list�� �ٸ��� : ���׸�Ʈ�κ��� 2���� ��!
		map.put("one", new Book());
		map.put("two", new  Book());
		map.put("three", new  Book());
		
		System.out.println(map);
		
		//Q. Map.Entry�� �̿��Ͽ� Iterator�� �����ϰ�, Ű ������ ���ÿ� ó���ϴ� ���
		//��!! generics������ �ϸ� �ۼ��ϱ�
		//������ �κ� : hashmaptest.java�� 2�� [Map ����Ŭ���� entry �̿�: entryset()] 
		
		//3����
		//A. ������� Ǯ���ֽ� �ش�
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String,Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String,Book> ent = iter.next();
			String key = ent.getKey();
			Book value = ent.getValue();
			
			System.out.println(key+"="+value);
			
		}
		
		//set�� key�� �����Ͽ� IteratorȰ��
		Set<String> keys = map.keySet();
		
		Iterator<String> keyIter = keys.iterator();
		
		while(keyIter.hasNext()) {
			String key = keyIter.next();
			Book b = map.get(key);
			System.out.println(key+"="+b);
		}
}

}

class Book{
	private String title;
	
	public Book() {	}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call....");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call....");
		
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call....");
	}
	@Override
	public String toString() {
		return "Car";
	}
}
