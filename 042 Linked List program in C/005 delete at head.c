# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

void delete_begin()
{ 
	if(head==NULL) 
	{
		printf("Linked List is empty | Nothing to delete \n");
		return;
	}
	else
	{
		struct node* ptr = head; 
		head = head->next; 
		free(ptr); 
		printf("Node Deleted \n");
	}
}
int main(){
   
}
