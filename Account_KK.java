package programs;

import java.util.*;

public class Account_KK 
{
	String customer_name;
	String address;
	int PAN;
	String address_proof;
	int customer_id;
	
	Account_KK()
	{
		
	}
	
	Account_KK(String n, String a, int p, String ap, int id)
	{
		customer_name = n;
		address = a;
		PAN = p;
		address_proof = ap;
		customer_id = id;
	}
	
	void display()
	{
		System.out.println("Name :"+ customer_name);
		System.out.println("Address:" + address);
		System.out.println("PAN no:"+ PAN);
		System.out.println("Customer ID: "+ customer_id);
		
	}
	
	void Savings()
	{
		Scanner sc = new Scanner(System.in);
		int balance = 50000;
		System.out.println("Press 1 for withdrawl Press 2 for deposit");
		int x = sc.nextInt();
		System.out.println("Enter the amount:");
		int a = sc.nextInt();
		if(a > balance) 
		{
			System.out.println("Exception: Withdrawl Not Possible");
			
		}
		if(x == 1)
		{
			System.out.println("Remaining Balance: " + (balance - a));	
		}
		else
		{
			System.out.println("Total Balance: "+(balance + a));
		}
	}
	
	void homeloan()
	{
		System.out.println("Your loan amount is : 500000");
	}

}
