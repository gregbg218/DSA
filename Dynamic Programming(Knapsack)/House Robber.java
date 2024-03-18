class Solution {
    public int rob(int[] nums) {
        int[] dp= new int[nums.length+1];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        return findHouse(nums,nums.length,dp);
    }

    public int findHouse(int[] nums,int n,int[] dp)
    {
        dp[0]=0;

        dp[1]=nums[0];

        
        

        for(int i=2;i<=n;i++)
        {
            int pick=0;

            if(i-2>=0)
                pick = nums[i-1]+dp[i-2];

            int notPick =  dp[i-1];

            dp[i]=Math.max(pick,notPick);
        }



        return dp[n];
    }
}
