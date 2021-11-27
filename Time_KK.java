package programs;

import java.util.Scanner;

public class Time_KK {
	public int hour;
	public int minute;
	public int second;
	
	Time_KK()
	{
		hour = 0;
		minute = 0;
		second = 0;
	}
	
	Time_KK(int h, int m, int s)
	{
		this.hour = h;
		this.minute = m;
		this.second = s;
	}
	
	void display()
	{
		if(hour < 12)
		{
			System.out.println(hour + ":" + minute + ":" + second + "AM");
		}
		else
		{
			System.out.println(hour - 12 + ":" + minute + ":" + second + "PM");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time: ");
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		Time_KK obj = new Time_KK();
		Time_KK obj2 = new Time_KK(h, m ,s);
		
		obj2.display();
				
	}

}
