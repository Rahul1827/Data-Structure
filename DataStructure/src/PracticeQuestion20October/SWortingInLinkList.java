package PracticeQuestion20October;

import LinkedList.Node;

public class SWortingInLinkList {

    Node root;

    void create_list() {
        root = null;
    }

    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
        System.out.println(root.data + " inserted");
    }

    Node mergeTwoSortedLists(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }

        return dummy.next;
    }

    void printList(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	SWortingInLinkList list1 = new SWortingInLinkList();
        list1.create_list();
        list1.insert_left(8);
        list1.insert_left(6);
        list1.insert_left(3);
        list1.insert_left(1);

        System.out.println("First sorted list:");
        list1.printList(list1.root);

        SWortingInLinkList list2 = new SWortingInLinkList();
        list2.create_list();
        list2.insert_left(7);
        list2.insert_left(4);
        list2.insert_left(2);

        System.out.println("Second sorted list:");
        list2.printList(list2.root);

        SWortingInLinkList mergedList = new SWortingInLinkList();
        Node mergedHead = mergedList.mergeTwoSortedLists(list1.root, list2.root);

        System.out.println("Merged sorted list:");
        mergedList.printList(mergedHead);
    }
}
