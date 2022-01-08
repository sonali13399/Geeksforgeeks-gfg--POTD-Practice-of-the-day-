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
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.increasingNumbers(N);
            for(int num : ans){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> increasingNumbers(int N){
       // code here
       ArrayList<Integer> al = new ArrayList<>();
       if(N==1) al.add(0);
       
       func(1,0,al,N);
       return al;
   }
   static void func(int start, int out,ArrayList<Integer> al,int n ){
       if(n==0){
           al.add(out);
           return;
       }
       
       for(int i=start;i<=9;i++){
           func(i+1,(10*out)+i,al,n-1);
       }
   }
}
