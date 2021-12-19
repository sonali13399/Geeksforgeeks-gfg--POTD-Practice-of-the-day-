// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution {
  public:
  string hex(int n,unordered_map<int,char> &hexCodes){
        string res = "";
        while(n>0){
            int rem = n%16;
            n /= 16;
            res += hexCodes[rem];
        }
        // reverse(res.begin(),res.end());
        // I follow (lsb to msb) right to left  convention 
        return res;
    }
    string encryptString(string S) {
        // code here
        unordered_map<int,char> hexCodes;
        for(int i=0; i<10; i++){
            hexCodes[i] = char(i-0+'0');
        }
        for(int i=10; i<16; i++){
            hexCodes[i] = char(i-10+'a');
        }
        int n = S.size();
        string ans = "";
        for(int i=0; i<n; i++){
            int cnt = 1;
            while(i<n-1 && S[i] == S[i+1]){
                cnt += 1;
                i += 1;
            }
            ans += S[i];
            ans += hex(cnt,hexCodes);
            
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};

// { Driver Code Starts.
int main() {
    long long t;
    cin >> t;
    while (t--) {
        string S;
        cin>>S;

        Solution ob;
        cout<<ob.encryptString(S)<<endl;
    }
    return 0;
}  // } Driver Code Ends
