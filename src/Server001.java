//Socket Programming 
//Socket = it an communication end point
//A socket acts like a telephone connection btw client and server
//Client --> Socket ---> Server
//Q1)Basic - Theme : Chat Message sender [Client -> Server]
//Problem : A customer sends msg a to customer support
//Solution : (a)A server that waits for a client msg 
//           (b)A client that sends "Hello Support Team".

import java.net.*;
import java.io.*;
public class Server001 
{

	public static void main(String[] args) throws IOException 
	{
       ServerSocket server = new ServerSocket(0102);
       System.out.println("Server waiting for client message...");
       Socket socket = server.accept();
       BufferedReader in = new BufferedReader(
    		   new InputStreamReader(socket.getInputStream()));
       String msg = in.readLine();
       System.out.println("Client says : "+msg);
       socket.close();
       server.close();
	}

}
