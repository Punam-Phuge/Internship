
class Deletenodell { 
	Node head; // head of list 

	/* Linked list Node*/
	class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Given a key, deletes the first 
	occurrence of key in 
	* linked list */
	void deleteNode(int key) 
	{ 
		// Store head node 
		Node temp = head, prev = null; 

		// If head node itself holds the key to be deleted 
		if (temp != null && temp.data == key) { 
			head = temp.next; // Changed head 
			return; 
		} 

		// Search for the key to be deleted, keep track of 
		// the previous node as we need to change temp.next 
		while (temp != null && temp.data != key) { 
			prev = temp; 
			temp = temp.next; 
		} 

		// If key was not present in linked list 
		if (temp == null) 
			return; 

		// Unlink the node from linked list 
		prev.next = temp.next; 
	} 

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		new_node.next = head; 
		head = new_node; 
	} 

	/* This function prints contents of linked list starting 
	from the given node */
	public void printList() 
	{ 
		Node tnode = head; 
		while (tnode != null) { 
			System.out.print(tnode.data + " "); 
			tnode = tnode.next; 
		} 
	} 

	/* main class */
	public static void main(String[] args) 
	{ 
		Deletenodell llist = new Deletenodell(); 
        Deletenodell llist1 = new Deletenodell(); 
////case1
		llist.push(9); 
		llist.push(1); 
		llist.push(5); 
		llist.push(4); 

		System.out.println(" Created Linked list is:"); 
		llist.printList(); 

		llist.deleteNode(5); // Delete node with data 5

		System.out.println( " Linked List after Deletion of 5:"); 
		llist.printList(); 

/////case2
System.out.println( " Linked List for deleting node 1:"); 
        llist1.push(9); 
		llist1.push(1); 
		llist1.push(5); 
		llist1.push(4); 

		System.out.println(" Created Linked list is:"); 
		llist1.printList(); 

		llist1.deleteNode(1); // Delete node with data 1

		System.out.println( " Linked List after Deletion of 1:"); 
		llist1.printList(); 
	} 
}

