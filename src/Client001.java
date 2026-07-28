//Client Side
import java.net.*;
import java.io.*;
public class Client001 
{

	public static void main(String[] args) throws 
	UnknownHostException, IOException 
	{
		Socket socket = new Socket("Localhost",0102);
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		out.println("Hello Support Team");
		socket.close();
		
	}

}
