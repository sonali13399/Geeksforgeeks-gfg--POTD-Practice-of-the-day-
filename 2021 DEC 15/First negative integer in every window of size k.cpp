// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

vector<long long> printFirstNegativeInteger(long long int arr[],
                                             long long int n, long long int k);

// Driver program to test above functions
int main() {
    long long int t, i;
    cin >> t;
    while (t--) {
        long long int n;
        cin >> n;
        long long int arr[n];
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        long long int k;
        cin >> k;

        vector<long long> ans = printFirstNegativeInteger(arr, n, k);
        for (auto it : ans) cout << it << " ";
        cout << endl;
    }
    return 0;
}
// } Driver Code Ends




vector<long long> printFirstNegativeInteger(long long int A[],
                                             long long int N, long long int K) {
        queue<pair<long long int,long long int>>q;
        vector<long long int>v;
        for(int i=0;i<N;i++){
            if(A[i]<0){
                q.push({A[i],i});
            }
        }
        K--;
         int num;
         int ind=INT_MIN;
        for(int i=0;i<N;i++){
            if(q.empty()==false){
             num=q.front().first;
             ind=q.front().second;
              if(ind==i){
                q.pop();
            }
            }
            if(ind>=i && ind<=(i+K) && (i+K)<N ){
                v.push_back(num);
            }
            else if((i+K)<N){
                v.push_back(0);
            }
          
        }
        
        return v;                                         
 }
