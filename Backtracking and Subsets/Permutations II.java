class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used= new boolean[nums.length];
        List<Integer> currntPerm = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTrackAndPermute(nums,used,currntPerm,result);
        return result;
    }

    public void backTrackAndPermute(int[] nums,boolean[] used,List<Integer> currntPerm,List<List<Integer>> result)
    {
        if(currntPerm.size()==nums.length)
            result.add(new ArrayList<>(currntPerm));
        
        for(int i=0;i<nums.length;i++)
        {
            if(used[i]==true || i>0 && nums[i]==nums[i-1] && used[i-1]==false)
            {
                continue;
            }

            used[i]=true;
            currntPerm.add(nums[i]);
            backTrackAndPermute(nums,used,currntPerm,result);
            currntPerm.remove(currntPerm.size()-1);
            used[i]=false;

        }
    }
}

// used[i]==true || i>0 && nums[i]==nums[i-1] && used[i-1]==false
// 
// as there is an "||" sign between it means there are 2 separate conditions or cases
// 
// 
// 1st case : used[i]==true
// 
// This is for basic checking by index if it is used or not
// 
// 
// 
// 2nd case: i>0 && nums[i]==nums[i-1] && used[i-1]==false (all 3 should be taken together to form a specific 
// integrated condition)
// 
// 
// i>0 as we dont want to apply "continue" if its the first element
// 
// 
// 
// nums[i]==nums[i-1] to check if current and previous are same and this condition makes sense only when coupled with 
// the next condition
// 
// 
// 
// used[i-1]==false can be exaplained with an example:
// 
// nums=[1,1,2]

// so we can create a tree and generate all possibilities for the 1st "1" 
// but we dont want to do recreate this same tree for the 2nd "1"
// even though the 1st "1" has already been give false value in the used array due to backtracking

