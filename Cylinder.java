package programs;

public class Cylinder 
{
	private int radius;
	private int height;
	
	public int getRadius()
	{
		return radius;
	}
	public void setRadius(int radius)
	{
		this.radius = radius;
	}
	public int getHeight()
	{
		return height;
	}
	public void setHeight(int height)
	{
		this.height = height;
	}
	public double surfaceArea()
	{
		return ((2 * 3.14 * radius * radius )+(2 * 3.14 * radius * height));
	}
	public double volume()
	{
		return (3.14 * radius * radius * height);
	}
	public static void main(String[] args)
	{
		Cylinder obj = new Cylinder();
		obj.setHeight(6);
		int h = obj.getHeight();
		obj.setRadius(4);
		int r = obj.getRadius();
		System.out.println("Surface area is : " + obj.surfaceArea());
		System.out.println("Volume is : " + obj.volume());
	}
	

}
