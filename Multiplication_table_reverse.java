package programs;

import java.util.Scanner;

public class Multiplication_table_reverse {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		for(int i = 10; i >= 1; i--)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}

}
