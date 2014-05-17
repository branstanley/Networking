package Server;

import java.net.*;
import java.io.*;

public class Server extends Thread{
	ServerSocket sock;
	
	public Server(int port_number) throws IOException{
		sock = new ServerSocket(port_number);
	}
	
	public void run(){
		while(true){
			try {
				Socket s = sock.accept();
				PrintStream out = new PrintStream(s.getOutputStream());
				out.println("Greetings from the server.");
			} catch (IOException e) {
				System.out.println("Connection error: " + e.getMessage());
			}
		}
	}
}
