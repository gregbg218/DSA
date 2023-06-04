public class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return dfs(root, arr, 0);
    }

    private boolean dfs(TreeNode node, int[] arr, int index) {
        // If the current node is null or the node value doesn't match the array element
        // at the current index, return false.
        if (node == null || node.val != arr[index]) {
            return false;
        }
        
        // If it's the last element in the array and the node is a leaf, return true for stopping the search
        if (index == arr.length - 1 && node.left == null && node.right == null) {
            return true;
        }
        
        // Recurse on the left and right subtrees, checking the next element in the array.
        return dfs(node.left, arr, index + 1) || dfs(node.right, arr, index + 1); // the path can be found either in th left subtree or the right subtree
    }
}

// we are going node by node in a tree and checking if the value is equal to the array value at that index
//so we are going level by level and incrementing array index by 1 and checking if the value is equal
