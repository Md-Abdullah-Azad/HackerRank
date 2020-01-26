// Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {

        int len = 0;
        SinglyLinkedListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            len++;
        }

        if(positionFromTail > len) return 0;

        temp = head;
        for (int i = 1; i < len - positionFromTail; i++){
            temp = temp.next; 
        }
        return temp.data; 

    }

