class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res= new ArrayList<>();
        subsetBackTrack(nums,res,new ArrayList<Integer>(),0);  // call for null subset
        return res;
    }

    public void subsetBackTrack(int[] nums, List<List<Integer>> res, List<Integer> temp, int start)
    {
        res.add(new ArrayList<Integer>(temp));  // There is no base condition here and this also helps in adding null as a subset

        for (int i=start;i<nums.length;i++)
        {
            temp.add(nums[i]);
            subsetBackTrack(nums,res,temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
}



// The subset {} or null is included by the first call that we make in the subsets method with start=0

// for (int i=start;i<nums.length;i++), Here we begin from the previous_index+1 becos in subsets unlike permutations we dont need all the elements
// , instead subsets can be half empty or 1 less etc.
