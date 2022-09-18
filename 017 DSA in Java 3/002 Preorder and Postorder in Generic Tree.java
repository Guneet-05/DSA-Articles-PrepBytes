import java.util.*;

class Node {
    int data;
    ArrayList<Node> children;
    
    Node() {
        data = 0;
        children = new ArrayList<>();
    }
    
    Node(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class Main {
    
    public static void preorder(Node root) {
        System.out.print(root.data + " ");
        
        for(Node child : root.children) {
            preorder(child);
        }
    }
    
    public static void postorder(Node root) {
        for(Node child : root.children) {
            postorder(child);
        }
        
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        Node root = new Node(10); //a generic tree with root = 10
        root.children.add(new Node(20));
        root.children.add(new Node(30));
        root.children.add(new Node(40));
        
        root.children.get(0).children.add(new Node(50));
        root.children.get(0).children.add(new Node(60));
        
        root.children.get(1).children.add(new Node(70));
        
        root.children.get(2).children.add(new Node(80));
        root.children.get(2).children.add(new Node(90));
        
        root.children.get(1).children.get(0).children.add(new Node(110));
        root.children.get(1).children.get(0).children.add(new Node(120));
        root.children.get(1).children.get(0).children.add(new Node(130));
        
        preorder(root);
        System.out.println();
        postorder(root);
    }
}
