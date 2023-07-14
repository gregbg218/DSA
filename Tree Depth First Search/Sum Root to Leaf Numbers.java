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
    public int sumNumbers(TreeNode root) {
        int resultSum=0;
        
        resultSum=sumByDFS(root,0);

        return resultSum;
    }

    public int sumByDFS(TreeNode root, int pathSum)
    {
       
        if(root==null)    // This condition is for empty trees
            return 0;

        pathSum=pathSum*10+root.val;

        if(root.left==null && root.right==null) // This is for leaf nodes and the recursion will stop at leaf nodes
        {
            
            return pathSum;     // This is the sum of the paths
                         
        } 
           
        
        int leftSum=sumByDFS(root.left,pathSum);
        int rightSum=sumByDFS(root.right,pathSum);   
        
        return leftSum+rightSum; 

    }
}
