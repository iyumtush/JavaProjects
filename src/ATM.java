import java.util.*;

class Account
{   
	
	private int CN ;
	private int pn;
	void setCustomerNumber(int cn) 
	{
		
	 CN = cn;
		
	}
	
	void setCustomerPinNumber(int pn)
	{
		this.pn = pn;
		
	}
	
	int getCustomerNumber() 
	{
		return CN;
	}
    int getCustomerPINNumber() 
    {
		return pn;
	}
}

	
 class OptionMenu extends Account
 {
	  Scanner scanner = new Scanner(System.in);
	  HashMap<Integer,Integer> data = new HashMap<>();
	  
	  void getLogin()
	  {   
		  data.put(123, 1124);
		  data.put(124, 1125);
		  data.put(125, 1126);
		  
		  System.out.println("Welcome to the KDK ATM");
		  System.out.print("\nEnter customer number : ");
		  
		setCustomerNumber(scanner.nextInt());
		System.out.print("Enter the pin number   : ");
		setCustomerPinNumber(scanner.nextInt());
		
		int Cnum = getCustomerNumber();
		int CPIN = getCustomerPINNumber();
		
		
		
		if(data.containsKey(Cnum) && data.get(Cnum) == CPIN)
		{
			System.out.println("Login Succsesfully ✅");
		}
		else 
		{
			System.out.println("Wrong Credentials ❌");
		}
	       
	  }
 }

public class ATM {

	public static void main(String[] args) 
	{
		OptionMenu obj1 = new OptionMenu();
		obj1.getLogin();
		
	}

}
