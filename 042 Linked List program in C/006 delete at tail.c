# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

// to delete last node of LinkedList
void delete_end(Node* head)
{
	if(head==NULL)	{
		printf("Linked List is empty | Nothing to delete \n");
		return;
	}
	else if(head->next==NULL) 
	{
		struct node* ptr = head;
		head = ptr->next;
		free(ptr);
	}
	else
	{
		struct node* ptr = head;
		while(ptr->next->next!=NULL)
		{
			ptr = ptr->next;
		}
		ptr->next = NULL; 
	}	
}
int main(){
   
}
