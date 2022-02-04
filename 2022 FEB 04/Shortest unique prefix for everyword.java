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
            
            String arr[] = read.readLine().split(" ");

            Solution ob = new Solution();
            String[] res = ob.findPrefixes(arr,N);
            
            for(int i=0; i<res.length; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String[] findPrefixes(String[] arr, int N) {
        // code here
         String[] ans  = new String[N];
        int j=0;
        boolean flag = false;
        
        for(int i=0;i<N;i++) {
            while(j<arr[i].length()) {
                String s = arr[i].length() > 1 ? arr[i].substring(0,j+1) : arr[i];
                // ans[i] = s;
                for(int k=i+1;k<N;k++) {
                    if(arr[k].indexOf(s) == 0) {
                        if(ans[k] == null || s.length() > ans[k].length())
                            ans[k] = s;
                        flag = true;
                    }
                }
                if(flag == false) {
                    if(ans[i] == null || s.length() > ans[i].length()) {
                       ans[i] = s;
                       break; 
                    }
                    else{
                        j++;
                        continue;
                    }
                        
                }
                else {
                    j++;
                    flag = false;
                }
            }
            j=0;
        }
        return ans;
    }
};
