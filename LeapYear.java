package programs;
import java.util.*;

public class LeapYear {
	public static void main(String[] args) 
	{
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		year = sc.nextInt();
		
		if(year % 400 == 0)
		{
			System.out.println(year +" is a leap year");
		}
		else if(year % 4 == 0)
		{
			System.out.println(year +" is a leap year");
		}
		else if(year % 100 != 0)
		{
			System.out.println(year +" is not a leap year");
		}
		else
		{
			System.out.println(year +" is not a leap year");
		}
	}

}
