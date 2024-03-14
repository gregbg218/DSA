class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {

       int[] dp = new int[arr.length];
         for(int j=0;j<=arr.length-1;j++)
           {
               dp[j]=-1;
           }
        
        return maxSum(arr,k,dp);
        
    }

    public int maxSum(int[] arr, int k,int[] dp)
    {

    

        
        

        for(int start=arr.length-1;start>=0;start--)
        {
            int len=0;
            int element= Integer.MIN_VALUE;
            int ans= Integer.MIN_VALUE;
            for(int i=start;i<=Math.min(arr.length-1,start+k-1);i++)   // max length of partition array is k and less than array size
            {
                len=len+1;   
                element=Math.max(element,arr[i]);

                int sum=0;

                if(i+1>arr.length-1)
                    sum=element*len;
                else
                    sum = element*len+dp[i+1];
                ans=Math.max(ans,sum);
            }
            dp[start]=ans;
        }

        
        
        return dp[0];
    }
}

// The question says each partition array should be of at most length k


// Basically we are finding max element in a subarray of size k and for every sub array
