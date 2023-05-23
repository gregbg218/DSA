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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> treeNodesQueue = new LinkedList<>();
        if(root!=null) 
            treeNodesQueue.add(root);
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        int counter=0;
        while(treeNodesQueue.size()!=0)
        {
            ArrayList<Integer> level = new ArrayList<Integer>(); 
            int levelLength= treeNodesQueue.size();   
            for(int i=0;i<levelLength;i++)                      // This is done so that we can seperate the nodes in levels and it wont go on infiniteley becos the level length is calculated only once
            {                                                   // Also the level length is bascially the number of parent nodes
                                                                // We did this inner for loop becos here we need level by level data but usually in bfs we dont have inner for loop
                TreeNode previousNode = treeNodesQueue.poll();
                // System.out.println(previousNode.val);
                level.add(previousNode.val);
                if(previousNode.left!=null)
                {
                    treeNodesQueue.add(previousNode.left);
                    
                }
                if(previousNode.right!=null)
                {   
                    treeNodesQueue.add(previousNode.right);
                }
            }
            if(counter%2!=0)                                // for zigzag pattern
                Collections.reverse(level);
            result.add(level);
            counter++;    
            
        }

        return result;
        
    }
}
