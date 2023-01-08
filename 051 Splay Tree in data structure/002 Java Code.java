class Tree
{
static class node
{

	int key;
	node left, right;
};

static node TreeNode(int key)
{
	node Node = new node();
	Node.key = key;
	Node.left = Node.right = null;
	return (Node);
}

static node rightRotate(node x)
{
	node y = x.left;
	x.left = y.right;
	y.right = x;
	return y;
}

static node leftRotate(node x)
{
	node y = x.right;
	x.right = y.left;
	y.left = x;
	return y;
}

static node splay(node root, int key)
{
    if (root == null || root.key == key)
		return root;

    if (root.key > key)
	{
		if (root.left == null) return root;

        if (root.left.key > key)
		{
            root.left.left = splay(root.left.left, key);

            root = rightRotate(root);
		}
		// Zig-Zag 
		else if (root.left.key < key) 
		{
        	root.left.right = splay(root.left.right, key);

        	if (root.left.right != null)
				root.left = leftRotate(root.left);
		}

        return (root.left == null) ? root : rightRotate(root);
	}
	else 
	{
		if (root.right == null) return root;

		if (root.right.key > key)
		{
            root.right.left = splay(root.right.left, key);

            if (root.right.left != null)
				root.right = rightRotate(root.right);
		}
		// Zag-Zag 
		else if (root.right.key < key)
		{
         	root.right.right = splay(root.right.right, key);
			root = leftRotate(root);
		}
		return (root.right == null) ? root : leftRotate(root);
	}
}


static node bstSearch(node root, int key)
{
	return splay(root, key);
}

static void preOrder(node root)
{
	if (root != null)
	{
		System.out.print(root.key + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
}
}

public class Main {
    
    public static void main(String[] args)
    {
        Tree.node root = Tree.TreeNode(100);
        root.left = Tree.TreeNode(50);
        root.right = Tree.TreeNode(200);
        root.left.left = Tree.TreeNode(40);
        root.left.left.left = Tree.TreeNode(30);
        root.left.left.left.left = Tree.TreeNode(20);
    
        root = Tree.bstSearch(root, 20);
        Tree.preOrder(root);
    }
}
