class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        createSubsetsByDFS(0,nums);
        return result;
    }

    public void createSubsetsByDFS(int i,int[] nums)
    {
        if(i>=nums.length)
        {
            result.add(new ArrayList<Integer>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubsetsByDFS(i+1,nums);

        subset.remove(Integer.valueOf(nums[i]));
        createSubsetsByDFS(i+1,nums);
    }
}
