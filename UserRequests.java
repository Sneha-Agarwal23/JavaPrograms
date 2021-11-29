package programs;

import java.util.Scanner;

public class UserRequests extends Thread
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		UserRequests obj = new UserRequests();
		Printer p = new Printer();
		
		System.out.println("How many pages do you want to print? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			Thread t = new Thread(obj);
			p.print(i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				System.out.println("Printer is busy");
			}
		}
		System.out.println("Process Finished");
		
	}
	

}
