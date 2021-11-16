package programs;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Time
{
	public static void main(String[] args)
	{
		Date d = new Date();
		System.out.println(d.getHours() + ":" + d.getMinutes() + ":"+ d.getSeconds());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
		String myDate = dt.format(df);
		System.out.println(myDate);

	}

}
