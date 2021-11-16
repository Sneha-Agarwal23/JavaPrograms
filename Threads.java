package programs;

public class Threads {
	public static void main(String[] args)
	{
		Greet1 obj = new Greet1();
		Greet2 objj = new Greet2();
		obj.setPriority(5);
		objj.setPriority(10);
		System.out.println(obj.getPriority());
		System.out.println(objj.getPriority());
		obj.run();
		objj.run();
		
	}

}
