#include <bits/stdc++.h>
using namespace std;

struct Node {
	int data;
	struct Node* left, *right;
};

struct Node* newNode(int data)
{
	struct Node* node = (struct Node*)malloc(sizeof(struct Node));
	node->data = data;
	node->left = node->right = NULL;
	return node;
}

void printAncestors(struct Node* root, int key)
{
	if (root == NULL)
		return;

	stack<struct Node*> st;

	while (1) {

		while (root && root->data != key) {
			st.push(root); 
			root = root->left; 
		}

		if (root && root->data == key)
			break;

		if (st.top()->right == NULL) {
			root = st.top();
			st.pop();

			while (!st.empty() && st.top()->right == root) {
				root = st.top();
				st.pop();
			}
		}

		root = st.empty() ? NULL : st.top()->right;
	}

	while (!st.empty()) {
		cout << st.top()->data << " ";
		st.pop();
	}
}

int main()
{
	// Let us construct a binary tree
	struct Node* root = newNode(10);
	root->left = newNode(20);
	root->right = newNode(30);
	root->left->left = newNode(40);
	root->left->right = newNode(50);
	root->right->left = newNode(60);
	root->right->right = newNode(70);
	root->left->right->left = newNode(80);
	root->right->left->left = newNode(90);

    
	int key = 80;
	printAncestors(root, key);

	return 0;
}
