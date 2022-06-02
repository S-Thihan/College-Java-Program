import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class ServerAdder extends UnicastRemoteObject implements Adder {
	
	public ServerAdder() throws RemoteException { super(); }
	
	public int add(int x , int y) throws RemoteException{
		return x + y;
	}

public static void main(String Args[]) throws RemoteException,MalformedURLException{
	ServerAdder obj = new ServerAdder();
	Naming.rebind("rmi://localhost:1099/sumObj", obj);
	System.out.println("Server is waiting....");
	}
}
