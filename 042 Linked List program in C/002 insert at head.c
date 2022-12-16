# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

// to insert node at start of LinkedList
void insert_begin()
{
	struct node* newNode;
	newNode = (struct node*)malloc(sizeof(struct node));
	printf("Enter node data: ");
	scanf("%d",&newNode->data);
	newNode->next = NULL;
	if(head==NULL)
	{
		head = newNode;
		return;
	}
	else
	{
		newNode->next = head; 
		head = newNode; 
	}
}

int main(){
   
}
