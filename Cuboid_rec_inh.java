package programs;

public class Cuboid_rec_inh extends Rec_Inheritance {
		public int height;
		Cuboid_rec_inh(int l, int b, int h)
		{
			super(l,b);
			this.height = h;
		}
		public double volume()
		{
			return (this.length * this.breadth * this.height);
		}
		
		public static void main(String[] args)
		{
			Rec_Inheritance obj2 = new Rec_Inheritance(6,5);
			Cuboid_rec_inh obj = new Cuboid_rec_inh(6,5,2);
			
			System.out.println("Volume is: " +obj.volume());
			System.out.println("Area is: " +obj2.area());
			
		}
	}



