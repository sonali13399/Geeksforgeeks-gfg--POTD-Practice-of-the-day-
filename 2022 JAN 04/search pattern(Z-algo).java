// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            if(res.size()==0)
                System.out.print("-1 ");
            else {
                for(int i = 0;i<res.size();i++)
                    System.out.print(res.get(i) + " ");
            }
            System.out.println();    
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
        if(pat == "" || S == "") return new ArrayList<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= S.length() - pat.length(); i++) {
            char ch = S.charAt(i);
            char ch2 = pat.charAt(0);
            if(ch == ch2){
                String str = S.substring(i, i + pat.length());
                if(str.equals(pat)) list.add(i + 1);
            }
        }
        return list;
    }
}
