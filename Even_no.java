package programs;
import java.util.Scanner;

public class Even_no {
	public static void main( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++)
		{
			System.out.println(2*i);
			sum = sum + (2*i);
		}
		System.out.println("Sum is: " + sum);
	}

}
