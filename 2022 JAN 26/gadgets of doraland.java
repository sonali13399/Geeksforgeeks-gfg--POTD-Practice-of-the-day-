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
                    int n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i=0; i<n; i++)
                        {
                            int x = sc.nextInt();
                            arr.add(x);
                        }
                    int k = sc.nextInt();
                    
                    Solution obj = new Solution();
                    res = obj.TopK(arr,k);
                    
                    for(int i=0; i<res.size();i++)
                        {
                            System.out.print(res.get(i) + " ");
                        }
                    System.out.println();    
                    
                        
                }
        }
}// } Driver Code Ends


class Solution
{
    ArrayList<Integer>TopK(ArrayList<Integer> arr, int k)
    {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int x : arr){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        
        List<Pair> p = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            p.add(new Pair(entry.getKey(),entry.getValue()));
        }
        
        Collections.sort(p, new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b){
                if(a.count == b.count)return b.id - a.id;
                
                return b.count - a.count;
            }
        });
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(p.get(i).id);
        }
        return res;
    }
}
class Pair{
    int id;
    int count;
    
    Pair(int _id, int _count){
        id = _id;
        count = _count;
    }
}
