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
    int maxSum=Integer.MIN_VALUE; // reason for this explained below

    public int maxPathSum(TreeNode root) {
        visitEveryNode(root);
        return maxSum;
    }

    public int visitEveryNode(TreeNode root)
    {
           
        
        if(root==null)
            return 0;

        int leftMax= visitEveryNode(root.left);
        leftMax=Math.max(leftMax,0); // this is so if the nodes had negative values so we can ignore

        int rightMax= visitEveryNode(root.right);
        rightMax=Math.max(rightMax,0);

        if(maxSum<root.val+leftMax+rightMax) // with split
            maxSum=root.val+leftMax+rightMax; // now if the input is just a single node tree with negative value node like [-6] then comparing it with maxSum gives us the value of the single node
        

        return root.val+Math.max(leftMax,rightMax); // without split
    }
}
