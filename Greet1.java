package programs;

public class Greet1 extends Threads
{
	int priority;
	public void run()
	{
		int i = 0;
		while(i < priority)
		{
			System.out.println("Good Morning");
			i++;
		}
	}
	public int getPriority()
	{
		return priority;
	}
	public void setPriority(int priority)
	{
		this.priority = priority;
	}
}
