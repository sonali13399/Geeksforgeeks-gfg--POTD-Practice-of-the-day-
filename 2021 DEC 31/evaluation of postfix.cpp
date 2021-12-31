// { Driver Code Starts
// C++ program to evaluate value of a postfix expression

#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
class Solution
{
    public:
    //Function to evaluate a postfix expression.
    int isOperand(int num){
       return (num>=0 && num <= 9);
   }
    int evaluatePostfix(string S)
    {
        // Your code here
        stack<int> st;
       for(int i=0; i<(int)S.size(); i++){
           int num = (int)(S[i]-'0');//ascii value subtraction
           if(isOperand(num)){
               st.push(num);
           }
           else{
               // Assuming  valid postfix expression
               int num2 = st.top(); st.pop();
               int num1 = st.top(); st.pop();
               int newNum;
               if(S[i] == '*'){
                   newNum = num1*num2;
               }
               else if(S[i] == '/'){
                   // ab / == a/b
                   newNum = num1/num2;
               }
               else if(S[i] == '+'){
                   newNum = num1+num2;
               }
               else{
                   newNum = num1-num2;
               }
               st.push(newNum);
           }
       }
       int ans = st.top(); st.pop();
       return ans;
    }
};

// { Driver Code Starts.

// Driver program to test above functions
int main()
{
    int t;
    cin>>t;
    cin.ignore(INT_MAX, '\n');
    while(t--)
    {
        string S;
        cin>>S;
        Solution obj;
    
    cout<<obj.evaluatePostfix(S)<<endl;
    }
    return 0;
}
  // } Driver Code Ends
