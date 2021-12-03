package programs;
import java.util.*;
import java.io.*;

public class InputOutput 
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\snaga\\OneDrive\\Documents\\paragraphs.txt");
		Scanner sc = new Scanner(f);
		
		int words = 0;
		int characters = 0;
		int noOfLines = 0;
		int noOfSentences = 0;
		
		String Line;
		while(sc.hasNextLine())
		{
			Line = sc.nextLine();
			noOfLines++;
			
			characters = characters + Line.length();
			String w [] = Line.split(" ");
			words = words + w.length;
			String sentence [] = Line.split("[!?.:]+");
			noOfSentences = noOfSentences + sentence.length;
		}
		
		System.out.println("The total no of words: "+ words);
		System.out.println("The total no of characters: "+characters);
		System.out.println("The total no of lines :" +noOfLines);
		System.out.println("The total no of sentences :" +noOfSentences);
		
	}

}
