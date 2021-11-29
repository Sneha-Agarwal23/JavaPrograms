package programs;
import java.lang.Thread;

public class MyClass extends Thread
{
	
	public void run()
	{
		System.out.println("The thread is running!!");
	}
	public static void main(String [] args)
	{
		MyClass obj = new MyClass();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		Thread t3 = new Thread(obj);
		Thread t4 = new Thread(obj);
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("The state of Thread t1 while it is invoked: "+ t1.getState());
		System.out.println("Priority is: "+ t1.getPriority());
		
		t2.start();
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("The state of Thread t1 while it is invoked: "+ t2.getState());
		System.out.println("Priority is: "+ t2.getPriority() + 0);
		
		t3.start();
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("The state of Thread t1 while it is invoked: "+ t3.getState());
		System.out.println("Priority is: "+ t3.getPriority()+ 2);
		
		t4.start();
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("The state of Thread t1 while it is invoked: "+ t4.getState());
		System.out.println("Priority is: "+ t4.getPriority()+ 1);
		
	}

}
