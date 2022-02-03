// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String result="";String rev="";char ch;
    public String excelColumn(int N){
        
        //  Your code here
        String result="";String rev="";char ch;int rem=0;
        while(N >0){
            rem = N%26;
            if(rem==0) rem=26;
            result += (char)(rem+64);
            N = N-rem;
            N =N/26;
        }
        for(int i=0;i<result.length();i++){
            ch= result.charAt(i); //extracts each character
        rev= ch+rev;
        }
        return rev;   
    }
}
