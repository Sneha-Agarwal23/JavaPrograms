package programs;

public class Manager extends Employee_KK 
{
	private int bonus = 10000;
	
	void display(int s)
	{
		System.out.println("Total Salary = " + (s + bonus));
	}
	
	public static void main(String[] args)
	{
		Manager m = new Manager();
		Employee_KK e1 = new Employee_KK(101, "Sneha Agarwal", "SDE", 170000);
		e1.display();
		m.display(e1.salary);
		
		Employee_KK e2 = new Employee_KK(102, "Priyanka Agarwal", "SDE", 150000);
		e2.display();
		m.display(e2.salary);
	}

}
