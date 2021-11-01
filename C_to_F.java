package programs;
import java.util.Scanner;

public class C_to_F {
	static void convert(int c)
	{
		float f = (c * 9/5) + 32;
		System.out.println("The Fahrenheit temperature is: " + f);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the celcius temperature: ");
		int c = sc.nextInt();
		convert(c);
	}


}
