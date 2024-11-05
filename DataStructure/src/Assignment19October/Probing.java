package Assignment19October;




public class Probing {
    private int capacity = 10;
    private Node[] buckets;

    public Probing() {
        buckets = new Node[capacity];
    }

    private class Node {
        int key;
        String value;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private int computeHash(int key) {
        return key % capacity;
    }

    public void put(int key, String value) {
        int index = computeHash(key);
        int originalIndex = index;

        while (buckets[index] != null) {
            if (buckets[index].key == key) {
                buckets[index].value = value;
                return;
            }
            index = (index + 1) % capacity;
            if (index == originalIndex) {
                return;
            }
        }

        buckets[index] = new Node(key, value);
    }

    public String fetch(int key) {
        int index = computeHash(key);
        int originalIndex = index;

        while (buckets[index] != null) {
            if (buckets[index].key == key) {
                return buckets[index].value;
            }
            index = (index + 1) % capacity;
            if (index == originalIndex) {
                break;
            }
        }

        return null;
    }

    public void showTable() {
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                System.out.println("Index " + i + ": " + buckets[i].key + " -> " + buckets[i].value);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }

    public static void main(String[] args) {
    	Probing table = new Probing();
        table.put(10, "First");
        table.put(20, "Second");
        table.put(30, "Third");
        table.put(40, "Fourth");
        table.put(11, "Fifth");

        System.out.println("Value for key 10: " + table.fetch(10));
        System.out.println("Value for key 20: " + table.fetch(20));
        System.out.println("Value for key 30: " + table.fetch(30));

        table.showTable();
    }
}
