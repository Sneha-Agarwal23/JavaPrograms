package programs;
import java.util.Scanner;

public class Pass_fail {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m1, m2, m3;
		System.out.println("Enter marks in Physics");
		m1 = sc.nextInt();
		System.out.println("Enter marks in Chemistry");
		m2 = sc.nextInt();
		System.out.println("Enter marks in Mathematics");
		m3 = sc.nextInt();
		
		double avg = (m1 + m2 + m3)/3;
		System.out.println("Overall Percentage: " +avg);
		if(avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
