// { Driver Code Starts
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;



/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}


 // } Driver Code Ends
class Solution
{
    public:
    void merge(int arr[], int l, int m, int r)
    {
         // Your code here
         if(l>=r){
            return;
        }
        
        int leftlen = m - l + 1;
        int rightlen = r -m;
        
        int leftarr[leftlen];
        int rightarr[rightlen];
        int k = l;
        
        for(int i=0; i<leftlen; i++){
            leftarr[i] = arr[k];
            k++;
        }
        for(int j=0; j<rightlen; j++){
            rightarr[j] = arr[k];
            k++;
        }
        
        int i=0;
        int j=0;
        k=l;
        
        while(i<leftlen && j<rightlen){
            if(leftarr[i]<=rightarr[j]){
                arr[k] = leftarr[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightarr[j];
                j++;
                k++;
            }
        }
        
        if(i==leftlen){
            while(j<rightlen){
                arr[k] = rightarr[j];
                j++;
                k++;
            }
        }else if(j==rightlen){
            while(i<leftlen){
                arr[k] = leftarr[i];
                i++;
                k++;
            }
        }
        
    }
    public:
    void mergeSort(int arr[], int l, int r)
    {
        //code here
         if(l>=r){
           return;
       }
       
       int m = (l+r)/2;
       
       mergeSort(arr, l, m);
       mergeSort(arr, m+1, r);
       
       merge(arr, l,m,r);
    }
};

// { Driver Code Starts.


int main()
{
    int n,T,i;

    scanf("%d",&T);

    while(T--){
    
    scanf("%d",&n);
    int arr[n+1];
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);

    Solution ob;
    ob.mergeSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}  // } Driver Code Ends
