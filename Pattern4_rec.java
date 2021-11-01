package programs;

public class Pattern4_rec {
	static void Pattern4_rec(int n)
	{
		if(n > 0)
		{
			for(int i = n; i>0; i--)
			{
				System.out.print(" * ");
			}
			System.out.println();
			Pattern4_rec(n-1);
		}
	}
	
	public static void main(String[] args)
	{
		Pattern4_rec(5);
	}


}
