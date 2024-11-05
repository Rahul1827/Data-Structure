//package Assignment18Oct2024;
//
//import java.util.Scanner;
//
////class Node {
////    int data;
////    Node next;
////
////    Node(int data) {
////        this.data = data;
////        this.next = null;
////    }
////}
//
//public class QuesE {
//    private Node head;
//
//    public void add(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newNode;
//        }
//    }
//
//    public void displayAlternateNodes() {
//        Node current = head;
//        boolean displayNode = true;
//
//        while (current != null) {
//            if (displayNode) {
//                System.out.print(current.data + " ");
//            }
//            displayNode = !displayNode;
//            current = current.next;
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        QuesE list = new QuesE();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the number of nodes to add: ");
//        int n = scanner.nextInt();
//
//        System.out.println("Enter " + n + " node values:");
//        for (int i = 0; i < n; i++) {
//            int value = scanner.nextInt();
//            list.add(value);
//        }
//
//        System.out.println("Alternative nodes in the list:");
//        list.displayAlternateNodes();
//
// 
//    }
//}
