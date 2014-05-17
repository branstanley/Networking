import java.io.IOException;

import Client.Client;
import Server.Server;
import java.util.ArrayList;


public class Driver {
	static public void main(String [] in) {
		try {
			Server s = new Server(5002);
			Thread c = new Thread(new Client(5002));
			s.start();
			c.start();
                        
			s.join();
			c.join();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
