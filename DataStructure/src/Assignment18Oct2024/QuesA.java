//A) Write menu driven program  for Binary Search Tree. The menu includes 
//-	Create a Binary Search Tree
//-	Traverse it by using Preorder and Post order traversing technique


package Assignment18Oct2024;
import java.util.Scanner;

public class QuesA {
    private Node root;

    void create_Tree() {
        root = null;
    }

    void insert(Node r, Node n) { // insert in BST manner
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data) { // if less go left
                if (r.left == null) { // empty left
                    r.left = n;
                    System.out.println(n.data + " inserted");
                } else {
                    insert(r.left, n); // recursion call
                }
            } else { // if equal or greater go right
                if (r.right == null) { // empty right
                    r.right = n;
                    System.out.println(n.data + " inserted");
                } else {
                    insert(r.right, n); // recursion call
                }
            }
        }
    }

    void inorder(Node r) {
        if (r != null) { // LPR
            inorder(r.left); // L
            System.out.print(r.data + ", "); // P
            inorder(r.right); // R
        }
    }

    void preorder(Node r) {
        if (r != null) { // PLR
            System.out.print(r.data + ", "); // P
            preorder(r.left); // L
            preorder(r.right); // R
        }
    }

    void postorder(Node r) {
        if (r != null) { // LRP
            postorder(r.left); // L
            postorder(r.right); // R
            System.out.print(r.data + ", "); // P
        }
    }

    public static void main(String args[]) {
        QuesA obj = new QuesA();
        Scanner sc = new Scanner(System.in);
        obj.create_Tree();

        while (true) {
            System.out.println("\nWelcome to Tree Operations");
            System.out.println("1. Insert Node");
            System.out.println("2. Preorder Traversal");
            System.out.println("3. Postorder Traversal");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = sc.nextInt();
                    obj.insert(obj.root, new Node(element));
                    break;
                case 2:
                    System.out.println("Preorder Traversal:");
                    obj.preorder(obj.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Postorder Traversal:");
                    obj.postorder(obj.root);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Inorder Traversal:");
                    obj.inorder(obj.root);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

	