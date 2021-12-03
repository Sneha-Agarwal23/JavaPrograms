package programs;
import java.util.*;
import java.io.*;

public class Username_pass 
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("C:\\Users\\snaga\\OneDrive\\Documents\\usernames.txt"); 
		Scanner sc = new Scanner(f);
		Map<String,String> m = new HashMap<String,String>();
		int i = 0;
		String Line;
		while(sc.hasNextLine())
		{
			Line = sc.nextLine();
			String parts[] = Line.split(":");
			String name = parts[0].trim();
			String password = parts[1].trim();
			
			m.put(name, password);
			i++;
		}
		System.out.println("No of data present: "+i);
		System.out.println("Unsorted List: ");
		System.out.println(m);
		
		ArrayList<String> sorted = new ArrayList<String>(m.keySet());
		Collections.sort(sorted);
		
		System.out.println("Sorted List: ");
		for(String x : sorted)
		{
			System.out.println("Name =  "+x +" Password =  "+m.get(x));
		
		}
	}

}
