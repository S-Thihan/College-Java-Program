import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameByIp {
	public static void main(String[] args) throws UnknownHostException{
		// TODO Auto-generated method stub
		InetAddress hostname = InetAddress.getByName("8.8.8.8");
		System.out.println("[*] HostName " + hostname.getHostName());
	}
}
