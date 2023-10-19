class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                if(nums[nums[i]-1]==nums[i])
                    ans=nums[i];
                if(nums[i]!=i+1 && nums[nums[i]-1]!=nums[i]) // this is done if the number swapped still does not belong
                    i--;
            }
            
        }
       
        return ans;
    }
}
