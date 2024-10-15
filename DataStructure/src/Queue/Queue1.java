package Queue;

public class Queue1 {

private int Queue[], MaxSize, front , rear;
	
	public void create_Stack(int size)
	{
		
	front=0;
	rear=-1;//create Queue
		MaxSize=size; //init MaxSize
		Queue=new int[size];
		
	}
	
	void Enqueue(int e)
	{
		
		rear++;
		Queue[rear]=e;
		System.out.println("Element " + e + " Inserted Queue:");
	}
	boolean is_Full()

	{
		if(rear==MaxSize-1)
		{
			return true;
		}
		
		else 
		{
			return false;
			
		}
		
		
	}
	
	int Dequeue() {
		int temp = Queue[front];
		front++;
		return (temp);
		//return(stack[tos--]); 

	}
		
	

boolean is_Empty() {
if (front>rear)          //Very important
return true;
else
return false;
}

int peek() {
return (Queue[rear]);
}

void print_Queue() {//lifo print 
	System.out.println("Queue has");
for (int i = front; i <= rear; i++) {
System.out.println(Queue[i]);
}

}
}
