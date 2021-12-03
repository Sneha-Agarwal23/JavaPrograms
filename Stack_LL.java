package programs;
import java.lang.*;

public class Stack_LL 
{
	class Node
	{
		int data;
		Node link;
	}
	
	Node Top;
	
	Stack_LL()
	{
		this.Top = null;
	}
	
	void push(int x)
	{
		Node temp = new Node();
		if(temp == null)
		{
			System.out.println("Stack Overflow!!");
			return;
		}
		temp.data = x;
		temp.link = Top;
		Top = temp;
	}
	
	void pop()
	{
		if(Top == null)
		{
			System.out.println("Stack Underflow!!");
			return;
		}
		System.out.println("Popped element: "+ Top.data);
		Top = (Top).link;
	}
	
	void display()
	{
		if(Top == null)
		{
			System.out.println("Stack Underflow!!");
			return;
		}
		Node temp = Top;
		while(temp != null)
		{
			System.out.println("Elements are: " +temp.data);
			temp = temp.link;
		}
	}
	
	public static void main(String[] args)
	{
		Stack_LL s = new Stack_LL();
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(7);
		
		s.display();
		s.pop();
		s.display();
	}

}
