package programs;


public class Employee
{
	int salary;
	String name;
	
	public int getSalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
	public String setName(String n)
	{
		name = n;
		return n;
	}
	
	public static void main(String[] args)
	{
		Employee obj = new Employee();
		obj.setName("Sneha Agarwal");
		obj.salary = 70000;
		System.out.println(obj.getName());
		System.out.println(obj.getSalary());
	}
}

