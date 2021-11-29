package programs;

import java.util.Scanner;

public class Account_EH
{
	int balance = 200000;
	
	public static void main(String[] args)
	{
		String customer_name;
		long account_no;
		String type;
		
		Scanner sc = new Scanner(System.in);
		Account_EH obj = new Account_EH();
		Savings_Acc sa = new Savings_Acc();
		Current_Acc ca = new Current_Acc();
		
		System.out.println("Enter the customer's name:");
		customer_name = sc.nextLine();
		System.out.println("Enter your account no:");
		account_no = sc.nextLong();
		System.out.println("Enter the account type: 1)Savings  2)Current");
		type = sc.next();
		
		if(type.equalsIgnoreCase("Savings"))
		{
			System.out.println("Enter 1 for deposit  2 for withdrawl   3 for calculating interest");
			int x = sc.nextInt();
			
			if(x == 1)
			{
				sa.deposit();
			}
			else if(x == 2)
			{
				sa.withdrawl();
			}
			else
			{
				sa.interest();
			}
		}
		else
		{
			System.out.println("Enter 1 for deposit  2 for withdrawl");
			int x = sc.nextInt();
			
			if(x == 1)
			{
				ca.deposit();
			}
			else
			{
				ca.withdrawl();
			}	
		}
		
	}

	

}
