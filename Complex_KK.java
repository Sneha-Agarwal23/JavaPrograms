package programs;

public class Complex_KK 
{
	public int x1;
	public int x2;
	public int y1;
	public int y2;
	
	 void Add1()
	 {
		 x1 = x1 + x2;
		 y1 = y1 + y2;
		 System.out.println("The result of c1 = c1 + c2 : " + x1 + " +i" + y1);
	 }
	 
	 void Add2()
	 {
		 int x3, y3;
		 x3 = x1 + x2;
		 y3 = y1 + y2;
		 System.out.println("The result of c3 = c1 + c2 : " + x3 + " +i" + y3);	 
	 }
	 
	 void Sub1()
	 {
		 x1 = x1 - x2;
		 y1 = y1 - y2;
		 System.out.println("The result of c1 = c1 - c2 : " + x1 + " +i" + y1);
	 }
	 
	 void Sub2()
	 {
		 int x3, y3;
		 x3 = x1 - x2;
		 y3 = y1 - y2;
		 System.out.println("The result of c3 = c1 - c2 : " + x3 + " +i" + y3);	 
	 }
	 
	 void Mul()
	 {
		 int c3 = (x1 * x2) - (y1 * y2);
		 System.out.println("The result of c3 = c1 * c2 : " + c3); 
	 }
	 
	 public static void main(String[] args)
	 {
		 Complex_KK obj = new Complex_KK();
		 
		 obj.x1 = 20;
		 obj.x2 = 4;
		 obj.y1 = 10;
		 obj.y2 = 6;
		 
		 obj.Add1();
		 obj.Add2();
		 obj.Sub1();
		 obj.Sub2();
		 obj.Mul();
		 
	 }
	 
	 
	 
	 

}
