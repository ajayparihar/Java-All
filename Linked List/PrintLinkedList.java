public class PrintLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}

class Node {
    int data; // The data stored in the node
    Node next; // The reference to the next node

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // The head of the list

    /**
     * Adds a new node with the given data at the end of the linked list
     * @param data The data to be added to the list
     * Time Complexity: O(n) where n is the length of the list, as we need to traverse to the end
     * Space Complexity: O(1) as we only create one new node
     */
    public void add(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, make the new node the head
        } else {
            Node current = head;
            while (current.next != null) { // Traverse to the end of the list
                current = current.next;
            }
            current.next = newNode; // Link the last node to the new node
        }
    }

    // Method to print the linked list

}
