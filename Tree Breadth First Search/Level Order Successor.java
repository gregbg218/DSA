// Java program to find Levelorder
// successor of given node in the
// Binary Tree
import java.util.*;
class GfG {

// Tree Node
static class Node {
	Node left, right;
	int value;
}

// Utility function to create a
// new node with given value
static Node newNode(int value)
{
	Node temp = new Node();
	temp.left = null;
	temp.right = null;
	temp.value = value;

	return temp;
}

// Function to find the Level Order Successor
// of a given Node in Binary Tree
// key is the node whose successor needs to be found 
static Node levelOrderSuccessor(Node root, Node key)
{
	// Base Case
	if (root == null)
		return null;

	// If root equals to key
	if (root == key) {                      

		//If the root is the same as the key node, we need to find the level order successor. If the left child of the root exists,
    //it will be the level order successor. If not, we check if the right child exists and return it as the level order successor.
    //If both the left and right children are null, it means there is no level order successor, so we return null.
		if (root.left != null)
			return root.left;

		// Else if right child exists it will be
		// the Postorder Successor
		else if (root.right != null)
			return root.right;
		else
			return null; // No Successor
	}

	// Create an empty queue for level
	// order traversal
  //If the root is not the key node, we perform a level order traversal starting from the root to find the key node.
  //We use a queue to perform the level order traversal. We enqueue the root node and then iterate until the queue is empty.
  //In each iteration, we dequeue a node from the queue and check if it is the key node.
  //If it is the key node, we break out of the loop.
  //If it is not the key node, we enqueue its left and right children (if they exist).
  //After the loop, the node at the front of the queue will be the level order successor. We return that node.
	Queue<Node> q = new LinkedList<Node> ();

	// Enqueue Root
	q.add(root);

	while (!q.isEmpty()) {
		Node nd = q.peek();
		q.remove();

		if (nd.left != null) {
			q.add(nd.left);
		}

		if (nd.right != null) {
			q.add(nd.right);
		}

		if (nd == key)
			break;
	}

	return q.peek();
}

// Driver code
public static void main(String[] args)
{
	Node root = newNode(20);
	root.left = newNode(10);
	root.left.left = newNode(4);
	root.left.right = newNode(18);
	root.right = newNode(26);
	root.right.left = newNode(24);
	root.right.right = newNode(27);
	root.left.right.left = newNode(14);
	root.left.right.left.left = newNode(13);
	root.left.right.left.right = newNode(15);
	root.left.right.right = newNode(19);

	Node key = root.right.left; // node 24

Node res = levelOrderSuccessor(root, key);

	if (res != null)
		System.out.println("LevelOrder successor of "
						+key.value + " is " + res.value);
	else
		System.out.println("LevelOrder successor of "
							+key.value + " is NULL");

}
}
