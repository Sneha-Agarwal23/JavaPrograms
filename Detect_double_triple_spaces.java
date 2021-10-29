package programs;

public class Detect_double_triple_spaces {
	public static void main(String[] args)
	{
		String myString = "I want to  eat   Dal Makhni";
		System.out.println("Index of double space: " + myString.indexOf("  "));
		System.out.println("Index of triple space: " + myString.indexOf("   "));
		
	}

}
