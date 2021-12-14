#User function Template for python3

def minSwap (arr, n, k) : 
    #Complete the function
    count=0
    w=0
    ans=n
    for i in range(n):
        if arr[i] <= k :
            count += 1
    for i in range(n):
        if arr[i] <= k:
            w += 1
        if i>= count:
            if arr[i-count] <= k:
                w -= 1
        if i>=count-1:
            ans = min(ans,count-w)
    return ans
    



#{ 
#  Driver Code Starts
#Initial Template for Python 3

for _ in range(0,int(input())):
    n = int(input())
    arr = list(map(int, input().strip().split()))
    k = int(input())
    ans = minSwap(arr, n, k)
    print(ans)
    





# } Driver Code Ends
