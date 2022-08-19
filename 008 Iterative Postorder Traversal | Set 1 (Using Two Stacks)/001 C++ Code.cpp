#include <bits/stdc++.h>
using namespace std;

//tree node 
struct Node {

	int data;
	Node *left, *right;
};


Node* newNode(int data)
{
	Node* node = new Node;
	node->data = data;
	node->left = node->right = NULL;
	return node;
}

void post_order_iterative(Node* root)
{
	if (root == NULL)
		return;
		
	stack<Node *> s1, s2;

	
	s1.push(root);
	Node* node;

	
	while (!s1.empty()) {
		
		//pop from stack 1 and add the elemnt to stack 2
		node = s1.top();
		s1.pop();
		s2.push(node);

		//add children to stack 1
		if (node->left)
			s1.push(node->left);
		if (node->right)
			s1.push(node->right);
	}

	// Print all elements of second stack -> this is postorder traversal
	while (!s2.empty()) {
		node = s2.top();
		s2.pop();
		cout << node->data << " ";
	}
}

int main()
{
	//The tree that we have been discussing so far
	Node* root = NULL;
	root = newNode(1);
	root->left = newNode(2);
	root->right = newNode(3);
	root->left->left = newNode(4);
	root->left->right = newNode(5);
	root->right->left = newNode(6);
	root->right->right = newNode(7);
    root->left->right->left = newNode(8);
    root->right->left->right = newNode(9);

	post_order_iterative(root);

	return 0;
}
