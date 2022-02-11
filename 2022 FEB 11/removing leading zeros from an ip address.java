// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String S)
    {
        // your code here
        return S.replaceAll("\\b0+(\\d+)", "$1");
    }
}
