# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

// to insert node at given position
void insert_pos()
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
		struct node* prev_ptr;
		struct node* ptr = head;
		int pos;
		printf("Enter position: ");
		scanf("%d",&pos);
		for(int i=0;i<pos;i++)
		{
			prev_ptr = ptr;
			ptr = ptr->next;
		}
		newNode->next = ptr;
		prev_ptr->next = newNode;
	}
}
int main(){
   
}
