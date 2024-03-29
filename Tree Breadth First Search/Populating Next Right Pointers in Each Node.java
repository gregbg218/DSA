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
        left = _left;   // Left here means child of the parent
        right = _right;  // Similarlly right is right child of the parent
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null || root.left==null)
            return root;

        Node cur=root;
        Node next=cur.left;

        while(cur.left!=null)    // This condition is to find leaf nodes as we stop on leaf nodes
        {                        // Also this is a perfect binary tree that means all leaf nodes are on the same level and every non leaf node has 2 children
            cur.left.next=cur.right;

            if(cur.next!=null)
                cur.right.next=cur.next.left;

                                      // As parent node is already connected to its sibling in the previous iteration we only check for that sibling
                                      // if that sibling is not there then definitely we must be on the end of a level and so we should go on next level
            if(cur.next!=null)        // and "next" pointer is known for keeping track of next level's first node
                cur=cur.next;
            else
            {
                cur=next;           
                next=next.left;       // next pointer is always on the starting node of each level or always on the leftmost node on each level it never goes on any other node
            }
            
        }


        return root;
        
    }
}
