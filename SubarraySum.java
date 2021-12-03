package programs;
import java.util.*;
public class SubarraySum
{
	int sum(int arr[], int n,int s)
	{
		int current;
		for(int i = 0; i < n; i++)
		{
			current = arr[i];
			for(int j = i + 1; j < n; j++)
			{
				if(current == s)
				{
					System.out.println("Sum found in subarray between indexes= "+ i +" and " + (j-1));
					return 1;
				}
				if(current > s || j == n)
				{
					break;
				}
				current = current + arr[j];
			}
			
		}
		System.out.println("No subarray is found!!");
		return 0;
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		SubarraySum obj = new SubarraySum();
		int a[] = {2,3,5,6,7,8,3,5,9,6};
		int n = a.length;
		System.out.println("Enter the sum value: ");
		int s = sc.nextInt();
		
		obj.sum(a, n, s);
		
	}

}
