package programs;

public class Letter_template {
	public static void main(String[] args)
	{
		String letter = "Dear <|name|>, Thanks a lot!";
		letter = letter.replace("<|name|>", "Amazon");
		System.out.println(letter);
	}

}
