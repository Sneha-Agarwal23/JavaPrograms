package programs;

import java.util.Scanner;

public class Reservation_System 
{
	
	int capacity;
	public int[] seats = {0,0,0,0,0};
	
	Reservation_System()
	{
		int capacity = 5;	
	}
	
	void seat_capacity(int s)
	{
		seats[s] = 1;
	}
	int assign()
	{
		Reservation_System obj = new Reservation_System();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice of seat: ");
		int s = sc.nextInt();
		
		if(seats[s] == 0)
		{
			obj.seat_capacity(s);
			seats[s] = 1;
			System.out.println("Seat is assigned");
			return 0;
		}
		else
		{
			System.out.println("This seat is taken. Please choose another seat!!");
			return 0;
		}
		
	}
	
	public static void main(String [] args)
	{
		Reservation_System obj = new Reservation_System();
		int x = 0,c = 0;
		while(x == 0)
		{
			x= obj.assign();
			c++;
			if(c == 5)
			{
				break;
			}
		}
		
	}
}
