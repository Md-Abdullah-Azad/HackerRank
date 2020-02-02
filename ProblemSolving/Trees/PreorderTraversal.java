class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class PreorderTraversal {

/* 
class Node {
    int data;
    Node left;
    Node right;
}
*/

    public static void preOrder(Node root) {

        if (root == null)  return; 

        System.out.print(root.data + " "); 
        preOrder(root.left); 
        preOrder(root.right); 
    }
}