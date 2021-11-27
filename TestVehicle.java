package programs;
import java.util.*;

public class TestVehicle extends Vehicle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int u = 100001;
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter the type of Vehicle - Press 1 for LightMotorVehicle 2 for HeavyMotorVehicle");
			int x = sc.nextInt();
			System.out.println("Enter the name: ");
			String name = sc.next();
			System.out.println("Enter the price: ");
			int p = sc.nextInt();
			System.out.println("Unique no of the Vehicle = " + u);
			u++;
			Vehicle v = new Vehicle(name, p);
			v.display();
			if(x == 1)
			{
				LightMotorVehicle obj = new LightMotorVehicle();
				System.out.println("Mileage of LMV is = "+obj.mileage +" km/liter");
			}
			else
			{
				HeavyMotorVehicle obj1 = new HeavyMotorVehicle();
				System.out.println("Capacity of HMV is = "+obj1.capacity +"Tones");
			}
			
		
		}
		
	}
	
	
	
	

}
