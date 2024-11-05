//Write a  program to create doubly link list and display nodes having odd value.
package Assignment21October;

import java.util.Scanner;

public class doublyLinkedList {
	
	static class Node{
		
		int data;
		Node prev;
		Node next;
		Node (int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}
		
	}
	 Node head = null;
	public void insertAtEnd(int data)
	{
		Node newNode= new Node(data);
		if(head ==null)
		{
			head=newNode;
		}
		else {
			Node temp =head;
			while(temp.next !=null)
			{
				temp=temp.next;
			}
		}
	}
	public void displayOddValues()

	{
		if(head == null)
		{
			System.out.println("List is empty.");
			return;
		}
		Node temp=head;
		System.out.println("Node with odd values");
		boolean foundOdd=false;
		while(temp!=null)
		{
			if(temp.data %2 !=0)
			{
				System.out.println(temp.data + " ");
				foundOdd=true;
			}
			temp=temp.next;
		}
		if(!foundOdd)
		{
			System.out.println("No odd values found in the list");
		}
		else {
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		doublyLinkedList list = new doublyLinkedList();
		Scanner sc= new Scanner(System.in);
		int choice , value;
		do {
			
			
			System.out.println("--------------Menu---------------");
			System.out.println("1. Insert at Last");
			System.out.println("2. Display Odd Values");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter the value to insert");
				value = sc.nextInt();
				list.insertAtEnd(value);
				break;
			
			case 2:
				list.displayOddValues();
				break;
			
				
			case 3:
				System.out.println("Exiting program.");
				break;
				default:
					System.out.println("Invalid choice . Please try again...");
			}
		}
		while(choice!=4);
	}

}




