// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.Smallestonleft(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}


// } Driver Code Ends


//User function Template for Java



class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] Smallestonleft (int arr[], int n) {
        // Complete the function
        int res[] = new int[n];
         res[0]= -1;
         TreeSet<Integer> set = new TreeSet<Integer>();
         set.add(arr[0]);
         for(int i=0;i<n;i++){
             
             if(set.floor(arr[i]-1) != null){
                 res[i] = set.floor(arr[i] - 1);
             }
             else{
                 res[i] = -1;
             }
             
             set.add(arr[i]);
         }
        return res;
    }
    
    
}


