class Solution {
    public void dfs(int src,int dest,List<List<Integer>> ans,List<Integer> path,int[][] graph)
    {
        path.add(src);
        
        if(src==dest)
        {
            ans.add(new ArrayList(path));
        }
        else
        {
            for(int i : graph[src])
                dfs(i,dest,ans,path,graph);
        }
        // path.remove(path.size()-1);
        path.remove(Integer.valueOf(src));
            
    }
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList();
        List<Integer> path = new ArrayList();
        int dest = graph.length-1;
        dfs(0,dest,ans,path,graph);
        return ans;
    }
}
