package PracticeQuestion20October;


public class Merge_LinkedList {
    Node root;

    void create_list() {
        root = null; // preparing with empty root
    }

    void insert(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n; // n becomes the first element
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
            System.out.println();
        }
    }

    static Merge_LinkedList merge_list(Node r1, Node r2) {
        Node i, j;
        Merge_LinkedList obj3 = new Merge_LinkedList();
        obj3.create_list();
        i = r1;
        j = r2;

        // compare and copy in order
        while (i != null && j != null) {
            if (i.data < j.data) {
                obj3.insert(i.data);
                i = i.next;
            } else {
                obj3.insert(j.data);
                j = j.next;
            }
        }

        // copy leftover
        while (i != null) {
            obj3.insert(i.data);
            i = i.next;
        }

        while (j != null) {
            obj3.insert(j.data);
            j = j.next;
        }

        return obj3;
    }

    public static void main(String[] args) {
    	Merge_LinkedList list1 = new Merge_LinkedList();
        list1.create_list();
        list1.insert(10);
        list1.insert(15);
        list1.insert(20);
        list1.insert(25);
        System.out.println("Sorted list 1");
        list1.print_list();

        Merge_LinkedList list2 = new Merge_LinkedList();
        list2.create_list();
        list2.insert(5);
        list2.insert(12);
        list2.insert(22);
        list2.insert(27);
        System.out.println("Sorted list 2");
        list2.print_list();

        Merge_LinkedList list3 = new Merge_LinkedList();
        list3 = merge_list(list1.root, list2.root);
        System.out.println("Merged list is");
        list3.print_list();
    }
}
