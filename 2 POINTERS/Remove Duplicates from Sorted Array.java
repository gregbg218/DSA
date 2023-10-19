//https://www.youtube.com/watch?v=DEJAZBq0FDA

class Solution {
    public int removeDuplicates(int[] nums) {
        int left =1,right=1;
        while(right<nums.length)
        {
            if(nums[right]!=nums[left-1])
            
            {
                
                nums[left]=nums[right];
                left++;
                
            }
            right++;
            
        }
        return left;
    }
        
    
}
