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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root!=null)
            result.add(root.val);
        else
            return result;

        Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        treeNodesQueue.add(root);

        while(treeNodesQueue.size()!=0)
        {
            int levelLength= treeNodesQueue.size();  
            TreeNode rightMostNode=null;    // For the rightmost node in a level
            for(int i=0;i<levelLength;i++)                      
            {                                                   
                TreeNode previousNode = treeNodesQueue.poll();
                if(previousNode.left!=null)
                {
                    treeNodesQueue.add(previousNode.left);
                    rightMostNode=previousNode.left;
                }
                if(previousNode.right!=null)
                {   
                    treeNodesQueue.add(previousNode.right);
                    rightMostNode=previousNode.right;
                }

                
            }
            if(rightMostNode!=null)
                result.add(rightMostNode.val);
            
            
            
        }

        return result;

        
    }
}
