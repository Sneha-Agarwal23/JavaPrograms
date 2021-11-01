package programs;

public class Recursive_naturalno_sum {
	static int sumRec(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n + sumRec(n-1);
		}
	}
	
	public static void main(String[] args)
	{
		int c = sumRec(5);
		System.out.println("The sum is: " +c);
	}

}
