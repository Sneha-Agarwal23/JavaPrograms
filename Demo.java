package programs;
import java.util.*;

public class Demo extends Commission 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sale: ");
		int s = sc.nextInt();
		
		Commission c = new Commission();
		if(c.sales > s)
		{
			System.out.println("Invalid Input");
		}
		else
		{
			System.out.println("Commission is: " + c.getCommission() + "%");
		}
		
	}

}
