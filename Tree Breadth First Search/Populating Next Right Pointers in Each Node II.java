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

        Node levelStart = root;  //This variable keeps track of the leftmost node of the current level.

        while (levelStart != null) //The outer while loop iterates over each level of the tree.
                                   //It continues until there are no more levels to process (i.e., levelStart becomes null).
        {
            Node current = levelStart;  //This variable is used to traverse each node in the current level. And as it is the 1st node of the level
                                        // current is same as levelStart
            Node nextLevelStart = null; //This variable keeps track of the leftmost node of the next level.
            Node prev = null;   //is used to keep track of the previously connected child node (either the left or right child) so that
                                //the next child node can be connected to it. It helps establish the correct connections between
                                //adjacent child nodes in the same level.

            while (current != null) //The inner while loop iterates over each node in the current level.
                                    //It continues until there are no more nodes in the level (i.e., current becomes null).
            {
                if (current.left != null) {
                    if (prev == null) { //If prev is null, it means it is the first node encountered in the current level,
                        nextLevelStart = current.left; //so nextLevelStart is updated to the left child.
                    } else {            // This means it is not the 1st node in the level
                        
                        prev.next = current.left;   // This establishes the connection between adjacent nodes in the same level.
                    }
                    prev = current.left; //As prev is the main node that creates connections we need to update its value if either left or right child
                                         // exists
                }

                if (current.right != null) { // This whole if loop is same as the previous if loop except that was for left child and this is for
                                             // right child
                    if (prev == null) {
                        nextLevelStart = current.right;
                        
                    } else {
                        prev.next = current.right;
                    }
                    prev = current.right;
                }

                current = current.next;     // this will be null in the first iteration.
            }

            levelStart = nextLevelStart; // Move to the next level
        }

        return root;
    }
}

// Basically th whole game is of travelling through a level using "current" node and connecting all its children using "prev" node and also updating
// "prev" node value
