package programs;

public class Vehicle
{
	String CompanyName;
	int price;
	
	Vehicle()
	{
		
	}
	
	Vehicle(String c, int p)
	{
		CompanyName = c;
		price = p;
	}

	void display()
	{
		System.out.println("Company Name = " +CompanyName);
		System.out.println("Price = " +price);
	}
}

