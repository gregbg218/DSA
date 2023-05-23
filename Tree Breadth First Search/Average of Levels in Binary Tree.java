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
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        if(root!=null) 
            treeNodesQueue.add(root);
        ArrayList<Double>result = new ArrayList<Double>();
        
        while(treeNodesQueue.size()!=0)
        {
            int levelLength= treeNodesQueue.size();  
            Double sum=0.00; 
            for(int i=0;i<levelLength;i++)                      
            {                                                   
                TreeNode previousNode = treeNodesQueue.poll();
                sum=sum+previousNode.val;
                if(previousNode.left!=null)
                {
                    treeNodesQueue.add(previousNode.left);
                    
                }
                if(previousNode.right!=null)
                {   
                    treeNodesQueue.add(previousNode.right);
                }
            }
            
            result.add(sum/levelLength);
            
            
        }

        return result;
        
    }
}
