#User function Template for python3

class Solution:
    def reverseWords(self, s):
        # code here
        # code here
        a = s.split(".")
        for i in range(len(a)):
            a[i] = a[i][::-1]
        b = ".".join(a)
        return b

#{ 
#  Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        ob = Solution()
        ans = ob.reverseWords(s)
        print(ans)
# } Driver Code Ends
