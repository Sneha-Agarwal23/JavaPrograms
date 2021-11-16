package programs;

public class Human extends Monkey implements Basic_Animal
{
	public void eat()
	{
		System.out.println("Eating");
	}
	public void sleep()
	{
		System.out.println("Sleeping");
	}
	
	public static void main(String[] args)
	{
		Human A = new Human();
		A.sleep();
		
		Monkey m1 = new Human();
		m1.jump();
		m1.bite();
		Basic_Animal joy = new Human();
		
	}
}
