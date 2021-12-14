// { Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution
{
  public:
    string reverseWords (string s)
    {
        //code here.
        string t, ans;
    for (auto c : s) {
        if (c == '.') {
            reverse(t.begin(), t.end());
            ans += t + "."; t.clear();
        }
        else t.push_back(c);
    }
    reverse(t.begin(), t.end());
    return ans + t;
    }
};

// { Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s; cin >> s;
        Solution ob;
        cout << ob.reverseWords (s) << endl;
    }
    return 0;
}

// Contributed By: Pranay Bansal
  // } Driver Code Ends
