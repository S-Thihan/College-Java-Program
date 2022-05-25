package simple_tcp_3;

import java.net.*;
import java.io.*;
public class CalculatorServer {

	public static void main(String[] args) throws IOException {
		
		int result = 0;
		// TODO Auto-generated method stub
		ServerSocket svrSocket = new ServerSocket(8888);
		System.out.println("[+] Listening at port 8888.....");
		
		Socket conSocket = svrSocket.accept();
		
		DataInputStream in = new DataInputStream(conSocket.getInputStream());
		
		DataOutputStream out = new DataOutputStream(conSocket.getOutputStream());
		
		String cmd = in.readUTF();
		
		int num1 = in.readInt();
		int num2 = in.readInt();
		
		if (cmd.equalsIgnoreCase("ADD")) {
			result = num1 + num2;
		}
		
		if (cmd.equalsIgnoreCase("SUB")) {
			result = num1 - num2;
		}
		
		if (cmd.equalsIgnoreCase("MUL")) {
			result = num1 * num2;
		}
		if (cmd.equalsIgnoreCase("DIV")) {
			result = num1 / num2;
		}
		
		out.writeInt(result);
		svrSocket.close();
		conSocket.close();
	}

}