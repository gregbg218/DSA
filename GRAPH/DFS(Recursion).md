import java.util.*;

class Graph {
    private int V;
    private List<List<Integer>> adj;

    public Graph(int v) {
        V = v;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Depth First Traversal (starting from vertex 2):");
        g.dfs(2);
    }
}


In the recursive DFS implementation you've provided, there isn't an explicit base case in the traditional sense. However, the recursion does terminate naturally due to the structure of the algorithm. Let's break it down:

Implicit Base Case:
The base case is implicitly handled by the condition in the for loop:
javaCopyfor (int neighbor : adj.get(v)) {
    if (!visited[neighbor]) {
        dfsUtil(neighbor, visited);
    }
}
The recursion stops for a particular path when there are no more unvisited neighbors. This happens when either:
a) All neighbors of the current vertex have been visited.
b) The current vertex has no neighbors.
Termination Condition:
The recursion terminates when all reachable vertices from the starting vertex have been visited. This is ensured by the visited array, which prevents revisiting vertices.
Implicit Return:
There's no explicit return statement in the dfsUtil method. It implicitly returns (void) when it has processed the current vertex and all its unvisited neighbors.

While this implementation works correctly, it's sometimes clearer to have an explicit base case. If you wanted to add one, you could modify the method like this:



    
   
    void dfsUtil(int v, boolean[] visited) {
    if (visited[v]) 
    {
        return;  // Explicit base case
    }
    visited[v] = true;
    System.out.print(v + " ");
    
    for (int neighbor : adj.get(v)) 
    {
        dfsUtil(neighbor, visited);
        }
    }



But the problem with tihs explicit one is:


<img width="514" alt="image" src="https://github.com/user-attachments/assets/38abac52-1210-45d4-a694-7147776d4ff2">
