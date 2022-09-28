import java.util.*;

public class Main {

	static class Node {
		int key;
		Node left, right;

		Node(int key)
		{
			this.key = key;
			left = null;
			right = null;
		}
	}
	static Node root;
	static Node temp = root;

	static void inorder(Node temp)
	{
		if (temp == null)
			return;

		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}

	static void insert(Node temp, int key)
	{

		if (temp == null) {
			root = new Node(key);
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(temp);

		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp.left == null) {
				temp.left = new Node(key);
				break;
			}
			else
				q.add(temp.left);

			if (temp.right == null) {
				temp.right = new Node(key);
				break;
			}
			else
				q.add(temp.right);
		}
	}

	public static void main(String args[])
	{
		root = new Node(10);
		root.left = new Node(30);
        root.right = new Node(20);
        root.left.left = new Node(5);
        root.right.left = new Node(100);

		System.out.print(
			"Inorder traversal before insertion:");
		inorder(root);

		int key = 7;
		insert(root, key);

		System.out.print(
			"\nInorder traversal after insertion:");
		inorder(root);
	}
}
