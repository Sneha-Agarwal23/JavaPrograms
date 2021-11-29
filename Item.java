package programs;
import java.util.*;

public class Item
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> code = new ArrayList<Integer>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> rate = new ArrayList<Integer>();
		ArrayList<Integer> quantity = new ArrayList<Integer>();
		
		
		name.add("Sugar");
		name.add("Salt");
		code.add(2);
		code.add(4);
		rate.add(30);
		rate.add(20);
		quantity.add(40);
		quantity.add(50);
		int x = 1;
		while(x != 0)
		{
			System.out.println("Press 1 To add a new item!! Press 2 to buy an item!! Press 3 to compare item!! Press 0 to exit");
			x = sc.nextInt();
			if(x == 1)
			{
				System.out.println("Enter the item code: ");
				int c = sc.nextInt();
				if(code.contains(c))
				{
					System.out.println("Code already exists!!");
				}
				else
				{
					code.add(c);
					System.out.println("Enter the name: ");
					String n = sc.next();
					name.add(n);
					System.out.println("Enter the price: ");
					int p = sc.nextInt();
					rate.add(p);
					System.out.println("Enter the quantity: ");
					int q = sc.nextInt();
					quantity.add(q);
				}
			}
			else if(x == 2)
			{
				System.out.println("Enter the item name: ");
				String i = sc.next();
				if(name.contains(i))
				{
					int a = name.indexOf(i);
					int q = quantity.get(a);
					int r = rate.get(a);
					System.out.println("The quantity of the item ="+q);
					System.out.println("Rate of the item is = "+r);
					System.out.println("Do you want to buy? Press 1 to buy  Press 2 to exit!");
					int k = sc.nextInt();
					if(k == 1)
					{
						quantity.add(a,(q -1));
						System.out.println("Item bought!! Remaining quantity  = "+(q-1));
					}
				}
				else
				{
					System.out.println("Item does not exist");
				}
			}
			else if(x == 3)
			{
				System.out.println("Enter the amount: ");
				int t = sc.nextInt();
				int s = rate.size();
				
				int count = 0;
				for(int i = 0; i < s; i++)
				{
					int o = rate.get(i);
					if(t < o)
					{
						count++;
					}
				}
				System.out.println("Total items in list = "+s);
				System.out.println("Items out of budget amount = "+count);
			}
			
		}
			
		}
}
