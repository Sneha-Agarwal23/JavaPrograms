package programs;
import java.util.*;

public class Parenthesis
{
	boolean matching(String e)
	{
		ArrayDeque<Character> p = new ArrayDeque<Character>();
		for(int i = 0; i < e.length(); i++) 
		{
			char s = e.charAt(i);
			if(s == '(' || s == '{' || s == '[')
			{
				p.push(s);
				continue;
			}
			
			if(p.isEmpty())
			{
				return false;
			}
			
			char check;
			switch(s)
			{
				case ')' : check = p.pop();
						   if(check == '{' || check =='[')
						   {
							   return false;
						   }
						   break;
				case '}' : check = p.pop();
				   		   if(check == '(' || check =='[')
				   		   {
				   			   return false;
				   		   }
				   		   break;
				case ']' : check = p.pop();
						   if(check == '{' || check =='(')
						   {
							   return false;
						   }
						   break;
			}
		}
		return (p.isEmpty());	
	}
	
	public static void main(String[] args)
	{
		Parenthesis obj = new Parenthesis();
		String e = "[()][()()]()";
		if(obj.matching(e))
		{
			System.out.println("Parenthesis Balanced!!  Truee..");
		}
		else
		{
			System.out.println("Parenthesis Unbalanced!!  False..");
		}
	}

}
