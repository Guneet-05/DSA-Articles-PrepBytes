# include <stdio.h>
# include <stdlib.h>

// Node structure of a Linked List
struct Node
{
	int data;
	struct Node* next;
};

void display()
{
	if(head==NULL)
	{
		printf("Linked List is Empty\n");
		return;
	}
        printf("LinkedList: ");
	struct node* ptr = head;
	while(ptr!=NULL)
	{
		printf("%d ",ptr->data);
		ptr = ptr->next;
	}
    printf("\n");
}
int main(){
   
}
