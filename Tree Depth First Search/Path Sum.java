/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean result = checkByDFS(root,targetSum);

        return result;
        
    }


    public boolean checkByDFS(TreeNode root, int targetSum)
    {
        boolean result ;
        if(root==null)
            return false;
        if(targetSum==root.val && root.left==null && root.right==null)  // note the sum should be of a root to leaf path and not like if in a tree just the value of the root node is equal to the target
            return true;
        else
        {
            result = checkByDFS(root.left,targetSum-root.val);
            if(result!=true) // The question only wants 1 path so once we get true we dont need to check further
                result = checkByDFS(root.right,targetSum-root.val);
        }
        return result;
    }
}
