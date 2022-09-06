import java.util.ArrayList;
import java.util.Stack;


class Node {
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right;
	}
}

class BinaryTree {
	Node root;
	ArrayList<Integer> list = new ArrayList<Integer>();

	ArrayList<Integer> postOrderIterative(Node node)
	{
		Stack<Node> stk = new Stack<Node>();

		// Check for empty tree
		if (node == null)
			return list;
        
		stk.push(node);
		Node prev = null;
		while (!stk.isEmpty()) {
			Node current = stk.peek();

			if (prev == null || prev.left == current || prev.right == current) {
				if (current.left != null)
					stk.push(current.left);
				else if (current.right != null)
					stk.push(current.right);
				else {
					stk.pop();
					list.add(current.data);
				}

			}
			else if (current.left == prev) {
				if (current.right != null)
					stk.push(current.right);
				else {
					stk.pop();
					list.add(current.data);
				}

			}
			else if (current.right == prev) {
				stk.pop();
				list.add(current.data);
			}

			prev = current;
		}

		return list;
	}

	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();

		// Let us create trees shown in above diagram
		tree.root = new Node(10);
		tree.root.left = new Node(20);
        tree.root.left.left = new Node(30);
        tree.root.left.left.right = new Node(40);
        tree.root.left.left.right.right = new Node(50);
        tree.root.left.left.right.right.right = new Node(60);
        tree.root.right = new Node(70);
        tree.root.right.left = new Node(80);

		ArrayList<Integer> mylist = tree.postOrderIterative(tree.root);

		System.out.println(
			"Post order traversal of binary tree is :");
		System.out.println(mylist);
	}
}
