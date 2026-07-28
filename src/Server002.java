

//Moderate Question : Online food ordering system
//Customer sends food order to FoodPlaza Server
//Solution (a) Client sends food item name.
//         (b) Server responds with confirmation
import  java.net.*;
import java.io.*;
public class Server002 
{

	public static void main(String[] args) throws IOException
	{
		ServerSocket server = new ServerSocket(8800);		
		System.out.println("FoodPlaza is started");
		Socket socket = server.accept();
		BufferedReader in = new BufferedReader(
				new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		String order = in.readLine();
		System.out.println("Order Recieved : "+order);
		out.print("Order Confirmed : "+order);
		socket.close();
		server.close();
		
	}

}
