#include <bits/stdc++.h>
using namespace std;

struct Node {
	int data;
	struct Node *left, *right;
};

struct Node* newNode(int data)
{
	struct Node* node = new Node;
	node->data = data;
	node->left = node->right = NULL;
	return node;
}

vector<int> postOrderIterative(struct Node* root)
{
	vector<int> postOrderList;
	if (root == NULL)
		return postOrderList;

    stack<Node*> stk;
	stk.push(root);
	Node* prev = NULL;
	while (!stk.empty()) {
		auto current = stk.top();
		
        if (prev == NULL || prev->left == current
			|| prev->right == current) {
			if (current->left)
				stk.push(current->left);
			else if (current->right)
				stk.push(current->right);
			else {
				stk.pop();
				postOrderList.push_back(current->data);
			}
		}

		else if (current->left == prev) {
			if (current->right)
				stk.push(current->right);
			else {
				stk.pop();
				postOrderList.push_back(current->data);
			}

					}
		else if (current->right == prev) {
			stk.pop();
			postOrderList.push_back(current->data);
		}
		prev = current;
	}
	return postOrderList;
}

int main()
{
	
	struct Node* root = NULL;
    root = newNode(10);
	  root->left = newNode(20);
    root->left->left = newNode(30);
    root->left->left->right = newNode(40);
    root->left->left->right->right = newNode(50);
    root->left->left->right->right->right = newNode(60);
    root->right = newNode(70);
    root->right->left = newNode(80);
    
	printf("Post order traversal of binary tree is :\n");
	printf("[");
	vector<int> postOrderList = postOrderIterative(root);
	for (auto it : postOrderList)
		cout << it << " ";
	printf("]");
	return 0;
}
