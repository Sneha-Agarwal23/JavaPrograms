package programs;
import java.util.*;

public class CellPhone {
	public void ring()
	{
		System.out.println("Ringing......");
	}
	public void vibrate()
	{
		System.out.println("Vibrating");
	}
	public static void main(String[] args)
	{
		CellPhone redmi = new CellPhone();
		Scanner sc = new Scanner(System.in);
		int s = 0;
		System.out.println("Is the phone silent? 0 for NO, 1 for YES");
		s = sc.nextInt();
		if(s == 0)
		{
			redmi.ring();
		}
		else
		{
			redmi.vibrate();
		}
	}

}
