package Assignment17October3Questions;

class UnionFinder {
    public static SinglyLinkedList findUnion(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList unionList = new SinglyLinkedList();
        ListNode current1 = list1.getHead();
        ListNode current2 = list2.getHead();

        while (current1 != null || current2 != null) {
            if (current1 != null && (current2 == null || current1.value < current2.value)) {
                unionList.addSorted(current1.value);
                current1 = current1.next;
            } else if (current2 != null && (current1 == null || current2.value < current1.value)) {
                unionList.addSorted(current2.value);
                current2 = current2.next;
            } else {
                unionList.addSorted(current1.value);
                current1 = current1.next;
                current2 = current2.next;
            }
        }

        return unionList;
    }
}
