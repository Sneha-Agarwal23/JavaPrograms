package programs;

public class Sphere
{
	private int radius;
	
	public int getRadius()
	{
		return radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	public static void main(String[] args)
	{
		Sphere obj = new Sphere();
		obj.setRadius(4);
		int r = obj.getRadius();
		System.out.println("Area is:  " + (4 * 3.14 * r * r));
	}

}
