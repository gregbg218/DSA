class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=i+1)
            {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                if(nums[i]!=i+1 && nums[nums[i]-1]!=nums[i]) // this is done if the number swapped still does not belong
                    i--;
            }
            
        }
        
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                ans.add(j+1);
            }
            // System.out.println(" "+nums[j]);
        }
        
        return ans;
        
    }
}
