package programs;

public class Employee_KK 
{
	private int id;
	private String name;
	private String department;
	public int salary;
	
	Employee_KK()
	{
		id = 0;
		name = "";
		department = "";
		salary = 0;
	}
	
	Employee_KK(int i, String n, String d, int s)
	{
		id = i;
		name = n;
		department = d;
		salary = s;
	}
	
	void display()
	{
		System.out.println("Displaying Information");
		System.out.println("Name = " + name);
		System.out.println("Id no = " + id);
		System.out.println("Department = " + department);
	}
	

}
