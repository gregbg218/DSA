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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        int depth=0;
        if(root!=null)
        { 
            treeNodesQueue.add(root);
            depth=1;
        }
        // ArrayList<Double>result = new ArrayList<Double>();
        
        while(treeNodesQueue.size()!=0)
        {
            int levelLength= treeNodesQueue.size();  
            for(int i=0;i<levelLength;i++)                      
            {                                                   
                TreeNode previousNode = treeNodesQueue.poll();
                if(previousNode.left!=null)
                {
                    treeNodesQueue.add(previousNode.left);
                    
                }
                if(previousNode.right!=null)
                {   
                    treeNodesQueue.add(previousNode.right);
                }

                if(previousNode.left==null && previousNode.right==null)
                    return depth;

            }
            depth++;
            
            
            
        }

        return depth;
        
    }
}
