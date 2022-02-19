// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int rowLen = grid.length;
        int colLen = grid[0].length;
        
        boolean visited[][] = new boolean[rowLen][colLen];
        int count = 0;
        for(int i=0; i< rowLen; i++)
        {
            for(int j=0; j<colLen; j++)
            {
                if(!visited[i][j] && grid[i][j] == '1')
                {
                    count++;
                    NavigateIsland(i,j, grid, visited, rowLen, colLen);
                }
            }
        }
        
        return count;
    }
    public void NavigateIsland(int i, int j, char[][] grid, boolean[][] visited, int rowLen, int colLen)
    {
        visited[i][j] = true;
        
        int jPointer[] = { -1, 0, 1, -1, 1, -1, 0, 1};
        int iPointer[] = { -1, -1, -1, 0, 0, 1, 1, 1};
        
        for(int k=0; k < 8 ; k++)
        {
            int pi = (i + iPointer[k]);
            int pj = (j + jPointer[k]);
            
            if(isValidIsLandLocation(pi, pj, grid, visited, rowLen, colLen))
            {
                NavigateIsland(pi, pj, grid, visited, rowLen, colLen);
            }
        }
    }
    
    
    public boolean isValidIsLandLocation(int i, int j, char grid[][], boolean visited[][], int rowLen, int colLen)
    {
        return ((i < rowLen && i >= 0) && (j < colLen && j >= 0) && (!visited[i][j]) && (grid[i][j] == '1'));
    }

}
