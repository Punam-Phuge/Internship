class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class LinkedLIstsort0s {
    
    static Node sortLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one node, it's already sorted
        }

        // Initialize three dummy nodes for each value
        Node zeroDummy = new Node(0);
        Node oneDummy = new Node(0);
        Node twoDummy = new Node(0);

        Node zeroTail = zeroDummy, oneTail = oneDummy, twoTail = twoDummy;
        Node current = head;

        // Traverse the original list and segregate nodes based on their values
        while (current != null) {
            if (current.data == 0) {
                zeroTail.next = current;
                zeroTail = zeroTail.next;
            } else if (current.data == 1) {
                oneTail.next = current;
                oneTail = oneTail.next;
            } else {
                twoTail.next = current;
                twoTail = twoTail.next;
            }
            current = current.next;
        }

        // Connect the tails of zero and one lists to the head of two list
        zeroTail.next = oneDummy.next;
        oneTail.next = twoDummy.next;

        // Connect the tail of two list to null to terminate the list
        twoTail.next = null;

        // Return the head of the zero list (the starting point of sorted list)
        return zeroDummy.next;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(2);
        head1.next.next.next = new Node(1);
        head1.next.next.next.next = new Node(2);
        head1.next.next.next.next.next = new Node(0);
        head1.next.next.next.next.next.next = new Node(2);
        head1.next.next.next.next.next.next.next = new Node(2);

        System.out.println("Original Linked List:");
        printLinkedList(head1);

        Node sortedHead1 = sortLinkedList(head1);
        System.out.println("\nSorted Linked List:");
        printLinkedList(sortedHead1);

        Node head2 = new Node(2);
        head2.next = new Node(2);
        head2.next.next = new Node(0);
        head2.next.next.next = new Node(1);

        System.out.println("\nOriginal Linked List:");
        printLinkedList(head2);

        Node sortedHead2 = sortLinkedList(head2);
        System.out.println("\nSorted Linked List:");
        printLinkedList(sortedHead2);
    }
}
