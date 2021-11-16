package programs;

public class Fountain_pen extends Pen
{
	void write()
	{
		System.out.println("Writing");
	}
	void refill()
	{
		System.out.println("Refill");
	}
	void ChangeNib()
	{
		System.out.println("Changing the nib");
	}
	public static void main(String[] args)
	{
		Fountain_pen p = new Fountain_pen();
		p.ChangeNib();
		p.write();
	}

}
