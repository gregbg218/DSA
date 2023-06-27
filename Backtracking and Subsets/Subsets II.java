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
        if (i >= nums.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        createSubsetsByDFS(i + 1, nums);

        subset.remove(subset.size() - 1);
        while (i+1< nums.length && nums[i+1]==nums[i]) {
            i++;
        }
        createSubsetsByDFS(i+1, nums);
    }
}
