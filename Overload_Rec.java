package programs;

public class Overload_Rec
{
	 int length;
	 int breadth;
	 
	 public Overload_Rec()
	 {
		 this.length = 0;
		 this.breadth = 0;
	 }
	 public Overload_Rec(int length, int breadth)
	 {
		 this.length = length;
		 this.breadth = breadth;
	 }
	 public int getLength()
	 {
		 return length;
	 }
	 public int getBreadth()
	 {
		 return breadth;
	 }
	 
	 public static void main(String[] args)
	 {
		 Overload_Rec r = new Overload_Rec();
		 Overload_Rec obj = new Overload_Rec(4,5);
		 System.out.println("Length is: " +obj.getLength());
		 System.out.println("Breadth is: " +obj.getBreadth());	 	 
	 }
}
