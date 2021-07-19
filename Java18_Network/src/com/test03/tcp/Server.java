//7.19 ����

package com.test03.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//1)
		ServerSocket serverSocket = null;
		//2)����� ���� ����
		Socket serviceSocket = null;
		//3)����� ���� ���
		PrintWriter out = null;
		//4)
		BufferedReader in = null;
		//���� ����

		//serverSocket : ��û�� �ޱ� ���� ���ϳֱ�
		serverSocket = new ServerSocket(8888);

		//�ݺ���
		while(true) {
			System.out.println("client�� ��ٸ��ϴ�.");
			
			//���ӽ�Ű��
			serviceSocket = serverSocket.accept();
			//�����Ѱ� �޾����� �����!
			System.out.println("client�� �����޽��ϴ�..... ");
		
			//����Ȯ�� ������ ������
			//data�� �о
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
                  //���ڴ��� ��Ʈ��										     //�о���� ��Ʈ��
			
			//�����ְڴ�.
			out = new PrintWriter(serviceSocket.getOutputStream(), true);
			
			//������� string�� �غ� �Ȱ���.
			
			String inputLine = null;
			
			//�о���� 
			while((inputLine= in.readLine()) != null) {
				System.out.println("Ŭ���̾�Ʈ�� ���� �޼��� : "+ inputLine);
			
				out.println(inputLine);
			}
			
			out.close();
			in.close();
			serviceSocket.close();
			serverSocket.close();
		}
	}
}
