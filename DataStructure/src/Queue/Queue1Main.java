package Queue;


import java.util.Scanner;

public class Queue1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		 Queue1 obj=new  Queue1();
		//object created 
		 System.out.println("Enter size of queue:");
		int size=in.nextInt();
		//obj.create_Stack(5);
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
		if(obj.is_Full()!=true)//not full 
			{
		System.out.println("Enter a number:");
		e=in.nextInt();
		obj.Enqueue(e);
		}
		else {
		System.out.println("Queue Full");
		}
		break;
		case 2:
		if(obj.is_Empty()!=true)//not empty 
			{
		System.out.println("Element Dequeued is "+obj.Dequeue());
		}
		else {
		System.out.println("Queue Empty");
		}
		break;
		case 3:
		if(obj.is_Empty()!=true)//not empty 
			{
		System.out.println("Element @peek is "+obj.peek());
		}
		else {
		System.out.println("Queue Empty");
		}
		break;
		case 4:
		if(obj.is_Empty()!=true)//not empty
			{
		System.out.println("Elements in Queue are\n");
		obj.print_Queue();;
		}
		else {
		System.out.println("Queue Empty");
		}
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