class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
      // Here we dont sort as all elements are unique so sorting is only required in subsets with duplicates  
        createSubsetsByDFS(0,nums);
        return result;
    }

    public void createSubsetsByDFS(int i,int[] nums)
    {
        if(i>=nums.length)
        {
            result.add(new ArrayList<Integer>(subset));  // we make a copy here as in backtracking we move back from the leaf nodes to reach other leaf nodes
                                                        // so we must not modify the list
            return;
        }

        subset.add(nums[i]);
        createSubsetsByDFS(i+1,nums);

        subset.remove(Integer.valueOf(nums[i]));  // when we come to this point we already know that recursion has taken us back from a particular
                                                  // node to its parent node and now to explore the other sibling node we remove the value . 
        createSubsetsByDFS(i+1,nums);
    }
}
