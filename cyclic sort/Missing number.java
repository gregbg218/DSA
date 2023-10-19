class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums.length && nums[i]!=i) // becos the extra number is always the length of array as range is between [0,n]
            {
                int temp = nums[nums[i]];
                nums[nums[i]]=nums[i];
                nums[i]=temp;
                if(nums[i]!=i) // this is done if the number swapped still does not belong
                    i--;
            }
            
        }
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j)
            {
                ans=j;
                return ans;
                
            }
        }
        ans=nums.length;
        return ans;
    }
}
