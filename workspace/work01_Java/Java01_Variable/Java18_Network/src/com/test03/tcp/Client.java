//7.19 ����

package com.test03.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.rmi.UnknownHostException;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket clientSocket;
		PrintWriter out = null;
		BufferedReader in = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("server�� �����մϴ�..");
		try {	
			clientSocket = new Socket("localhost",8888);
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			
			//
			String inputLine;
			while((inputLine= sc.nextLine())!= null) {
				out.println(inputLine);
				System.out.println("server�� ���� �ٽ� ���� �޼���:" + in.readLine());
			}
			
			in.close();
			out.close();
			clientSocket.close();
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
}

}
