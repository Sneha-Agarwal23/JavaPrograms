package programs;

public class CGPA_Calculation {
	public static void main(String[] args)
	{
		float subject1 = 90;
		float subject2 = 40;
		float subject3 = 70;
		
		float cgpa = (subject1 + subject2 + subject3)/30;
		System.out.println("The CGPA is : " +cgpa);
	}

}
