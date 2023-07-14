class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) 
    {
        Arrays.sort(nums); // we have to do this as only then will same elements come side by side
        createSubsetsByDFS(0,nums);
        return result;
        
    }

    public void createSubsetsByDFS(int i,int[] nums)
    {
        if (i == nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubsetsByDFS(i + 1, nums);

        subset.remove(Integer.valueOf(nums[i]));
        while (i<nums.length-1 && nums[i]==nums[i+1])  // This condition is here and not before createSubsetsByDFS(i + 1, nums) so that the left part is allowed
                                                       // to have the first go but right shouldnt be allowed to repeat it
        {
            i++;
        }  // when the value of i=nums.length-1 we wont go into the while loop also when i == nums.length then this case is 
           // handled by the if condition above(base condition)
        createSubsetsByDFS(i+1, nums);
    }
}
