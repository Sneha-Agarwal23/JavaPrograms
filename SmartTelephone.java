package programs;

public class SmartTelephone
{
	void ring()
	{
		System.out.println("Ringing");
	}
	void lift()
	{
		System.out.println("Lifting");
	}
	void disconnect()
	{
		System.out.println("Disconnecting");
	}

	public static void main(String[] args)
	{
		SmartTelephone st = new SmartTelephone();
		st.ring();
		st.lift();
		st.disconnect();
	}


}
