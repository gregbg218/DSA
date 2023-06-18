class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> cumulativePathSum = new HashMap<>(); //"long" type becos the currSum usually goes beyond the range of int
        cumulativePathSum.put(0L, 1);

        return countPaths(root, targetSum, 0L, cumulativePathSum);
    }

    private int countPaths(TreeNode node, int targetSum, long currSum, HashMap<Long, Integer> cumulativePathSum) {
        if (node == null)
            return 0;

        currSum += node.val;// getOrDefault just checks if the difference is found in the cumulative sums or not and if not it returns 0
        int count = cumulativePathSum.getOrDefault(currSum - targetSum, 0); //so the count is just the number of times the target sum has appeared in
        // the tree. Also count variable is different for every level of recursion so it keeps on changing.

        cumulativePathSum.put(currSum, cumulativePathSum.getOrDefault(currSum, 0) + 1); // This is for keeping track of the cumulative sums

        count += countPaths(node.left, targetSum, currSum, cumulativePathSum);
        count += countPaths(node.right, targetSum, currSum, cumulativePathSum);

        cumulativePathSum.put(currSum, cumulativePathSum.get(currSum) - 1); // once we reach the leaf nodes of a path and dont find the target sum 
// we remove the associated cumulative sums as it can no longer help us while we explore other paths
// when we reach the leaf nodes there too we remove the cumulative sums that dont match
        if (cumulativePathSum.get(currSum) == 0)//it basically saves memory by removing cumulative sums with 0 frequencies and 
            cumulativePathSum.remove(currSum);//doesnt affect accuracy of soln. The code still works if we comment it

        return count;
    }
}
