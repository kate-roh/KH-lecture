//7.19 ����
package com.test02.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
	public static void main(String[] args) throws IOException {
		//���� ����
		DatagramSocket ds = new DatagramSocket();
		System.out.println("�����ϴ�.");
		
		//���� data
		byte[]buff= "���� �޼����Դϴ�.".getBytes();
		
		//packet���� ���Ѵ�.
		DatagramPacket sendP = new DatagramPacket(buff,buff.length,InetAddress.getByName("localhost"),9999);
		 //��𿡰�, �������Զ�� �����͸� ������ ����!
		
		//������.
		ds.send(sendP);
		
		//����
		ds.close();
		ds.disconnect();
		
		
	}

	
}
