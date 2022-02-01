// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int INF = 1000000007;
   
   static class Pair implements Comparable<Pair>{
       int v1, weight;
       Pair(int v1, int weight){
           this.v1 = v1;
           this.weight = weight;
       }
       @Override
       public int compareTo(Pair o) {
           return this.weight-o.weight;
       }
   }
   
   static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> list, int s)
   {
       
       PriorityQueue<Pair> queue = new PriorityQueue<>();
       boolean isVisited[] = new boolean[v];
       int distance[] = new int[v];
       int ans[] = new int[v];
       queue.add(new Pair(s, 0));
       Arrays.fill(distance, INF);

       while(!queue.isEmpty()){

           Pair cur = queue.remove();
           if(isVisited[cur.v1]) continue;

           isVisited[cur.v1] = true;
           ans[cur.v1] = cur.weight;

           for(ArrayList<Integer> i : list.get(cur.v1)){
               int end = i.get(0);
               int w = i.get(1);
               if(!isVisited[end]){
                   queue.add(new Pair(end, w+cur.weight));
               }
           }
       }
       
       return ans;
    }
}
