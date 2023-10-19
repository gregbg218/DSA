class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int ans=Integer.MAX_VALUE;
        int curr_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            curr_sum+=nums[i];

            while(curr_sum>=target)
            {
                ans=Math.min(i+1-left,ans);
                curr_sum-=nums[left];
                left+=1;
            }
        }
        return ans<Integer.MAX_VALUE?ans:0;
    }
}
