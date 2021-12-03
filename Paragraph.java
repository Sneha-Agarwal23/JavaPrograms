package programs;

import java.io.*;
import java.util.*;

public class Paragraph
{
	public static void main(String[] args) throws Exception
	{
		File f = new File("C:\\Users\\snaga\\OneDrive\\Documents\\paragraphs.txt"); 
		Scanner sc = new Scanner(f);
		Map<String, Integer> p = new HashMap<String,Integer>();
		String Line;
		while(sc.hasNextLine())
		{
			Line = sc.nextLine();
			String parts[] = Line.split(" ");
			for(String word : parts)
			{
				if(p.containsKey(word))
				{
					p.put(word, p.get(word)+1);
				}
				else
				{
					p.put(word, 1);
				}
			}
		}
		System.out.println("No of words with their frequncies: "+p);
	}

}
