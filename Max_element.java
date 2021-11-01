package programs;

public class Max_element {
	public static void main(String[] args)
	{
		int arr[] = {1,21,45,74,33,12};
		int max = 0;
		for(int element: arr)
		{
			if(element > max)
			{
				max = element;
			}
		}
		System.out.println("Maximum element of the array: " + max);
	}

}
