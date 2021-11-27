package programs;

import java.util.Scanner;

public class CarParking extends Car
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		int x = 1,t = 0,total = 0;
		while(x != 0)
		{
			t++;
			System.out.println(" Enter the car no. and no of hours you want to park it for :");
			int c = sc.nextInt();
			int h = sc.nextInt();
			Car obj = new Car(c,h);
		    int rate = 50;
		    int p = (rate * obj.hours);
		    total = total + p;
		    System.out.println("Please Pay Parking Charges of Rupees: " +p);
		    System.out.println("Do you wish to continue - Press 1 to continue 0 to Exit the System.");;
		    x = sc.nextInt(); 
		}
		
		System.out.println("Total no of cars in the parking: " +t);
		System.out.println("Total parking charges collected: " +total); 
	    
	}

}
