package Stack;

public class StackCharClass {
	
	private int MaxSize,tos;
	private char stack[];
	public void create_Stack(int i)
	{
		
		 tos=-1; //init tos
		 stack = new char[i];  //create stack
		 MaxSize=i; //init MaxSize
		
	}
	
	void push(char e)
	{
		
		tos++;
		stack[tos]=e;
		System.out.println("Element "+e+" Pushed:");
	}
	boolean is_Full()

	{
		if(tos==MaxSize-1)
		{
			return true;
		}
		
		else 
		{
			return false;
			
		}
		
		
	}
	
	char pop() {
		char temp = stack[tos];
		tos--;
		return (temp);
		//return(stack[tos--]); 

	}
		
	

boolean is_Empty() {
if (tos == -1)
return true;
else
return false;
}

char peek() {
return (stack[tos]);
}

void print_Stack() {//lifo print System.out.println("Stack has");
for (int i = tos; i >= 0; i--) {
System.out.println(stack[i]);
}

}
}
