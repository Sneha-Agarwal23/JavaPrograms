package programs;

public class Circle 
{
		int radius;
		public double area()
		{
			return (3.14 * radius * radius);
		}
		public double perimeter()
		{
			return (2 * 3.14 * radius);
		}
		public static void main(String[] args)
		{
			Circle obj = new Circle();
			obj.radius = 5;
			System.out.println("Area is: "  + obj.area());
			System.out.println("Perimeter is: "  + obj.perimeter());
		}
		

	}


