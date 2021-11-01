package programs;

public class Sorted_array {
	public static void main(String[] args)
	{
		int arr[] = {1,2,4,6,7};
		boolean isSorted = true;
		for(int i = 0; i<arr.length - 1; i++)
		{
			if(arr[i] > arr[i+1])
			{
				isSorted = false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}

}
