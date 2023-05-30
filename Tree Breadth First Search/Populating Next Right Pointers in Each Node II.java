/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null)
            return root;

        Node levelStart = root;

        while (levelStart != null) 
        {
            Node current = levelStart;
            Node nextLevelStart = null;
            Node prev = null;

            while (current != null) 
            {
                if (current.left != null) {
                    if (prev != null) {
                        prev.next = current.left; // this is done when the right node of 1 tree is connected to the left node of another tree
                    } else {
                        nextLevelStart = current.left;
                    }
                    prev = current.left; //this is for connecting the next to other nodes
                }

                if (current.right != null) {
                    if (prev != null) {
                        prev.next = current.right;
                    } else {
                        nextLevelStart = current.right;
                    }
                    prev = current.right;
                }

                current = current.next;     // this will be null in the first iteration
            }

            levelStart = nextLevelStart; // Move to the next level
        }

        return root;
    }
}
