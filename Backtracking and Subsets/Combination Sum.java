class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrackAndSum(target,res,tempList,candidates,0);
        return res;
    }

    public void backtrackAndSum(int remains,List<List<Integer>> res,List<Integer> tempList,int[] candidates,int start)
    {
        if(remains == 0)
            res.add(new ArrayList<>(tempList));
        else if(remains<0)
            return;
        else
        {
            for(int i=start;i<candidates.length;i++)
            {
                tempList.add(candidates[i]);
                backtrackAndSum(remains-candidates[i],res,tempList,candidates,i);  // not i+1 so that we can repeat numbers
                tempList.remove(tempList.size()-1);

            }
        }
    }
}


// basically we are doing target-candidates[i] till we reach 0
//  we are not passing i+1 as we dont want in the next for loop to start from i=0 becos lets take an example
// [2,3,6,7] and target=7
// once we do 2,2,3 we dont want to do 2,3,2 while backtracking as repetition is not alllowed
