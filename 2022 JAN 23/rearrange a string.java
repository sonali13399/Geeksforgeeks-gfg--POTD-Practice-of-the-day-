// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
              int sum = 0;
           String str = new String();
           str = "";
           for(int i=0;i<s.length();i++){
               if(Character.isDigit(s.charAt(i))){
                   sum += Character.getNumericValue(s.charAt(i));
               }
               else{
                   str += s.charAt(i);
               }
           }
           
           char arr[] = str.toCharArray();
           Arrays.sort(arr);
           
           return new String(arr)+ String.valueOf(sum);
        }
}
