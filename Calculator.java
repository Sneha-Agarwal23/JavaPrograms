package programs;
import java.util.*;
public interface Calculator 
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		BasicCalculator bs = new BasicCalculator();
		ScientificCalculator sc = new ScientificCalculator();
		
		System.out.println("Enter the first letter of your name:");
		String s = obj.next();
		//s = s.toUpperCase();
		
		if(s.equalsIgnoreCase("A"))
		{
			System.out.println("Press 1 for addition  Press 2 for substraction");
			int x = obj.nextInt();
			
			if(x == 1)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.addition(a, b);
			}
			else
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.substraction(a, b);
				
			}
		}
		else if(s.equalsIgnoreCase("S"))
		{
			System.out.println("Press 1 for addition  Press 2 for substraction  Press 3 for exponential");
			int x = obj.nextInt();
			
			if(x == 1)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.addition(a, b);
			}
			else if(x == 2)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.substraction(a, b);	
			}
			else
			{
				System.out.println("Enter the value of a:");
				int a = obj.nextInt();
				
				sc.exponential(a);
			}	
		}
		else
		{
			System.out.println("Press 1 for addition  Press 2 for substraction  Press 3 for Multiplication Press 4 for Division  Press 5 for Modulus");
			int x = obj.nextInt();
			
			if(x == 1)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.addition(a, b);
			}
			else if(x == 2)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.substraction(a, b);	
			}
			else if(x == 3)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.multiplication(a, b);	
			}
			else if(x == 4)
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.division(a, b);	
			}
			else
			{
				System.out.println("Enter the value of a and b:");
				int a = obj.nextInt();
				int b = obj.nextInt();
				bs.modulus(a, b);	
			}
		}
			
		
	}
	

}
