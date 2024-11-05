//B) Write menu driven program  for Binary Search Tree. The menu includes 
//-	Create a Binary Search Tree
//-	Display
//-	Delete a given element from Binary Search Tree

package Assignment18Oct2024;
import java.util.Scanner;



public class QuesB {
    private Node root;

    void createTree() {
        root = null;
    }

    void insert(Node r, Node n) {
        if (root == null) {
            root = n;
        } else {
            if (n.data < r.data) {
                if (r.left == null) {
                    r.left = n;
                    System.out.println(n.data + " inserted");
                } else {
                    insert(r.left, n);
                }
            } else {
                if (r.right == null) {
                    r.right = n;
                    System.out.println(n.data + " inserted");
                } else {
                    insert(r.right, n);
                }
            }
        }
    }

    void inorder(Node r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }

    Node delete(Node root, int key) {
        if (root == null) {
            System.out.println("Element not found");
            return root;
        }

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
           
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

           
            root.data = minValue(root.right);

           
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    public static void main(String args[]) {
        QuesB obj = new QuesB();
        Scanner sc = new Scanner(System.in);
        obj.createTree();

        while (true) {
            System.out.println("\nWelcome to Tree Operations");
            System.out.println("1. Insert Node");
            System.out.println("2. Display Inorder Traversal");
            System.out.println("3. Delete Node");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to insert: ");
                    int element = sc.nextInt();
                    obj.insert(obj.root, new Node(element));
                    break;
                case 2:
                    System.out.println("Inorder Traversal:");
                    obj.inorder(obj.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the element to delete: ");
                    int deleteElement = sc.nextInt();
                    obj.root = obj.delete(obj.root, deleteElement);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
