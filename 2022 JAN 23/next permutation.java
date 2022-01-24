// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.nextPermutation(N, arr);
            StringBuilder out = new StringBuilder();
            for(int i = 0;i < N;i++)
                out.append(ans.get(i) + " ");
            System.out.println(out);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static int findlargestK(int arr[], int N){
        for(int k = N - 1; k > 0; k--){
            if(arr[k] > arr[k - 1]){
                return k - 1;
            }
        }
        return -1;
    }
    static List<Integer> convert(int arr[]){
        List<Integer> list = new ArrayList<>();
        for (int i: arr) {
            list.add(Integer.valueOf(i));
        }
        return list;
    }
    static List<Integer> nextPermutation(int N, int arr[]){
        // code here
        //1. Find the largest index k such that a[k] < a[k + 1].
        //If no such index exists, the permutation is the last permutation.
        //2. Find the largest index l greater than k such that a[k] < a[l].
        //3. Swap the value of a[k] with that of a[l].
        //4. Reverse the sequence from a[k + 1] up to and including the final element a[n].
        int k = findlargestK(arr, N);//finding the largest value of k
        if(k == -1)//if no k exists as per the given condition
        {
            Arrays.sort(arr);
            return convert(arr);
        }else{
            //finding the largest value of l
            for(int l = N - 1; l > k; l--){
                if(arr[k] < arr[l]){
                    //swapping
                    int temp = arr[k];
                    arr[k] = arr[l];
                    arr[l] = temp;
                    break;
                }
            }
            List<Integer> list = convert(arr);
            Collections.reverse(list.subList(k + 1, N)) ;
            return list;
        }
    }
}
