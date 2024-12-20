package LinkedList;

public class circularDoublyLinkedList {

	CDnode root, last;
	
	void create_List()
	{
		root=last=null;
	}
	
	void insert_Left(int data)
	{
		CDnode n= new CDnode(data);
		
		if(root==null)
		{
			
			root=last=n;
			root.next=root;
			root.prev=root;
			
		}
		else 
		{
			n.next=root;
			n.prev=last;
			root.prev=n;
			last.next=n;
			root=n;
			
		}
		System.out.println(root.data+ "Inserted");
		
	}
	
	void delete_left()
	{
		
		if(root==null)
		{
			System.out.println("Empty list");
			
		}
		
		else {
		      
			CDnode t=root;
			if(root==last)
			{
				root=last=null;
				root=root.next;
				last.next=root;
				root.prev=last;
				
			}
			System.out.println(t.data+"Deleted");
			
			
			
		}
		
	}
	
	void insert_right(int data)
	{
		 CDnode n = new CDnode(data);
	        if (root == null) {
	            root = last = n; 
	            root.next = root; 
	            root.prev = root; 
	        } else {
	            last.next = n; 
	            n.prev = last; 
	            n.next = root; 
	            root.prev = n; 
	            last = n; 
	        }
	        System.out.println(data + " inserted");
	    }
	
	
	void right_delete()
	
	{
		if(root==null)
		{
			System.out.println("Empty list");
			
		}
		
		else
		{
			
	            CDnode t = last; 
	            if (root == last) {
	                
	                root = last = null;
	            } else {
	                last = last.prev; 
	                last.next = root; 
	                root.prev = last; 
	            }
	            System.out.println(t.data + " deleted");
	        }
			
		}
	
	 void print_list() {
	        if (root == null) {
	            System.out.println("List Empty");
	        } else {
	            CDnode t = root;
	            do {
	                System.out.print("|" + t.data + "|<->");
	                t = t.next;
	            } while (t != root);
	            System.out.println(" (circular doubly)");
	        }
	    }
				
	}
	
	
	

