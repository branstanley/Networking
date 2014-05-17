package Client;

import java.net.*;
import java.io.*;

public class Client implements Runnable{
	Socket s = null;
	
	public Client(int port) throws UnknownHostException, IOException{
		s = new Socket("127.0.0.1", port);
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(in.readLine());
                        PrintStream out = new PrintStream(s.getOutputStream());
                        
		} catch (IOException e) {
			System.out.println("Client stream error.");
		}
		
	}
}
