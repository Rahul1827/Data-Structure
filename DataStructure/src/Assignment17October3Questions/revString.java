package Assignment17October3Questions;

public class revString {


    private char[] elements;
    private int index;
    private int capacity;

    public revString(int size) {
        capacity = size;
        elements = new char[capacity];
        index = -1;
    }

    public void pushCharacter(char character) {
        if (index < capacity - 1) {
            elements[++index] = character;
        } else {
            System.out.println("Stack overflow. Unable to push: " + character);
        }
    }

    public char popCharacter() {
        if (index >= 0) {
            return elements[index--];
        } else {
            System.out.println("Stack underflow. Unable to pop.");
            return '\0';
        }
    }

    public boolean isStackEmpty() {
        return index == -1;
    }
}
