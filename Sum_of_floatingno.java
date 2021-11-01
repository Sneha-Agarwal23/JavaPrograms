package programs;

public class Sum_of_floatingno {
	public static void main(String[] args)
	{
	float [] arr = {45.7f, 66.8f, 87.2f, 99.2f};
	float sum = 0 ;
	for(float element: arr)
	{
		sum = sum + element;
	}
	System.out.println("The value of sum is : " + sum);
	}
}
