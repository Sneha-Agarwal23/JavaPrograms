package programs;

public class Fibonacci_nth_term_rec {
	int fib(int n)
	{
		if(n == 1)
		{
			return 0;
		}
		else if(n == 0) 
		{
			return 1;
		}
		else 
		{
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static void main(String[] args)
	{
		Fibonacci_nth_term_rec obj = new Fibonacci_nth_term_rec();
		int c = obj.fib(8);
		System.out.println("The 8th element of the fibonacci series is: " + c);
	}

}
