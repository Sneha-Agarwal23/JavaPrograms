package programs;

public class Greet2 extends Threads
{
	int priority;
	public void run()
	{
		int i = 0;
		while(i < priority)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("Welcomeeee!!");
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
