package Assignment17October3Questions;

class LinkedList {
    private Node head;

    public void addDigit(int digit) {
        Node newNode = new Node(digit);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.digit + " ");
            current = current.next;
        }
        System.out.println();
    }
}
