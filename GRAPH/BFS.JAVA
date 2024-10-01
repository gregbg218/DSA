// Same as DFS iterative


class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans = new  ArrayList<Integer>();
        ArrayList<Integer> visited = new  ArrayList<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        visited.add(0);
        int i = 0;
        
            while(!q.isEmpty())
            {
                i = q.peek();
                for(int j : adj.get(i))
                {
                    if(!visited.contains(j))
                    {
                        q.add(j);
                        visited.add(j);
                    }
                }
                ans.add(q.peek());
                q.remove();
            }
            
        return ans;
    }
}
