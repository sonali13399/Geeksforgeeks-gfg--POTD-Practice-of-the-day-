// { Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

 // } Driver Code Ends
//User function template for C++
class Solution{
public:

	// Function to find maximum product subarray
	long long maxProduct(vector<int> arr, int n) {
	    // code here
	    int64_t minn = 1,maxx = 1;
	   int64_t ans = INT64_MIN;
	   for(int i=0; i<n; i++){
	       if(arr[i] == 0){
	           //both minn and maxx till here becomes 0
	           ans = max(ans,(int64_t)0);
	           //we need check again from next element onwards
	           minn = 1;
	           maxx = 1;
	           continue;
	       }
	       else if(arr[i]>0){
	           // no interchange, just multiply to both
	           minn = min((int64_t)arr[i],minn*arr[i]);
	           maxx = max((int64_t)arr[i],maxx*arr[i]);
	       }
	       else{
	           int64_t new_minn = maxx*arr[i];
	           int64_t new_maxx = minn*arr[i];
	           minn = min((int64_t)arr[i],new_minn);
	           maxx = max((int64_t)arr[i],new_maxx);
	       }
	       ans = max(ans,maxx);
	   }
	   return ans;
	}
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, i;
        cin >> n;
        vector<int> arr(n);
        for (i = 0; i < n; i++) {
            cin >> arr[i];
        }
        Solution ob;
        auto ans = ob.maxProduct(arr, n);
        cout << ans << "\n";
    }
    return 0;
}  // } Driver Code Ends
