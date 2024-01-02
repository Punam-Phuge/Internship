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

    // Function to detect loop in the linked list
    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If there is a loop, the slow and fast pointers will meet
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}

// Driver code
public class LoopInLL {
    public static void main(String[] args) {
        // Example 1
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(4);
        // Create a loop in the linked list
        list1.head.next.next.next = list1.head.next;
        System.out.println("Output 1: " + list1.detectLoop());

        // Example 2
        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(8);
        list2.append(3);
        list2.append(4);
        System.out.println("Output 2: " + list2.detectLoop());
    }
}

    

