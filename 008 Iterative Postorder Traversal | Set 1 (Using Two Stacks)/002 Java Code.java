import java.util.*;
public class Main {

	static class node {
		int data;
		node left, right;

		public node(int data)
		{
			this.data = data;
		}
	}

	static Stack<node> s1, s2;

	static void postOrderIterative(node root)
	{
		s1 = new Stack<>();
		s2 = new Stack<>();

		if (root == null)
			return;

		// push root to first stack
		s1.push(root);

		while (!s1.isEmpty()) {
			// Pop an item from stack 1 and push it to stack 2
			node temp = s1.pop();
			s2.push(temp);

            //add children of current node to stack 1
			if (temp.left != null)
				s1.push(temp.left);
			if (temp.right != null)
				s1.push(temp.right);
		}

		// Print all elements of second stack -> this is the postorder traversal
		while (!s2.isEmpty()) {
			node temp = s2.pop();
			System.out.print(temp.data + " ");
		}
	}

	public static void main(String[] args)
	{   
	    //tree that we have been discussing so far
		node root = null;
		root = new node(1);
		root.left = new node(2);
		root.right = new node(3);
		root.left.left = new node(4);
		root.left.right = new node(5);
		root.right.left = new node(6);
		root.right.right = new node(7);
		root.left.right.left = new node(8);
        root.right.left.right = new node(9);
		

		postOrderIterative(root);
	}
}

// This code is contributed by Rishabh Mahrsee
