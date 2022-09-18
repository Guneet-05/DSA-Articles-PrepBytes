import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    
    Node() {
        data = 0;
        left = right = null;
    }
    
    Node(int data) {
        this.data = data;
        left = right = null;
    }
    
    Node(int data,Node left, Node right) {
        this.data  = data;
        this.left = left;
        this.right = right;
    }
}

public class Main {
    
    public static void preorder(Node root) {
        if(root == null) return;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void inorder(Node root) {
        if(root == null) return;
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    
    public static void postorder(Node root) {
        if(root == null) return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        Node root = new Node(10); // Binary tree with root = 10 
        
        root.left = new Node(20);
        root.right = new Node(30);
        
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        root.left.right.left = new Node(80);
        root.right.left.right = new Node(90);
        
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }
}
