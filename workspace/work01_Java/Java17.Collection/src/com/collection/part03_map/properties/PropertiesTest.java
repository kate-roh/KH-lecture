//7�� 16 ����
//7�� 16 ���� �õ� ������ �����ϰ�, 17�� �ٽ� ���� 

package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public void test() {
		//���� ������ ���� �о ������ �� ���ȴ�.
		Properties prop = new Properties();
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:this:@localhost:1521:xe");
		prop.setProperty("user", "KH");
		prop.setProperty("password", "KH");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("driver.properties"),"jdbc driver");
		
			prop.store(new FileWriter("driver.txt"), "jdbc driver");	
			
			//7.16 ���⼭ ����...��õ� �ϱ�
			//7.17 �� ������ �ȉ�°�?
			//     1)��Ÿ������ �������� �Է¾ȉ���ž�....��Ÿ��������..�׶� ��¥ ������������!!!
			//       ��Ÿ ��� ����Բ� ������Ⱦ�� �Ѵ�....!
			//     2)f5Ű�� ���ΰ�ħ�� ������� ��
			prop.storeToXML(new FileOutputStream("driver.xml"),"jdbc driver");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	public void test2() {
		
		Properties prop = new Properties();
		
		try {
			//����� driver.properties�� ������ �ҷ��´�. 
			prop.load(new FileInputStream("driver.properties"));
			
			//��ü�����
			System.out.println(prop);
			
			//driver.properties���� driver�� ���
			System.out.println(prop.getProperty("driver"));
			
			//driver.properties���� url�� ���
			System.out.println(prop.getProperty("url"));
			
			//�߸��� Ű���� �Է��������� null�� ���.
			System.out.println(prop.getProperty("ul"));


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
