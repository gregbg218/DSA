class Solution {
    ArrayList<Integer> visited = new ArrayList<Integer>(); 
    ArrayList<Integer> ans = new ArrayList<Integer>();
    Stack<Integer> st = new Stack<Integer>(); 
    public void solveDfs(int src ,int V, ArrayList<ArrayList<Integer>> adj)
    {
        st.push(src);
        visited.add(src);
        ans.add(src);
        for(int j : adj.get(src))
        {
            if(!visited.contains(j))
            {
                st.push(j);
                solveDfs(j,V,adj);   
            }
        }
        st.pop();
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        solveDfs(0,V,adj);
        return ans;
        
    }
}
