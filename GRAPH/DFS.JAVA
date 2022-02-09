class Solution {
    public void solveDfs(int src , ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> visited,ArrayList<Integer> ans)
    {
        visited.add(src);
        ans.add(src);
        for(int j : adj.get(src))
        {
            if(!visited.contains(j))
            {
                solveDfs(j,adj,visited,ans);   
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> visited = new ArrayList<Integer>(); 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        solveDfs(0,adj,visited,ans);
        return ans;
        
    }
}
