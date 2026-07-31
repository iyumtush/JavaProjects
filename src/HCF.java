import java.util.Scanner;

public class HCF 
{

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter First Number : ");
       int num1 = sc.nextInt();
       System.out.print("Enter Second Number : ");
       int num2 = sc.nextInt();       
       int hcf = 0; 
       int lcf = 0;
       
       
       for(int i = 1 ; i<(num1>num2 ? num1:num2) ; i++)
       {    	    	   
    	   if(num1%i == 0 && num2%i == 0)
    	   {
    		   hcf = i;    		    		   
    	   }   
       } 
       
       System.out.print("\nHighest Comman Factor of " 
       +num1+ " & " +num2+ " is : "+hcf);
       sc.close();
     }	
}

