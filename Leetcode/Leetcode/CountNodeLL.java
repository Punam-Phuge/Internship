// Node class to represent a node in the linked list
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to represent the linked list
class LinkedList {
    Node head;

    // Function to add a new node at the end of the linked list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Function to get the length of the linked list
    public int getCount() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}

// Driver code
public class CountNodeLL {
    public static void main(String[] args) {
        // Example 1
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        System.out.println("Output 1: " + list1.getCount());

        // Example 2
        LinkedList list2 = new LinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);
        list2.append(7);
        list2.append(5);
        list2.append(1);
        list2.append(0);
        System.out.println("Output 2: " + list2.getCount());
    }
}


