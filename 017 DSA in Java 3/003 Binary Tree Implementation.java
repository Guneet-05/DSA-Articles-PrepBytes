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
    public static void main(String[] args) {
        Node root = new Node(10); // Binary tree with root = 10 
    }
}
