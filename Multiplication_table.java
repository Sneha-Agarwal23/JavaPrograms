package programs;

public class Multiplication_table {
	
	static void Multiplication(int n)
	{
		for(int i = 1; i<=10; i++)
		{
			System.out.println(n + " X " + i + " = " + n*i);
		}
	}
	public static void main(String[] args)
	{
		Multiplication(7);
	}

}
