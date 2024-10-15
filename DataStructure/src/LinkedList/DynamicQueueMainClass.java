package LinkedList;

import java.util.Scanner;

public class DynamicQueueMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub






		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		DynamicQueue obj=new  DynamicQueue();
		//object created 
		//System.out.println("Enter size of queue:");
		//int size=in.nextInt();
	     obj.create_Queue();
		int ch,e;
		do
		{
		System.out.println("Queue Menu");
		System.out.println("-----------");
		System.out.println("1.Enque");
		System.out.println("2.Dequeue");
		System.out.println("3.Peek");
		System.out.println("4.Print all elements");
		System.out.println("0.Exit");
		System.out.println("-----------");
		System.out.println("Choice:");
		ch=in.nextInt();
		switch(ch)
		{
		case 1:
		
		System.out.println("Enter a number:");
		e=in.nextInt();
		obj.Enqueue(e);
		
		break;
		case 2:
		
			obj.Dequeue();
		System.out.println("Element Dequeued  ");
		
		break;
//		case 3:
//		
//			obj.peek();
//		System.out.println("Element @peek is ");
//		}
//		else {
//		System.out.println("Queue Empty");
//		}
//		break;
		case 4:
		
		System.out.println("Elements in Queue are\n");
		obj.print_queue();
		
		break;
		case 0:
		System.out.println("Thanks for using code.....");
		break;
		default:
		System.out.println("Wrong option selected:");
		break;
		}

		}while(ch!=0);
		}

}