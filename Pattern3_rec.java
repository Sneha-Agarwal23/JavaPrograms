package programs;

public class Pattern3_rec {
	static void Pattern3_rec(int n)
	{
		if(n > 0)
		{
			Pattern3_rec(n-1);
			for(int i = 0; i<n; i++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Pattern3_rec(5);
	}

}
