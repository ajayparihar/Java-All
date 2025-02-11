public class AddTwoNumbers_Linked_List {
    public static void main(String[] args) {
        // Create first number: 2 -> 4 -> 3 (represents 342)
        LinkedListHelper.ListNode l1 = new LinkedListHelper.ListNode(2);
        l1.next = new LinkedListHelper.ListNode(4);
        l1.next.next = new LinkedListHelper.ListNode(3);

        // Create second number: 5 -> 6 -> 4 (represents 465)
        LinkedListHelper.ListNode l2 = new LinkedListHelper.ListNode(5);
        l2.next = new LinkedListHelper.ListNode(6);
        l2.next.next = new LinkedListHelper.ListNode(4);

        // Add the two numbers represented by l1 and l2
        LinkedListHelper.ListNode result = addTwoNumbers(l1, l2);

        // Print the result: should output 7 -> 0 -> 8 (represents 807)
        LinkedListHelper.printList(result);
    }

    /**
     * Adds two numbers represented by linked lists, where each node contains a single digit
     * @param l1 First number represented as a linked list
     * @param l2 Second number represented as a linked list
     * @return Sum of the two numbers as a linked list
     * Time Complexity: O(max(n,m)) where n and m are lengths of input lists
     * Space Complexity: O(max(n,m)) for storing the result linked list
     */
    public static LinkedListHelper.ListNode addTwoNumbers(LinkedListHelper.ListNode l1, LinkedListHelper.ListNode l2) {
        LinkedListHelper.ListNode dummyHead = new LinkedListHelper.ListNode(0); // Dummy node to simplify result list handling
        LinkedListHelper.ListNode current = dummyHead; // Current pointer for result list
        int carry = 0; // Initialize carry for sum calculation

        // Loop until all nodes are processed and carry is 0
        while (l1 != null || l2 != null || carry != 0) {
            int l1Val = (l1 != null) ? l1.val : 0; // Use 0 if l1 is exhausted
            int l2Val = (l2 != null) ? l2.val : 0; // Use 0 if l2 is exhausted
            int sum = l1Val + l2Val + carry; // Calculate sum with carry

            carry = sum / 10; // Update carry for next iteration
            current.next = new LinkedListHelper.ListNode(sum % 10); // Create new node with current digit
            current = current.next; // Move to next node in result list

            // Advance l1 and l2 pointers if nodes are remaining
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next; // Return the actual result list, skipping dummy head
    }
}
