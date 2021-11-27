package programs;
import java.util.*;

public class StringFilter
{
	String NumberFilter(String s)
	{
		System.out.println("Enter the numbers you want to filter: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		s = s.replace(n, "");
		
		return s;
	}
	
	String CharacterFilter(String s)
	{
		System.out.println("Enter the characters you want to filter: ");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		s = s.replace(c, "");
		
		return s;
	}

	public static void main(String[] args)
	{
		StringFilter obj = new StringFilter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphanumeric string: ");
		String s = sc.next();
		int x = 1;
		while(x != 0)
		{
			System.out.println("Press 1 to remove number  Press 2 to remove character  Press 0 to exit");
			x = sc.nextInt();
			if(x == 1)
			{
				s = obj.NumberFilter(s);
			}
			else if(x == 2)
			{
				s = obj.CharacterFilter(s);
			}
		}
		System.out.println("The final string: "+s);
		
	}

}
