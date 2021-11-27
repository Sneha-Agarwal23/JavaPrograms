package programs;
import java.util.*;

public class Transaction extends Account 
{
	public static void main(String[] args)
	{
		Account obj = new Account();
		long account_no = obj.account_no;
		
		System.out.println("The account no : " + account_no);
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 0 for Withdrawal-  Press 1 for deposit-");
		int n = sc.nextInt();
		System.out.println("Enter the amount: ");
		int a = sc.nextInt();
		 
		if(n == 0)
		{
			if(a > obj.balance)
			{
				System.out.println("Insufficient Balance");
			}
			else
			{
				System.out.println("Remaining Balance = " + (obj.balance - a));
			}
				
		}
		else
		{
			System.out.println("New Balance: " + (obj.balance + a));
		}	
	}

}
