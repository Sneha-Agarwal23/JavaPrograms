package programs;

public class Integer_present {
	public static void main(String[] args)
	{
		int [] arr = {4, 8, 5, 11, 9};
		int num = 11;
		boolean isInArray = false;
		for(int element : arr)
		{
			if(num == element)
			{
				isInArray = true;
				break;
			}
		}
		if(isInArray)
		{
			System.out.println(num + " is present");
		}
		else
		{
			System.out.println(num + " is not present");
		}
	}

}
