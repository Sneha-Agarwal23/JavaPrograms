package programs;

public class Encypt_decrypt_grade {
	public static void main(String[] args)
	{
		char grade = 'A';
		grade = (char)(grade + 8);		//encryption
		System.out.println("After encryption: " + grade);
		
		grade = (char)(grade - 8);
		System.out.print("After decryption: ");
		System.out.print(grade);		//decryption
	}

}
