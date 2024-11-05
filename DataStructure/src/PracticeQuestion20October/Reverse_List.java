//package PracticeQuestion20October;
//
//public class Reverse_List {
//	
//	 Node root;
//	void create_list() {
//	    root = null;
//	}
//
//	
//	void reverse()
//	{
//	int length=0;
//	if (root == null)
//	System.out.println("List Empty");
//	else{
//
//	Node t = root;
//	while (t != null) {
//	length++;
//	t = t.next;
//	}
//	//create stack of size of length 
//	//read all elements and push on stack 
//	//traverse again linked list to write back the data on linked list
//	}
//
//	
//	
//	void insert(int data) {
//	    Node n = new Node(data);
//	    if (root == null) {
//	        root = n; // n becomes the first element
//	    } else {
//	        Node t = root;
//	        while (t.next != null) {
//	            t = t.next;
//	        }
//	        t.next = n;
//	    }
//	    System.out.println(data + " inserted");
//	}
//
//	void print_list() {
//	    if (root == null) {
//	        System.out.println("List Empty");
//	    } else {
//	        Node t = root;
//	        while (t != null) {
//	            System.out.print("|" + t.data + "|->");
//	            t = t.next;
//	        }
//	        System.out.println();
//	    }
//	}
//	
//	
//	
//	 public static void main(String[] args) {
//	    	Reverse_List list1 = new Reverse_List();
//	        list1.create_list();
//	        list1.insert(10);
//	        list1.insert(15);
//	        list1.insert(20);
//	        list1.insert(25);
//	        System.out.println("Sorted list 1");
//	        list1.print_list();
//
//	
//}
//}
//	
	
	package PracticeQuestion20October;

	import java.util.Stack;

	

	public class Reverse_List {

	    Node root;

	    void create_list() {
	        root = null;
	    }

	    void reverse() {
	        if (root == null) {
	            System.out.println("List Empty");
	            return;
	        }

	        Node t = root;
	        Stack<Integer> stack = new Stack<>();
	        
	        while (t != null) {
	            stack.push(t.data);
	            t = t.next;
	        }

	        t = root;
	        while (t != null) {
	            t.data = stack.pop();
	            t = t.next;
	        }

	        System.out.println("List reversed successfully.");
	    }

	    void insert(int data) {
	        Node n = new Node(data);
	        if (root == null) {
	            root = n;
	        } else {
	            Node t = root;
	            while (t.next != null) {
	                t = t.next;
	            }
	            t.next = n;
	        }
	        System.out.println(data + " inserted");
	    }

	    void print_list() {
	        if (root == null) {
	            System.out.println("List Empty");
	        } else {
	            Node t = root;
	            while (t != null) {
	                System.out.print("|" + t.data + "|->");
	                t = t.next;
	            }
	            System.out.println("null");
	        }
	    }

	    public static void main(String[] args) {
	        Reverse_List list1 = new Reverse_List();
	        list1.create_list();
	        list1.insert(10);
	        list1.insert(15);
	        list1.insert(20);
	        list1.insert(25);
	        System.out.println("Original list:");
	        list1.print_list();

	        list1.reverse();
	        System.out.println("Reversed list:");
	        list1.print_list();
	    }
	}
