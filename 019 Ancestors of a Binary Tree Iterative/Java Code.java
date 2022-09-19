import java.util.*;

class Main
{
static class Node
{
	int data;
	Node left, right;
}

static Node newNode(int data)
{
	Node node = new Node();
	node.data = data;
	node.left = null;
	node.right = null;
	return node;
}

static void printAncestors(Node root, int key)
{
	if (root == null)
		return;

	Stack<Node> st = new Stack<Node> ();

	while (1 == 1)
	{

		while (root != null && root.data != key)
		{
			st.push(root);
			root = root.left;
		}

		if (root != null && root.data == key)
			break;

		if (st.peek().right == null)
		{
			root = st.peek();
			st.pop();

			while (!st.isEmpty() && st.peek().right == root)
			{
				root = st.peek();
				st.pop();
			}
		}

		root = st.isEmpty() ? null : st.peek().right;
	}

	while (!st.isEmpty())
	{
		System.out.print(st.peek().data + " ");
		st.pop();
	}
}

public static void main(String[] args)
{
	Node root = newNode(10);
	root.left = newNode(20);
	root.right = newNode(30);
	root.left.left = newNode(40);
	root.left.right = newNode(50);
	root.right.left = newNode(60);
	root.right.right = newNode(70);
	root.left.right.left = newNode(80);
	root.right.left.right = newNode(90);

	int key = 80;
	printAncestors(root, key);
}
}
