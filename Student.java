package programs;

import java.util.ArrayList;

public class Student 
{
	public static void main(String[] args)
	{
		int n = 5;
		ArrayList<String> arr = new ArrayList<String>(n);
		arr.add("Student 1 - Alex");
		arr.add("Student 2 - Derek");
		arr.add("Student 3 - Owen");
		arr.add("Student 4 - Meredith");
		arr.add("Student 5 - Cristina");
		
		for(int i = 0; i < n ; i++)
		{
			System.out.println(arr.get(i));
		}
	}
	
	
	

}
