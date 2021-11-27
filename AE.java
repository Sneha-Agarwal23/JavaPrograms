package programs;

import java.util.Scanner;

public class AE
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		AE ex = new AE();
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		try {
			for(int i = 0; i < n; i++)
			{
				System.out.println("Enter something: ");
				int x = sc.nextInt();
				int d = i / x;
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}

}
