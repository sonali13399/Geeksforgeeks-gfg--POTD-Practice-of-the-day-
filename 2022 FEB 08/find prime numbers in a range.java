// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        // code here
         ArrayList<Integer> ls = new ArrayList<Integer>();

       Boolean b[] = new Boolean[N+2];
       
       Arrays.fill(b,true);
       b[0]=false;
       b[1]=false;
        
       for(int i=0;i<=Math.sqrt(N)+1;i++){
           if(b[i]==false)
           continue;
           int t=i;
           while(true){
           try{     t+=i;
               b[t]=false;}
               catch(Exception e){
                   break;
               }

           }
       }
       for(int i=M;i<=N;i++){
               if(b[i]==true)
               ls.add(i);
           }
       return ls;
   
    }
}
