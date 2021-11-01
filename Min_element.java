package programs;

public class Min_element {
	public static void main(String[] args)
	{
		int arr[] = {99,21,45,74,33,12};
		int min = arr[1];
		for(int element: arr)
		{
			if(element < min)
			{
				min = element;
			}
		}
		System.out.println("Minimum element of the array: " + min);
	}

}
