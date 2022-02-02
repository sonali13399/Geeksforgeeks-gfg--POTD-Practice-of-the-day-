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

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        List<Integer> bin=new ArrayList<>();
       int res=0; int count=0;
       while(N!=0){
           bin.add(N%2);
           N /= 2;
       }
       
       if(bin.contains(1)) {
           for(int i:bin) {
               if(i==1) count++;
           }
           
           if(count==1) {
               res=bin.indexOf(1) + 1;
               return res;
           }
       }
       res=-1;
       return res;
    }
};
