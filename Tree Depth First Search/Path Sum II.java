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
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        checkByDFS( root,  targetSum, path,allPaths);
        return allPaths;
        
    }

    public void checkByDFS(TreeNode root, int targetSum,List<Integer> path,List<List<Integer>> allPaths )
    {
       
        if(root==null)
            return;
        path.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum)// we are subtracting from target sum
        {
            allPaths.add(path);
            return;
         
                
        } 
           
        else
        {
            checkByDFS(root.left,targetSum-root.val,new ArrayList<Integer>(path),allPaths);   // This new arraylist with a copy of the current path ensures
            // that when you add or remove elements from the path list in the left subtree, it does not affect the path list in the right subtree because
            // they are separate instances.Ths the common part of left and right both remain same but only the new changes are added to the new and
            // separate instances   
            
            checkByDFS(root.right,targetSum-root.val,new ArrayList<Integer>(path),allPaths);
        }

    }
}
