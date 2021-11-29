package programs;

import java.util.Scanner;

public class Savings_Acc extends Account_EH
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw:");
		int w = sc.nextInt();
		balance = balance - w;
		
		System.out.println("Total amount =" +balance);
		
	}
	
	void interest()
	{
		Scanner sc = new Scanner(System.in);
		int p = balance;
		int r = 4;
		System.out.println("Enter the time in years:");
		int t = sc.nextInt();
		int j;
		for(int i = 1; i <= t; i++)
		{
			j = (p*r)/100 ;
			p = p + j;
		}
		System.out.println("Balance after adding interest = "+ p);
	}

}
