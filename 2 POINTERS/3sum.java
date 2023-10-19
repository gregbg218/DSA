//https://www.youtube.com/watch?v=jzZsG8n2R9A&t=639s

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      int sum=100;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums.length<3)
            return result;

        Arrays.sort(nums);
        for(int i =0 ; i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]  )
                continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                sum = nums[i]+nums[left]+nums[right];
                if(sum<0)
                {
                    left++;
                } else if (sum>0) {
                    right--;
                }
                else {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left++;                                                   //only increase 1 of the 2 pointers or else u get infinite loop
                    while(nums[left]==nums[left-1] && left<right)             // left should not be the same value becos  right is not changing                                                                      //
                        left++;                                               // and we dont want same left and right value pair
                }
            }

        }
        return result;
        
    }
}
