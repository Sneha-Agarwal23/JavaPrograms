package programs;

public class Rectangle 
{
		int length;
		int breadth;
		public int area()
		{
			return (length * breadth);
		}
		public int perimeter()
		{
			return (2 *(length + breadth));
		}
		public static void main(String[] args)
		{
			Rectangle obj = new Rectangle();
			obj.length = 5;
			obj.breadth = 10;
			System.out.println("Area is: "  + obj.area());
			System.out.println("Perimeter is: "  + obj.perimeter());
		}
		

	}


