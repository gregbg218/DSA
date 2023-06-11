class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> cumulativePathSum = new HashMap<>(); //"long" type becos the currSum usually goes beyond the range of int
        cumulativePathSum.put(0L, 1);

        return countPaths(root, targetSum, 0L, cumulativePathSum);
    }

    private int countPaths(TreeNode node, int targetSum, long currSum, HashMap<Long, Integer> cumulativePathSum) {
        if (node == null)
            return 0;

        currSum += node.val;
        int count = cumulativePathSum.getOrDefault(currSum - targetSum, 0); //so the count is just the number of times the cumulative sum has appeared 

        cumulativePathSum.put(currSum, cumulativePathSum.getOrDefault(currSum, 0) + 1);

        count += countPaths(node.left, targetSum, currSum, cumulativePathSum);
        count += countPaths(node.right, targetSum, currSum, cumulativePathSum);

        cumulativePathSum.put(currSum, cumulativePathSum.get(currSum) - 1); // as we are backtracking we dont neeed the previous sum so we remove it

        if (cumulativePathSum.get(currSum) == 0)//it basically saves memory by removing cumulative sums with 0 frequencies and 
            cumulativePathSum.remove(currSum);//doesnt affect accuracy of soln. The code still works if we comment it

        return count;
    }
}
