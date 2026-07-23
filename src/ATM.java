import java.text.*;
import java.util.*;

class Account
{   
	Scanner scanner = new Scanner(System.in);
	DecimalFormat df1 = new DecimalFormat("###,##0.00' Rupee'");
	DecimalFormat df2 = new DecimalFormat("###,##0.00' Doller'");

	// Global Variables
	private int CN ;
	private int pn;
	
	double cb = 2000 ;
	double sb = 1000;
	
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
    
    void getCurrentBalance() {
    	System.out.print("\nCurrent Account Balance : "+ df1.format(cb));
    	
    }
    
    void getCurrentWithdrawInput() 
    {
    	System.out.println("Current Account Balance : "+ df1.format(cb));
    	System.out.println("Enter Withdraw Amount : ");
    	double amount = scanner.nextDouble();
    	if(cb >= amount) 
    	{
    	System.out.println("Transaction Successful..✅");	
    	calcCurrentWithdraw(amount);
    	System.out.println("\nNew Current Account Balance : "+ df1.format(cb)+"\n");
    	}
    	else 
    	{
    		System.err.println("Insufficient balance");
        	System.out.println("\nCurrent Account Balance : "+ df1.format(cb)+" Only.\n");

    	}
    }
	 double calcCurrentWithdraw(double amount){
		 cb -= amount; 
		 return cb;
	}
	 
	 void getSavingsBalance() 
	   {
	    	System.out.print("\nSavings Account Balance : "+ df1.format(sb));
	    	
	    }
	 
	 void getSavingsWithdrawInput() 
	    {
	    	System.out.println("Savings Account Balance : "+ df1.format(sb));
	    	System.out.println("Enter Withdraw Amount : ");
	    	double amount = scanner.nextDouble();
	    	if(sb >= amount) 
	    	{
	    	System.out.println("Transaction Successful..✅");	
	    	calcSavingsWithdraw(amount);
	    	System.out.println("\nNew Current Account Balance : "+ df1.format(sb)+"\n");
	    	}
	    	else 
	    	{
	    		System.err.println("Insufficient balance");
	        	System.out.println("\nCurrent Account Balance : "+ df1.format(sb)+" Only.\n");

	    	}
	    }
		 double calcSavingsWithdraw(double amount){
			 sb -= amount; 
			 return sb;
		
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
			  getLogin();
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
		  case 1 : getCurrent();
		  break ;
		  case 2 : getSavings();
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
	  void getCurrent() 
	  {
		  System.out.println("\n CURRENT ACCOUNT 👤");
		  System.out.println("Choice 1 : Balance Inquiry 📃");
		  System.out.println("Choice 2 : Withdraw money 💵");
		  System.out.println("Choice 3 : Deposit money💰");
		  System.out.print("Choice 4 : Exit");
		  System.out.println("\nChoice :");
		  
		  int ch = scanner.nextInt();
		  
		  switch(ch)
		  {
		  case 1 : getCurrentBalance();
		  getAccountType();
			  break;
		  case 2 :getCurrentWithdrawInput();
		  getAccountType();
			  break;
		  case 3 :
			  break;
		  case 4 : System.out.println("Thank you ! for VISITING 💐");
		  System.out.println("VISIT AGAIN...🙏🏻\n");
			  break;
			  
			  default :  System.err.println("\nInvalid choice !!");
			  System.out.println("Enter valid choice");
			  getCurrent();
				  break;
		  }
	  }
	  
	  void getSavings() 
	  {
		  System.out.println("\n SAVINGS ACCOUNT 👤");
		  System.out.println("Choice 1 : Balance Inquiry 📃");
		  System.out.println("Choice 2 : Withdraw money 💵");
		  System.out.println("Choice 3 : Deposit money 💰");
		  System.out.print("Choice 4 : Exit");
		  System.out.println("\nChoice :");
		  
		  int ch = scanner.nextInt();
		  
		  switch(ch)
		  {
		  case 1 :getSavingsBalance();
		  getAccountType();
			  break;
		  case 2 :getSavingsWithdrawInput();
		  getAccountType();
			  break;
		  case 3 :
			  break;
		  case 4 : System.out.println("Thank you ! for VISITING 💐");
		  System.out.println("VISIT AGAIN...🙏🏻\n");
			  break;
		  
			  default :  System.err.println("\nInvalid choice !!");
			  System.out.println("Enter valid choice");
			  getSavings();
				  break;
		  }
		  
	  }
 }
 
public class ATM {

	public static void main(String[] args) 
	{
		OptionMenu obj = new OptionMenu();
		obj.getLogin();
		obj.getAccountType();
		
	}

}
