package programs;

import java.util.Scanner;

public class Multiplication_table_sum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
			sum = sum + (n * i);
		}
		System.out.println("Sum is: " +sum);
	}

}
