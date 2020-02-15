import java.util.*;
import java.io.*;

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

class Solution {

	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static Node lca(Node node, int v1, int v2) {
      if (node == null) 
            return null;

        if (node.data > v1 && node.data > v2) 
            return lca(node.left, v1, v2); 
   
        if (node.data < v1 && node.data < v2)  
            return lca(node.right, v1, v2); 
   
        return node; 
    }
}