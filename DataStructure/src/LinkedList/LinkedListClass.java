package LinkedList;

public class LinkedListClass {

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

    void delete_left() {
        if (root == null) {
            System.out.println("Empty List");
        } else {
            Node t = root;
            root = root.next;
            System.out.println(t.data + " deleted");
        }
    }

    void insert_right(int data) {
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
        System.out.println(root.data + " inserted");
    }

    void delete_right() {
        if (root == null)
            System.out.println("Empty List");
        else {
            Node t, t2;
            t = t2 = root;
            while (t.next != null) {
                t2 = t;
                t = t.next;
            }
            if (t == root)
                root = null;
            else
                t2.next = null;
            System.out.println(t.data + " deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            System.out.println("null");
        }
    }

    void search_list(int data) {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                if (t.data == data) {
                    System.out.println(t.data + " found in list");
                    break;
                }
                t = t.next;
            }
            if (t == null)
                System.out.println(data + " not found in list");
        }
    }

    void delete_element(int data) {
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t, t2;
            t2 = t = root;
            while (t != null) {
                if (t.data == data) {
                    System.out.println(t.data + " found in list");
                    if (t == root)
                        root = root.next;
                    else if (t.next == null)
                        t2.next = null;
                    else
                        t2.next = t.next;
                    System.out.println(t.data + " deleted");
                    break;
                }
                t2 = t;
                t = t.next;
            }
            if (t == null)
                System.out.println(data + " not found in list");
        }
    }

    void insert_after(int key, int new_data) {
        Node n = new Node(new_data);
        if (root == null)
            System.out.println("List Empty");
        else {
            Node t = root;
            while (t != null) {
                if (t.data == key) {
                    n.next = t.next;
                    t.next = n;
                    System.out.println(new_data + " inserted in list");
                    break;
                }
                t = t.next;
            }
            if (t == null)
                System.out.println(key + " not found in list");
        }
    }

    void insert_before(int key, int new_data) {
        Node n = new Node(new_data);
        if (root == null) {
            System.out.println("List Empty");
            return;
        }

        if (root.data == key) {
            n.next = root;
            root = n;
            System.out.println(new_data + " inserted before " + key);
            return;
        }

        Node t = root;
        while (t.next != null) {
            if (t.next.data == key) {
                n.next = t.next;
                t.next = n;
                System.out.println(new_data + " inserted before " + key);
                return;
            }
            t = t.next;
        }

        System.out.println(key + " not found in list");
    }
}
