package programs;

public class BasicCalculator implements Calculator
{
	void addition(int a, int b)
	{
		System.out.println("Addition: " +(a+b));
	}
	
	void substraction(int a, int b)
	{
		System.out.println("Substraction: " +(a-b));
	}
	
	void multiplication(int a, int b)
	{
		System.out.println("Multiplication: " +(a*b));
	}
	
	void division(int a, int b)
	{
		System.out.println("Division: " +(a/b));
	}
	
	void modulus(int a, int b)
	{
		System.out.println("Modulus: " +(a % b));
	}
	

}
