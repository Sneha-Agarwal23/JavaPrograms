package programs;

public class Queue 
{
	int size = 5;
	int q[] = new int[size];
	int front = 0;
	int rear = 0;
	
	void enqueue(int n)
	{
		if(rear == size)
		{
			System.out.println("Queue Overflow!!");
			return;
		}
		q[rear] = n;
		rear++;
	}
	
	void dequeue()
	{
		if(front == rear)
		{
			System.out.println("Queue is emptyy!!");
			return;
		}
		System.out.println("Deleted element: "+ q[front]);
		front++;
	}
	
	void display()
	{
		if(front == rear)
		{
			System.out.println("Queue is emptyy!!");
			return;
		}
		for(int i = front; i < rear; i++)
		{
			System.out.println("ELements are: "+q[i]);	
		}
		
	}
	
	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(40);
		q.enqueue(60);
		
		q.display();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}
