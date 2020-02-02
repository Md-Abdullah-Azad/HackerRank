class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static int height(Node root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }

    }
}
