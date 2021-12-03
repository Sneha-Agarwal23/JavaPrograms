package programs;
import java.util.*;
import java.io.*;

public class IO_Student
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		try {
			String name;
			String roll;
			String score;
			int x = 1;
			FileWriter fw = new FileWriter("C:\\Users\\snaga\\OneDrive\\Documents\\paragraphs.txt");
			while(x != 0)
			{
				System.out.println("Enter the choice:  Press 1 to add new student  Press 0 to exit");
				x = sc.nextInt();
				if(x == 1)
				{
					System.out.println("Enter the name:");
					name = sc.next();
					System.out.println("Enter the roll no: ");
					roll = sc.next();
					System.out.println("Enter the score: ");
					score = sc.next();
					fw.write(name);
					fw.write("\0");
					fw.write(roll);
					fw.write("\0");
					fw.write(score);
					fw.write("\n");					
				}
			}
			
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	

}
