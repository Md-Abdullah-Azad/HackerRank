// Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {

        SinglyLinkedListNode slowPointer = head, fastPointer = head; 
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) { 
            slowPointer = slowPointer.next; 
            fastPointer = fastPointer.next.next; 
            if (slowPointer == fastPointer) {
                return true; 
            } 
        } 
        return false; 

    }

