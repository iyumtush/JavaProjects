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
		  do {
			  
		  try {
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
			getAccountType();
		}
		else 
		{
			System.err.println("Wrong Credentials ❌");
		}	
		    }catch(Exception e) 
		     {
			  System.err.println("\nEnter only numbers");
			  System.out.println("Characters & symbols are not allowed\n");
			  scanner.next();
		     }
		      finally 
		      {
		    	 System.out.println("process executed");
		      }
		  }while(true);
	  }
	  void getAccountType()
	  {
		  System.out.println("\n Enter Account type");
		  System.out.println("\nChoice 1 : Current Account");
		  System.out.println("Choice 2 : Savings Account");
		  System.out.println("Choice 3 : Exit");
		  System.out.print("\nChoice : ");
		  int ch = scanner.nextInt();
		  
		  switch(ch) {
		  case 1 : System.out.println("Current Account");
		  break ;
		  case 2 : System.out.println("Savings Account");
		  break ;
		  case 3 : System.out.println("Thank you ! for VISITING 💐");
		  System.out.println("VISIT AGAIN...🙏🏻\n");
		  break ;
		  default :
			  System.err.println("\nInvalid choice !!");
			  System.out.println("Enter valid choice");
			  getAccountType();
		  break ;
		  }
	  }
 }
 
public class ATM {

	public static void main(String[] args) 
	{
		OptionMenu obj1 = new OptionMenu();
		//obj1.getLogin();
		obj1.getAccountType();
		
	}

}
