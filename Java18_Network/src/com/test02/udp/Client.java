//7.19 ����

package com.test02.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
	public static void main(String[] args) throws IOException {
		//����
		DatagramSocket ds = new DatagramSocket(9999);
		System.out.println("�޾ҽ��ϴ�.");
		
		//���� �� ����
		byte[] buff = new byte[1024];
		
		//��Ŷ�� �޾��ش�.
		DatagramPacket receiveP = new DatagramPacket(buff,buff.length);
		
		ds.receive(receiveP);
		
		//������ ����غ���
		System.out.println("------------------------");
		System.out.println(new String(receiveP.getData()));
		
		//����
		ds.close();
		ds.disconnect();
	}
}
