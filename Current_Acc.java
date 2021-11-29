package programs;

import java.util.Scanner;

public class Current_Acc extends Account_EH
{
	Account_EH obj = new Account_EH();
	int balance = obj.balance;
	
	void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit:");
		int a = sc.nextInt();
		balance = balance + a;
		
		System.out.println("Total amount =" +balance);
		
	}
	
	void withdrawl()
	{
		int min_balance = 10000;
		int service_charge = 1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw:");
		int w = sc.nextInt();
		balance = balance - w;
		if(balance <= min_balance)
		{
			System.out.println("Service Charge is imposed of rupees: " +service_charge);
			System.out.println("Total amount =" +(balance - service_charge));
		}
		else
		{
			System.out.println("Total amount =" +balance);
		}
		
		
	}
	

}
