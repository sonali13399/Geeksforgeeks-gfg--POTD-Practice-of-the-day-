// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int FindWays(int n, int m, int[][] bc)
    {
        // Code here
        int k=bc.length;
       int[][] ary=new int[n][m];
 
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
  {
  ary[i][j]=1;
  }
 }
 
 
 for(int i=0;i<k;i++)
 {
 ary[bc[i][0]-1][bc[i][1]-1]=0; 
 }
 
 
 long[][] ary2=new long[n][m];
 for(int i=0;i<n;i++)
 {
  for(int j=0;j<m;j++)
  {
      if(i==0 && j==0)
      {
      ary2[i][j]=ary[i][j]; 
      }
   else if(i==0)
   {
    if(ary[i][j]==1)
     ary2[i][j]=ary2[i][j-1];
   }
   else if(j==0)
   {
    if(ary[i][j]==1)
     ary2[i][j]=ary2[i-1][j];
   }
   else
   {
    if(ary[i][j]==1)
     ary2[i][j]=ary2[i][j-1]+ary2[i-1][j];
   }
  }
 }return (int)ary2[n-1][m-1]%1000000007;
    }
}
