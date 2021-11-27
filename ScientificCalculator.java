package programs;
import java.lang.*;

public class ScientificCalculator extends BasicCalculator implements Calculator
{
	void logarithmic(int a)
	{
		System.out.println("Log of "+ a + ":" + Math.log(a));
	}
	
	void exponential(int a)
	{
		System.out.println("Exponential of "+ a + ":" + Math.exp(a));
	}
	
}

/* 3.4-- Change the access specifier to protected from public which will restrict all functions of 
 this class from showing up in the interface but the local user of this class will be able to access
all the basic functions as well as scientific functions as this class extends the basic one
*/