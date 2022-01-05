//User function Template for C

// A[]: input array
// N: input array
//Function to sort the binary array.
void binSort(int A[], int N)
{
   //Your code here
   
   /**************
    * No need to print the array
    * ************/
    int zero=0;              // to count the number of zeros
        for(int i=0;i<N;i++)
        zero+=(A[i]==0);         //counting the zeros
        for(int i=0;i<zero;i++)
        A[i]=0;                  //replacing first "zero"(number of zeros) elements to 0
        for(int i=zero;i<N;i++)
        A[i]=1;
}

// { Driver Code Starts.

int main() {
	int T;
	scanf("%d", &T);
	// Input the number of testcases
	while(T--)
	{
	    int N;
	    scanf("%d", &N); //Input size of array N
	    int A[N]; 
	    
	    for(int i = 0; i  < N; i++)
	      scanf("%d", &A[i]);
	      
	    binSort(A,N);
	    
	    for(int i = 0; i  < N; i++)
	        printf("%d ", A[i]);
	      
	    printf("\n");
	}
	return 0;
}  // } Driver Code Ends
