package LinkedList;
import java.util.Scanner;
public class LinkedListWithStackMain {

	


		
		
	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner in=new Scanner(System.in);
				LinkedListWithStack obj=new LinkedListWithStack();
				// System.out.println("Enter size of stack:");
				//int size=in.nextInt();
				obj.create_stack();
				int ch,e;
				do
				{
				System.out.println("Stack Menu");
				System.out.println("-----------");
				System.out.println("1.Push");
				System.out.println("2.Pop");
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
				obj.push(e);
				
				break;
				case 2:
					obj.pop();
				System.out.println("Element poped is ");
				
				break;
				case 3:
					obj.peek();
				System.out.println("Element @peek is ");
				
				
				break;
				case 4:
				
				System.out.println("Elements in stack are\n");
				obj.print_stack();
				
				break;
				case 0:
				System.out.println("Thanks for using code....");
				break;
				default:
				System.out.println("Wrong option selsected:");
				break;
				}

				}while(ch!=0);
				}

		}