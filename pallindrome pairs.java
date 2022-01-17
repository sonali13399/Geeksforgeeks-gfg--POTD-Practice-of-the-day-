// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = new String[N];
            
            for(int i=0; i<N; i++)
                arr[i] = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.palindromepair(N,arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
     public static boolean pal(String s,String n){
        StringBuilder in = new StringBuilder(s);
       in.append(n);
        for(int i =0;i<in.length()/2;i++ ) if(in.charAt(i) != in.charAt(in.length()-1-i)) return false;
       return true;
   }
    static int palindromepair(int N, String arr[]) {
        // code here
         for(int i = 0;i<N-1;i++) 
            for(int j = 0;j<N;j++) 
                if(pal(arr[i],arr[j]) && i != j) return 1; 
        return 0;
    }
};
