package simple_tcp_3;

import java.io.*;
import java.net.*;

public class CalculatorClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Socket clientSocket = new Socket("localhost", 8888);
		DataInputStream in = new DataInputStream(clientSocket.getInputStream());
		DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a command : (ADD,SUB,MULTI,DIV)");
		
		String cmd = br.readLine();
		
		System.out.println("Enter number 1: ");
		
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter number 2: ");
		
		int num2 = Integer.parseInt(br.readLine());
		out.writeUTF(cmd);
		
		out.writeInt(num1);
		out.writeInt(num2);
		
		int result = in.readInt();
		System.out.println("Result = " + result);
		clientSocket.close();

	}

}
