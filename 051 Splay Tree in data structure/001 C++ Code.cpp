#include <bits/stdc++.h>
using namespace std;

class node
{
public:
    int key;
    node *left, *right;
};

node *TreeNode(int key)
{
    node *Node = new node();
    Node->key = key;
    Node->left = Node->right = NULL;
    return (Node);
}

node *rightRotate(node *x)
{
    node *y = x->left;
    x->left = y->right;
    y->right = x;
    return y;
}

node *leftRotate(node *x)
{
    node *y = x->right;
    x->right = y->left;
    y->left = x;
    return y;
}
node *splay(node *root, int key)
{
    if (root == NULL || root->key == key)
        return root;

    if (root->key > key)
    {
        if (root->left == NULL)
            return root;

        // Zig-Zig Rotation
        if (root->left->key > key)
        {
            root->left->left = splay(root->left->left, key);
            root = rightRotate(root);
        }
        else if (root->left->key < key) // Zig-Zag 
        {
            root->left->right = splay(root->left->right, key);
            if (root->left->right != NULL)
                root->left = leftRotate(root->left);
        }

        return (root->left == NULL) ? root : rightRotate(root);
    }
    else
    {
        if (root->right == NULL)
            return root;

        // Zag-Zig Rotation
        if (root->right->key > key)
        {
            root->right->left = splay(root->right->left, key);

            if (root->right->left != NULL)
                root->right = rightRotate(root->right);
        }
        else if (root->right->key < key)
        {
            root->right->right = splay(root->right->right, key);
            root = leftRotate(root);
        }

        return (root->right == NULL) ? root : leftRotate(root);
    }
}

node *bstSearch(node *root, int key)
{
    return splay(root, key);
}

void preOrder(node *root)
{
    if (root != NULL)
    {
        cout << root->key << " ";
        preOrder(root->left);
        preOrder(root->right);
    }
}

int main()
{
    node *root = TreeNode(100);
    root->left = TreeNode(50);
    root->right = TreeNode(200);
    root->left->left = TreeNode(40);
    root->left->left->left = TreeNode(30);
    root->left->left->left->left = TreeNode(20);

    root = bstSearch(root, 20);
    preOrder(root);
    return 0;
}
