package programs;
import java.util.Scanner;

public class Website {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the website");
		String website = sc.next();
		
		if(website.endsWith(".org"))
		{
			System.out.println("This is an organizational website");
		}
		else if(website.endsWith(".com"))
		{
			System.out.println("This is an commercial website");
		}
		if(website.endsWith(".in"))
		{
			System.out.println("This is an institutional website");
		}
	}

}
