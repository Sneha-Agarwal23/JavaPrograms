package programs;

import java.util.Scanner;

public class TollTax
{
	public static void main(String[] args)
	{
		int noOfCars = 0;
		int amount = 400;
		int total = 0;
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		
		
		while(a != 0)
		{
			System.out.println("Press 1 to pass the bridge!   Press 0 to exit!");
			a = sc.nextInt();
			
			if(a == 1)
			{
				System.out.println("Car crossed the bridge!! Please pay the toll tax of amount: "+amount);
				noOfCars++;
				total = total + amount;
			}
	
		}
		System.out.println("Total no of cars passed = " +noOfCars);
		System.out.println("The total tax collected: "+total);
			
		
	}

}
