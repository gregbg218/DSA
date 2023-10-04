class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);  /// rememebr sorting is important to group all duplicates side by side
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> tempList= new ArrayList<>();
        backTrackAndSubset(res,tempList,0,nums);
        return res;
    }

    public void backTrackAndSubset(List<List<Integer>> res,List<Integer> tempList,int start, int[] nums)
    {
        res.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1])
            {
                continue;
            }
            tempList.add(nums[i]);
            backTrackAndSubset(res,tempList,i+1,nums);
            tempList.remove(tempList.size()-1);
        }


    }
}

// In the condition i>start && nums[i]==nums[i-1]
// if we remove i>start
// then the condition will be just  "nums[i]==nums[i-1]" which will be a blanket ban whenever both are same
// for example if current tempList is (1a) and i of for loop stops at 1b then becos nums[i] == nums[i-1] we cant add
// Hence we add extra condition to prevent skipping in specific cases of nums[i] == nums[i-1]

// so there are 2 ways i>0 && nums[i]==nums[i-1] can go 

// Part A:
// if the current tempList is (1a) and we are looking to add the next 1 (i.e. 1b)
// if i==start then we can go forward and add it

// Part B:
// but if the current index i=1 and temp is empty then we wont add 1b becos while backtracking i became greater than start
// so we will skip this number 
