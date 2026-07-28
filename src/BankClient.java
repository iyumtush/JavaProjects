
import java.net.*;
import java.io.*;

public class BankClient {

	public static void main(String[] args) throws UnknownHostException, IOException 
	{
       Socket socket = new Socket("Localhost",9999);
       BufferedReader in = new BufferedReader( 
				new InputStreamReader(socket.getInputStream()));
		PrintWriter out = 
				new PrintWriter(socket.getOutputStream(),true);
		out.println("5000");
		String response = in.readLine();
		System.out.println(response);
		socket.close();
		
	}

}
