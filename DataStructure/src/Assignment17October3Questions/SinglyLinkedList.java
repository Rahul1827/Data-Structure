package Assignment17October3Questions;

class SinglyLinkedList {
    private ListNode head;

    public void addSorted(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null || head.value >= value) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null && current.next.value < value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public ListNode getHead() {
        return head;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
