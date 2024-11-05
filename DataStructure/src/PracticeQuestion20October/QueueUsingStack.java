package PracticeQuestion20October;

public class QueueUsingStack {
	
	private int stack[];
	private int top;
	private int size;
	
	
	public QueueUsingStack (int size)
	{
		this.size=size;
		stack = new int[size];
		top=-1;
		
		
	}
	
	
	public void push(int data)
	{
		
		if(top==size-1)
		{
			
			System.out.println("Stack overflow");
			return;
		}
		stack [++top]= data;
	}
	
	public int pop()
	{
		if(top==-1)
		{
			System.out.println("Strack Underflow");
			return -1;
		}
		return stack[top--];
	}
	
	public int peek()
	{
		if(top==-1)
		{
			return -1;
		}
		return stack[top];
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
	
	public class  QueueUsingTwoStacks
	{
		private QueueUsingStack stack1;
		private QueueUsingStack stack2;
		
		public QueueUsingTwoStacks(int size)
		{
			
			stack1= new QueueUsingStack(size);
			stack2= new QueueUsingStack(size);
			
		}
			public void enqueue(int data)
			{
				stack1.push(data);
				System.out.println(data+ "enqueued");
			}
				
			public int dequeue()
			{
				if(stack1.isEmpty() && stack2.isEmpty())
				{
					System.out.println("Queue is empty");
                    return -1;					
				}
				return size;
				
				
			}
		
		
	}

}




//    // Enqueue operation
//    public void enqueue(int data) {
//        stack1.push(data);
//        System.out.println(data + " enqueued");
//    }
//
//    // Dequeue operation
//    public int dequeue() {
//        if (stack1.isEmpty() && stack2.isEmpty()) {
//            System.out.println("Queue is empty");
//            return -1;
//        }
//
//        if (stack2.isEmpty()) {
//            while (!stack1.isEmpty()) {
//                stack2.push(stack1.pop());
//            }
//        }
//
//        return stack2.pop();
//    }
//
//    // Peek operation (to get the front element)
//    public int peek() {
//        if (stack1.isEmpty() && stack2.isEmpty()) {
//            System.out.println("Queue is empty");
//            return -1;
//        }
//
//        if (stack2.isEmpty()) {
//            while (!stack1.isEmpty()) {
//                stack2.push(stack1.pop());
//            }
//        }
//
//        return stack2.peek();
//    }
//
//    // Check if the queue is empty
//    public boolean isEmpty() {
//        return stack1.isEmpty() && stack2.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(10);
//
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//
//        System.out.println("Dequeued: " + queue.dequeue()); // Should dequeue 10
//        System.out.println("Peek: " + queue.peek()); // Should return 20
//
//        queue.enqueue(40);
//        System.out.println("Dequeued: " + queue.dequeue()); // Should dequeue 20
//        System.out.println("Peek: " + queue.peek()); // Should return 30
//
//        System.out.println("Is queue empty? " + queue.isEmpty()); // Should return false
//        queue.dequeue(); // Dequeues 30
//        queue.dequeue(); // Dequeues 40
//        System.out.println("Is queue empty? " + queue.isEmpty()); // Should return true
//    }
//}
