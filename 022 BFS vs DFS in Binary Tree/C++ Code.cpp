#include <bits/stdc++.h>
using namespace std;

class node {
public:
	int data;
	node *left, *right;
};

void printCurrentLevel(node* root, int level);
int height(node* node);
node* newNode(int data);

void printLevelOrder(node* root)
{
	int h = height(root);
	int i;
	for (i = 1; i <= h; i++)
		printCurrentLevel(root, i);
}

void printCurrentLevel(node* root, int level)
{
	if (root == NULL)
		return;
	if (level == 1)
		cout << root->data << " ";
	else if (level > 1) {
		printCurrentLevel(root->left, level - 1);
		printCurrentLevel(root->right, level - 1);
	}
}

int height(node* node)
{
	if (node == NULL)
		return 0;
	else {
		/* compute the height of each subtree */
		int lheight = height(node->left);
		int rheight = height(node->right);

		/* use the larger one */
		if (lheight > rheight) {
			return (lheight + 1);
		}
		else {
			return (rheight + 1);
		}
	}
}

node* newNode(int data)
{
	node* Node = new node();
	Node->data = data;
	Node->left = NULL;
	Node->right = NULL;

	return (Node);
}

void printInorder(struct node* root)
{
    if (root == NULL)
        return;
 
    /* first recur on left child */
    printInorder(root->left);
 
    /* then print the data of node */
    cout << root->data << " ";
 
    /* now recur on right child */
    printInorder(root->right);
}

void printPreorder(struct node* root)
{
    if (root == NULL)
        return;
 
    /* first print data of node */
    cout << root->data << " ";
 
    /* then recur on left subtree */
    printPreorder(root->left);
 
    /* now recur on right subtree */
    printPreorder(root->right);
}

void printPostorder(struct node* root)
{
    if (root == NULL)
        return;
 
    // first recur on left subtree
    printPostorder(root->left);
 
    // then recur on right subtree
    printPostorder(root->right);
 
    // now deal with the node
    cout << root->data << " ";
}

int main()
{
	node* root = newNode(20);
	root->left = newNode(90);
	root->right = newNode(7);
	root->left->left = newNode(5);
	root->left->right = newNode(50);
    root->right->left = newNode(70);
    root->right->right = newNode(60);

    cout << "Preorder traversal of binary tree is \n";
	printPreorder(root);
    cout << "\nPostorder traversal of binary tree is \n";
	printPostorder(root);
    cout << "\nInorder traversal of binary tree is \n";
	printInorder(root);
	cout << "\nLevel Order traversal of binary tree is \n";
	printLevelOrder(root);

	return 0;
}

