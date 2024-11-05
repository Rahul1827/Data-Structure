//C) Write a program to read ‘n’ integers and store them in a Binary search tree and display the nodes level wise.

package Assignment18Oct2024;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class QuesC {
    private Node root;

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data) {
            root.left = insertRec(root.left, key);
        } else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void levelOrder() {
        if (root == null) {
            return;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(node.data + " ");

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuesC bst = new QuesC();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers to insert: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            bst.insert(element);
        }

        System.out.println("Level Order Traversal of the BST:");
        bst.levelOrder();

        scanner.close();
    }
}
