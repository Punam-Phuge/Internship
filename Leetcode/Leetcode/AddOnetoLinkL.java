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

    // Function to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    // Function to add 1 to the number represented by the linked list
    public void addOne() {
        reverse(); // Reverse the linked list for easier addition

        Node current = head;
        int carry = 1;

        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break; // No need to continue if there is no carry left
            }

            current = current.next;
        }

        // If there is still a carry left, add a new node to represent it
        while (carry > 0) {
            Node newNode = new Node(carry % 10);
            current.next = newNode;
            current = newNode;
            carry = carry / 10;
        }

        reverse(); // Reverse the linked list back to its original order
    }

    // Function to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }
}

// Driver code
public class AddOnetoLinkL {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(4);
        list1.append(5);
        list1.append(6);
        System.out.print("Original Linked List 1: ");
        list1.display();
        list1.addOne();
        System.out.print("Modified Linked List 1: ");
        list1.display();

        LinkedList list2 = new LinkedList();
        list2.append(1);
        list2.append(2);
        list2.append(3);
        System.out.print("Original Linked List 2: ");
        list2.display();
        list2.addOne();
        System.out.print("Modified Linked List 2: ");
        list2.display();
    }
}
