// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        
        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String A = read.readLine().trim();
            
            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution{
    String chooseandswap(String A){
        // Code Here
        char[] a = A.toCharArray();
        
        boolean[] isPresent = new boolean[26];
        boolean[] visited = new boolean[26];
        
        int n = A.length();
        for (char currentChar: a) {
            isPresent[currentChar - 'a'] = true;
        }
        
        for (char currentChar: a) {
            for (int j = 0 ; j < currentChar - 'a' ; j++) {
                if (isPresent[j] && !visited[j]) {
                    return swap(a, currentChar, (char)(j+'a'));
                }
            }
            visited[currentChar - 'a'] = true;
        }
        
        return A;
    }
    
    private String swap(char[] a, char x, char y) {
        for (int i = 0 ; i < a.length ; i++) {
            if (a[i] == x) {
                a[i] = y;
            } else if (a[i] == y) {
                a[i] = x;
            }
        }
        return new String(a);
    }
    
}
