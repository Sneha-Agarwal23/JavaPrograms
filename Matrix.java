package programs;

import java.util.Scanner;

public class Matrix 
{
	int m[][] = {{1,2} , {3,4} , {5,6}};
	
	void getElementAt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the element:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		System.out.println("The element is: " + m[i][j]);
	}
	
	void setElementAt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index of the element:");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("Enter the element: ");
		int x = sc.nextInt();
		
		m[i][j] = x;
		System.out.println("The element inserted is: " +x);
		
	}
	
	void findElement()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to search: ");
		int x = sc.nextInt();
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				if(m[i][j] == x)
				{
					System.out.println("Element found at the index: (" +i +" , "+j + ")");
				}
			}
		}
		
	}
	
	void add(int n[][], int r, int c)
	{
		if(r == 3 && c == 2)
		{
			System.out.println("Addition Is possible");
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					n[i][j] = m[i][j] + n[i][j];
					System.out.print(n[i][j] + ",");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Exception: Addition Not Possible!!");
		}
	}
	
	public static void main(String[] args)
	{
		Matrix m = new Matrix();
		m.getElementAt();
		m.setElementAt();
		m.findElement();
		
		int n[][] = {{6,7} , {8,9}};
		
		m.add(n, 2, 2);
		
	}

}
