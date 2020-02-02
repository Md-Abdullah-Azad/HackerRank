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

/*
class Node {
    int data;
    Node left;
    Node right;
}

*/

public static void postOrder(Node root) {
    if (root == null) 
        return; 

    postOrder(root.left); 
    postOrder(root.right);
    System.out.print(root.data + " ");
}

}