import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class ClientAdder {

	public static void main(String[] args) throws RemoteException,MalformedURLException,NotBoundException {
		// TODO Auto-generated method stub
		Adder object =(Adder) Naming.lookup("rmi://localhost:1099/sumObj");
		int i = object.add(45, 69);
		System.out.println("Answer is " + i);

	}

}
