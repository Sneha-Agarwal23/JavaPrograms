package programs;

import java.util.Scanner;

public class Student_EH
{
	public static void main(String[] args)
	{
		String name;
		int roll_no;
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter the roll_no:");
		roll_no = sc.nextInt();
		System.out.println("Enter the score:");
		score = sc.nextInt();
		
		if(score > 0 && score < 100)
		{
			System.out.println("The score is valid!!");
		}
		else
		{
			System.out.println("Exception: Invalid Score!! Re-run the program to enter new score..");
		}
	}
}
