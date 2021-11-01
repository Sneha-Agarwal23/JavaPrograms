package programs;

public class Avg_no_varargs {
	public static void test(int arr[])
	{
		int sum = 0;
		for(int element: arr)
		{
			sum = sum + element;
		}
		System.out.println("The average of numbers is: "+ sum/arr.length);	
	}
	
	public static void main(String[] args)
	{
		int a[]= {2,4,6,8,10};
		test(a);
		int b[]= {2,4,6,8,10,30};
		test(b);
	}

}
