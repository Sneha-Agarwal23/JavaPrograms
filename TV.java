package programs;

public class TV implements TVRemote
{
	public void channel()
	{
		System.out.println("Channel Changing");
	}
	public void volume()
	{
		System.out.println("Volume is increasing or decreasing");
	}
	public void netflix()
	{
		System.out.println("Watch Red Notice");
	}
	public void prime()
	{
		System.out.println("Watch Mortal Combat");
	}
	public void hotstar()
	{
		System.out.println("Watch Anupama");
	}
	
	public static void main(String[] args)
	{
		TV obj = new TV();
		obj.netflix();
		obj.channel();
		obj.hotstar();
	}
	

}
