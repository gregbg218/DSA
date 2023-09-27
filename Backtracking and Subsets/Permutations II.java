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
// This is for basic checking by index if it is used or not as in every recursive plunge the for loop starts from i=0 so we need to avoid the already
// used elements.
// 
// 
// 
// 2nd case: i>0 && nums[i]==nums[i-1] && used[i-1]==false (all 3 should be taken together to form a specific 
// integrated condition)
// 
// 
// a)  i>0 as we dont want to apply "continue" if its the first element
// 
// 
// 
// b) nums[i]==nums[i-1] to check if current and previous are same and this condition makes sense only when coupled with 
// the next condition
// 
// 
// 
// c ) used[i-1]==false can be exaplained with an example:
//for a set (1a,1b,2)[note "a" and "b" are used to differentiate the same elements]:

// if we remove used[i-1]== false
// then the condition will be just  "i>0 && nums[i]==nums[i-1]" which will be a blanket ban whenever both are same
// for example if current perm is (1a,2) and i of for loop stops at 1b then becos nums[i] == nums[i-1] 
// Hence we add extra condition to prevent skipping in specific cases of nums[i] == nums[i-1]

// so there are 2 ways i>0 && nums[i]==nums[i-1] can go 

// Part A:
// if the current perm is (1a) and we are looking to add the next 1 (i.e. 1b)
// if used[i-1] == true then we can go forward and add it

// Part B:
// but if used[i-1] == false then we know that the current perm is empty and if we go ahead we will get
// (1,2,1) which we have already gotten in Part A
