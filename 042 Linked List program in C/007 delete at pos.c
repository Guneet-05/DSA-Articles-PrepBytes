# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

void delete_pos()
{
	int pos;
	printf("Enter node position to delete: ");
	scanf("%d",&pos);     
	struct node* ptr=head;                                                                               
	if(head==NULL) 
	{
		printf("Linked List is empty \n"); 
		return;
	}
	else if(pos == 0) 
	{
		ptr = head;
		head=ptr->next;
		free(ptr); 
	}
	else
	{
		struct node* prev_ptr;
		for(int i=0;i<pos;i++)
		{
			prev_ptr = ptr;
			ptr = ptr->next;
		}
		prev_ptr->next = ptr->next; 
		free(ptr); 
	}
}
int main(){
   
}
