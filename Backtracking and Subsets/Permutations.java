class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrackAndFind(result,nums,0);


        return result;
    }

    public void backtrackAndFind(List<List<Integer>> result,int[] nums,int recursionPtr)
    {

    if(recursionPtr==nums.length)
    {
        List<Integer> permutation= new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            permutation.add(nums[i]);
        }
        result.add(permutation);
    }

    for(int iterationPtr=recursionPtr;iterationPtr<nums.length;iterationPtr++)
    {
        swapPtrs(recursionPtr,iterationPtr,nums);
        backtrackAndFind(result,nums,recursionPtr+1);
        swapPtrs(recursionPtr,iterationPtr,nums);  // this just undos the swapping before we backtrack to try other option
    }
    }

    public void swapPtrs(int recursionPtr,int iterationPtr,int[] nums)
    {
        int temp=nums[recursionPtr];
        nums[recursionPtr]=nums[iterationPtr];
        nums[iterationPtr]=temp;
    }
}

// Basically the main thing is the recursion pointer moves forward(as its incremented by 1) and then for loop also starts moving the iteration pointer by 1
// thus providing perfect conditions for a swap(although at the beginning when both ptrs are same there has to be a useless or same swap)
