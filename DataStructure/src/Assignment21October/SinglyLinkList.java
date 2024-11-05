//A) Write a menu driven program for singly linked list-
//-	To create linked list.
//-	To display linked list
//-	To search node in linked list.
//-	Insert at last position
package Assignment21October;
import java.util.Scanner;
public class SinglyLinkList {
	
	static class Node{
		
		int data;
		Node next;
        
		Node(int data)
		{
	          this.data=data;
	          next=null;
		}
	}
	
	Node head=null;
	
	public void insertAtEnd(int data)
	{
		Node newNode = new Node(data);
		if(head== null)
		{
			head =newNode;
		}
		else {
			Node temp= head;
			while(temp.next !=null)
			{
				temp=temp.next;
			}
			temp.next =newNode;
		}
		System.out.println("Node inserted at end");
	}
	public void display()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node temp=head;
		System.out.println("Linked List");
		while(temp !=null)
		{
			System.out.println(temp.data + " -> ");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public boolean search(int key)
	{
		Node temp=head;
		while(temp !=null)
		{
			if(temp.data==key)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SinglyLinkList list = new SinglyLinkList();
        Scanner sc= new Scanner(System.in);
        int choice, value;
        do {
        	
        	
        	
        	System.out.println("------Menu-------");
        	System.out.println("1. Insert at Last");
        	System.out.println("2. Display Linked List");
        	System.out.println("3. Search in Linked List");
        	System.out.println("4. Exit");
        	System.out.println("Enter your choice");
        	choice = sc.nextInt();
        	
        	switch(choice)
        	{
        	case 1:
        		System.out.println("Insert the value to insert");
        		value=sc.nextInt();
        		list.insertAtEnd(value);
        		break;
        	case 2:
        		list.display();
        		break;
        		
        	case 3:
        		System.out.println("Enter element to search");
        		value=sc.nextInt();
        		if(list.search(value))
        		{
        			System.out.println("value found in the list....");
        		}
        		else
         		{
                    System.out.println("Value not found in the list....");     			
        		}
        		break;
        		
        	case 4:
        		System.out.println("Exiting Program.");
        		break;
        		default:
        			System.out.println("Invalid choice Please enter Valid choice");
        	}
        }  while(choice !=4);
	}

}
