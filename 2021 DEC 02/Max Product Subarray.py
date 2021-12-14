#User function Template for python3
class Solution:

	# Function to find maximum
	# product subarray
	def maxProduct(self,arr, n):
		# code here
		res = arr[0]
		l=0
		r=0
		for i in range(n):
		    if l==0:
		        l=arr[i]
		    else:
		        l=l*arr[i]
		    if r==0:
		        r=arr[n-1-i]
		    else:
		        r=r*arr[n-1-i]
		    res = max(res,max(l,r))
		return res

#{ 
#  Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.maxProduct(arr, n)
        print(ans)
        tc -= 1

# } Driver Code Ends
