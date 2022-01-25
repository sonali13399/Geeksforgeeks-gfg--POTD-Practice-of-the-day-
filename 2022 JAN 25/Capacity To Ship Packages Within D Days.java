// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            int[] arr = new int[N];
            
            int D = Integer.parseInt(read.readLine());
            
            for(int i=0; i<N; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.leastWeightCapacity(arr,N,D));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int leastWeightCapacity(int[] arr, int N, int D) {
        // code here
        int l = 0, r = 0;
        for(int i=0; i<N; i++) {
            l = Math.max(l, arr[i]);
            r += arr[i];
        }
        
        int res = r;
        while(l <= r) {
            int cap = (l+r)/2;
            
            int days = 1, temp = 0;
            for(int i=0; i<N; i++) {
                temp += arr[i];
                if(temp > cap) {
                    temp = arr[i];
                    days++;
                }
            }
            if(days <= D) {
                res = cap;
                r = cap-1;
            }
            else l = cap+1;
        }
        
        return res;
    }
};
