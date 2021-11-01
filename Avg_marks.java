package programs;

public class Avg_marks {
	public static void main(String[] args)
	{
	int [] marks = {70, 60, 90, 80, 50};
	int sum = 0 ;
	for(int element: marks)
	{
		sum = sum + element;
	}
	System.out.println("Value of average marks is: " + sum/marks.length);
	}

}
