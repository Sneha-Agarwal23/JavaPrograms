package programs;
import java.util.*;

public class Account_update extends Account_KK
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Account_KK obj = new Account_KK();
		System.out.println("Account Updation:");
		System.out.println("Enter the name: ");
		String n = sc.next();
		System.out.println("Enter customer's address:");
		String a = sc.next();
		System.out.println("Enter PAN no: ");
		int p = sc.nextInt();
		System.out.println("Enter address proof: ");
		String ap = sc.next();
		
		Account_KK acc = new Account_KK(n,a,p,ap,10011);
		System.out.println("Enter the type of account : Press 1 for Savings Press 2 for Homeloan");
		int x = sc.nextInt();
		if(x == 1)
		{
			acc.display();
			acc.Savings();
		}
		else
		{
			acc.display();
			acc.homeloan();
		}
	}
	

}
