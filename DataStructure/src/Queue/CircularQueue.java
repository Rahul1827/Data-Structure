package Queue;

public class CircularQueue {




    private int[] queue;
    private int maxSize;
    private int front, rear, size;

    public CircularQueue(int size) {
        maxSize = size;
        queue = new int[size];
        front = 0;
       rear = -1;
        size = 0; 
    }

    public void enqueue(int e) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert element: " + e);
            return;
        }
        rear = (rear + 1) % maxSize; 
        queue[rear] = e;
        size++;
        System.out.println("Element " + e + " inserted into queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int temp = queue[front];
        front = (front + 1) % maxSize;
        size--;
        return temp;
    }

    public boolean isFull() {
        return size == maxSize;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; 
        }
        return queue[front];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Queue contains:");
        for (int i = 0; i < size; i++) {
            System.out.println(queue[(front + i) % maxSize]);
        }
    }
}

