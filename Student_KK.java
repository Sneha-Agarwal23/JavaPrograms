package programs;

public class Student_KK
{
	public int roll_no;
	public String name;
	public String course;
	public int m1, m2, m3, m4, m5;
	
	
	Student_KK(int r, String n, String c, int ma1, int ma2, int ma3, int ma4, int ma5)
	{
		roll_no = r;
		name = n;
		course = c;
		m1 = ma1;
		m2 = ma2;
		m3 = ma3;
		m4 = ma4;
		m5 = ma5;
	}
	
	void avg_student()
	{
		double avg = (m1 + m2 + m3 + m4 + m5)/5;
		System.out.println("The average of the marks of student: " +avg);
	}
	
	void details()
	{
		System.out.println("Student Information: ");
		System.out.println("Name: " +name);
		System.out.println("Roll No: " +roll_no);
		System.out.println("Course: " +course);
		
	}
	public static void main(String[] args)
	{
		Student_KK s1 = new Student_KK(1, "Alex" , "Arts", 90, 80, 70, 85, 95);
		Student_KK s2 = new Student_KK(2, "Derek" , "Commerce", 75, 84, 69, 96, 88);
		Student_KK s3 = new Student_KK(3, "Jo" , "Science", 95, 87, 73, 85, 98);
		
		int avg1 = (s1.m1 + s2.m1 +s3.m1)/3;
		int avg2 = (s1.m2 + s2.m2 +s3.m2)/3;
		int avg3 = (s1.m3 + s2.m3 +s3.m3)/3;
		int avg4 = (s1.m4 + s2.m4 +s3.m4)/3;
		int avg5 = (s1.m5 + s2.m5 +s3.m5)/3;
		
		s1.details();
		s1.avg_student();
		
		s2.details();
		s2.avg_student();
		
		s3.details();
		s3.avg_student();
		
		System.out.println("Subject wise average of students: ");
		System.out.println("Sub 1 \t Sub 2 \t Sub 3 \t Sub 4 \t Sub 5");
		System.out.println(avg1 + "\t"+ avg2 +"\t"+ avg3 +"\t"+ avg4 +"\t"+ avg5);
		
	}

}
