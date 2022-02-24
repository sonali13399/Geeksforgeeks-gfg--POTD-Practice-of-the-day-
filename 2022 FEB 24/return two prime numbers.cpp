// { Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> primeDivision(int n){
        vector<int> vis(n+1,1);
        for(int i=2;i*i<=n;i++){
            if(vis[i]){
                for(int j=i*i;j<=n;j+=i) vis[j]=0;
            }
        }
        for(int i=2;i<=n;i++){
            if(vis[i] and vis[n-i]) return {i,n-i};
        }
        return {-1,-1};
    }

};

// { Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        
        Solution ob;
        vector<int> ans = ob.primeDivision(N);
        cout<<ans[0]<<" "<<ans[1]<<"\n";
    }
    return 0;
}  // } Driver Code Ends
