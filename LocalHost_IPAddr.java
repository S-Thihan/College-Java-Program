import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalHost_IPAddr {

	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub
		InetAddress ip = InetAddress.getLocalHost();
		String hostname = ip.getHostName();
		
		System.out.println("[*]Ip address : " + ip);
		System.out.println("[*]hostname   : " +hostname);
	}

}
