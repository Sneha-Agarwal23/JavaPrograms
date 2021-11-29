package programs;
import java.util.*;

public class Student_C
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>(5);
		ArrayList<Integer> roll = new ArrayList<Integer>(5);
		
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Enter the name: ");
			String s = sc.next();
			name.add(s);
			System.out.println("Enter the roll no: ");
			int r = sc.nextInt();
			roll.add(r);
		}
		System.out.println("Department: CSE");
	    Collections.sort(name);
	    System.out.println("Sorting in alphabetical order"+name);
	   
	    Collections.sort(roll);
	    System.out.println("Sorting in numerical order"+roll); 
	}
	
	
	
	
}
