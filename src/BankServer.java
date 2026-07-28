import java.net.*;
import java.io.*;
//Multi client bank transaction server
//Problem : Multiple ATM user access bank server simultaniously
// 1)Server handles multiple client using threads
// 2)Each Client sends deposit amount 
// 3)Server updates balance

class ClientHandling extends Thread
{
	Socket socket;
	int balance = 10000;
	public ClientHandling(Socket socket)
	{
		this.socket = socket;
	}
	
	public void run() 
	{
		try {
			BufferedReader in = new BufferedReader( 
					new InputStreamReader(socket.getInputStream()));
			PrintWriter out = 
					new PrintWriter(socket.getOutputStream(),true);
			int amount = Integer.parseInt(in.readLine());
			synchronized (ClientHandling.class) 
			{
				balance +=amount;
			out.println("Deposit Succesfull. Updated Balance : "+balance);
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
public class BankServer 
{

	public static void main(String[] args) throws IOException 
	{
	  ServerSocket server = new ServerSocket(9999);
	  System.out.println("Welcome to Manorannjan Bank Of India");
	  
	  while(true)
	  {
		  Socket socket = server.accept();
		  new ClientHandling(socket).start();
	  }
    }

}
