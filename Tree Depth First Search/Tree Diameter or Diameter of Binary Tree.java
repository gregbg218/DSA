class Solution {

    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeigtAndDiameter(root);
        return diameter;
        
    }

    public int calculateHeigtAndDiameter(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int leftHeight= calculateHeigtAndDiameter(root.left);
        int rightHeight= calculateHeigtAndDiameter(root.right);

        diameter=Math.max(leftHeight+rightHeight,diameter);

        return 1+Math.max(leftHeight,rightHeight);
    }
}
