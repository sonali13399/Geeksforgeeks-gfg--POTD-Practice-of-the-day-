// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} class GfG {
    public static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    
    public static Node point(Node root, int n)
    {
        if(root == null)
            return null;
            
        if(root.data == n)
            return root;
            
        Node l = point(root.left, n);
        if(l!=null && l.data==n)
            return l;
            
        Node r= point(root.right, n);
        return r;
        
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            Node root = buildTree(s);
            
            Node p = point(root,n);
            
            Solution ob=new Solution();
            ArrayList<Integer> ans= ob.printCousins(root, p);
            
            for(int i=0;i<ans.size();i++)
            {
                    System.out.print(ans.get(i)+" ");
    
            }
            
            System.out.println();
            
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution
{
    static int nodeLevel = 0;
   public static ArrayList<Integer> printCousins(Node root, Node node_to_find)
   {
       //code here
       givenNodeLevel(root, node_to_find, 1);
       ArrayList<Integer> li = new ArrayList<>();
       findCousins(root, node_to_find, li, 1);
       
       if (li.size() == 0) {
           li.add(-1);
       }
       return li;
   }
   private static void findCousins(Node root, Node k, ArrayList<Integer> li, int level) {
       if (root == null) {
           return;
       }
       if (level == nodeLevel - 1) {
           if (root.left != null && root.right != null && root.left != k && root.right != k) {
               li.add(root.left.data);
               li.add(root.right.data);
               return;
           }
           if (root.left == null && root.right != null && root.right != k) {
               li.add(root.right.data);
               return;
           }
           if (root.left != null && root.right == null && root.left != k) {
               li.add(root.left.data);
               return;
           }
       }
       
       findCousins(root.left, k, li, level + 1);
       findCousins(root.right, k, li, level + 1);
   }
   private static void givenNodeLevel(Node root, Node k, int level) {
       if (root == null) {
           return;
       }
       if (root == k) {
           nodeLevel = level;
           return;
       }
       
       givenNodeLevel(root.left, k, level + 1);
       givenNodeLevel(root.right, k, level + 1);
   }
}
