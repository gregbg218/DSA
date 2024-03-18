class Solution {
    public int rob(int[] nums) {
        int[] dp= new int[nums.length+1];
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }

        int[] temp1= new int[nums.length-1];
        int[] temp2= new int[nums.length-1];
        for(int i=1;i<nums.length;i++)
        {
            
            temp1[i-1]=nums[i];
        }


        for(int i=0;i<nums.length-1;i++)
        {
            
            temp2[i]=nums[i];
        }

        

        int left=findHouse(temp1,temp1.length,dp);
        int right=findHouse(temp2,temp2.length,dp);



        return Math.max(left,right);
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


// if we take element 0 then we cant take last element and vice versa
// so we have to take 2 separate sequences 1 with first leement and without last
// and another with last element without first element
// so basically same as house robber 1 but instead we are doing 2 sequences and
// taking max
