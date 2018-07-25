import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			//Server Socket class is used to create server
		    ServerSocket ss = new ServerSocket(6000);
		    
		    Socket s = ss.accept(); //establish connection between server and client
		    
		    DataInputStream dis = new DataInputStream(s.getInputStream());
		    String read = (String)dis.readUTF();
		    System.out.println("message To server is: "+read);
		    ss.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
