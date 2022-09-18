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
    public static void main(String[] args) {
        Node root = new Node(1); //a generic tree with root = 1
    }
}
