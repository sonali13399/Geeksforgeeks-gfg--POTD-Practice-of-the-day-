// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution {
    vector<vector<int>> mp = {{0},
                          {1}, 
                          {2, 4, 8, 6}, 
                          {3, 9, 7, 1}, 
                          {4, 6}, 
                          {5},
                          {6},
                          {7, 9, 3, 1},
                          {8, 4, 2, 6},
                          {9, 1}};

  public:
    int getLastDigit(string a, string b) {
        // code here
        if (b == "0")	return 1;
        int d = a.back() - '0';
        auto it = b.rbegin();
        // num = last 2 digits of b, or only last digit if |b|==1
        int num = *it - '0' + 3;    // 3 added due to mod adjustment
        ++it;
        if (it != b.rend())
            num += (*it - '0') * 10;
        return mp[d][num % mp[d].size()];
    }
};

// { Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        string a,b;
        
        cin>>a>>b;

        Solution ob;
        cout << ob.getLastDigit(a,b) << endl;
    }
    return 0;
}  // } Driver Code Ends
