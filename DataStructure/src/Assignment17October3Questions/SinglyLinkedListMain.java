package Assignment17October3Questions;
import java.util.Scanner;
public class SinglyLinkedListMain {



	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        SinglyLinkedList list1 = new SinglyLinkedList();
	        SinglyLinkedList list2 = new SinglyLinkedList();

	        System.out.println("Enter elements for the first sorted linked list (end with -1):");
	        while (true) {
	            int value = scanner.nextInt();
	            if (value == -1) break;
	            list1.addSorted(value);
	        }

	        System.out.println("Enter elements for the second sorted linked list (end with -1):");
	        while (true) {
	            int value = scanner.nextInt();
	            if (value == -1) break;
	            list2.addSorted(value);
	        }

	        SinglyLinkedList unionList = UnionFinder.findUnion(list1, list2);

	        System.out.print("Union of the two linked lists: ");
	        unionList.display();

	        scanner.close();
	    }
	}
