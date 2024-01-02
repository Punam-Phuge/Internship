
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

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

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

    // Function to find the middle of the linked list
    public int getMiddle() {
        if (head == null) {
            return -1; // Return -1 if the list is empty
        }

        Node slow = head;
        Node fast = head;

        // Move slow one step and fast two steps
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }
}

// Driver code
public class ElementMiddle {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        System.out.println("Middle of linked list 1: " + list1.getMiddle());

        LinkedList list2 = new LinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);
        list2.append(7);
        list2.append(5);
        list2.append(1);
        System.out.println("Middle of linked list 2: " + list2.getMiddle());
    }
}


