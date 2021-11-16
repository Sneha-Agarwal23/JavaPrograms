package programs;

public class Cylinder2_cir_inh extends Circle_inheritance
{
		public int height;
		Cylinder2_cir_inh(int r, int h)
		{
			super(r);
			this.height = h;
		}
		public double volume()
		{
			return (3.14 * this.radius * this.radius * this.height);
		}
		
		public static void main(String[] args)
		{
			Cylinder2_cir_inh obj = new Cylinder2_cir_inh(4,6);
			System.out.println("Volume is:  " + obj.volume());
			Circle_inheritance obj2 = new Circle_inheritance(4);
			System.out.println("Area is:  " + obj2.area());
			
		}
	}

