package programs;
import java.util.*;
import java.io.*;

public class IOcheck
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String file = sc.nextLine();
		
		File f = new File(file);
		if(f.exists())
		{
			System.out.println("File exists!!");
		}
		else
		{
			System.out.println("File doesn't exixt!!");
			return;
		}
		
		if(f.isDirectory())
		{
			System.out.println("It is a directory");
			String a[] = f.list();
			int n = a.length;
			for(int i = 0; i < n ; i++)
			{
				System.out.println(a[i]);
				File f1 = new File(a[i]);
				if(f1.isFile())
				{
					System.out.println(": is a file");
				}
				if(f1.isDirectory())
				{
					System.out.println(": is a directory");
				}
			}
			System.out.println("No of entries in this directory: "+n);
		}
		else
		{
			if(f.canRead())
			{
				System.out.println("File is readable..");
			}
			else
			{
				System.out.println("File is not readable!!");

			}
			
			if(f.canWrite())
			{
				System.out.println("File is writeable..");	
			}
			else
			{
				System.out.println("File is not writeable..");
			}
		}	
	}
}
