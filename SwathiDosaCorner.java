package programs;
import java.util.*;

public interface SwathiDosaCorner
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("There are two types od Dosa's served here:");
		System.out.println("Press 1 to order Masala Dosa  Press 2 to order Onion Dosa: ");
		int x = sc.nextInt();
		
		if(x == 1)
		{
			MasalaDosa md = new MasalaDosa();
			md.display();
		}
		else
		{
			OnionDosa od = new OnionDosa();
			od.display();
		}
	}

}
