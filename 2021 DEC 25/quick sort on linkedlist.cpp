// { Driver Code Starts
#include <iostream>
#include <cstdio>
using namespace std;
 
/* a node of the singly linked list */
struct node
{
    int data;
    struct node *next;
    
    node(int x){
        data = x;
        next = NULL;
    }
};

/* A utility function to insert a node at the beginning of linked list */
void push(struct node** head_ref, int new_data)
{
    /* allocate node */
    struct node* new_node = new node(new_data);
 
    /* link the old list off the new node */
    new_node->next = (*head_ref);
 
    /* move the head to point to the new node */
    (*head_ref)    = new_node;
}
 
/* A utility function to print linked list */
void printList(struct node *node)
{
    while (node != NULL)
    {
        printf("%d ", node->data);
        node = node->next;
    }
    printf("\n");
}
void quickSort(struct node **headRef);
int main()
{
	int t,n,x;
	cin>>t;
	while(t--){
		
        
        cin>>n;n=n-1;
		cin>>x;
        node *temp,*head = new node(x);
        temp=head;
        while(n--)
        {
			cin>>x;
          temp->next=new node(x);
          temp=temp->next;
			}
    
    quickSort(&head);
 
    printList(head);
 while(head!= NULL){
     temp=head;
     head=head->next;
     free(temp);
     
 }
	}
    return 0;
}// } Driver Code Ends


 
/* a node of the singly linked list 
struct node
{
    int data;
    struct node *next;
    
    node(int x){
        data = x;
        next = NULL;
    }
}; */
struct node *quick(struct node *head){
if(head->next == NULL){
struct node *curr;
curr = head;

return (curr);
}
struct node *curr = quick(head->next);
struct node *temp = curr;
while(temp->next!=NULL){
temp=temp->next;
}
if(head->data > curr->data){
temp->next=head;
head->next=NULL;
return (curr);
}
else{
struct node *ptr = head;
ptr->next=curr;
curr = ptr;
return (ptr);
}
}
//you have to complete this function
void quickSort(struct node **headRef) {
    struct node *head = *headRef;
struct node *temp = head, *curr;
int c=0;
while(temp!=NULL){
c++;
temp=temp->next;
}
curr = quick(head);
while(c--){
curr=quick(curr);
}
*headRef = curr;
}
