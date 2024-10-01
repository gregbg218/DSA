The order of pushing children onto the stack matters. 
We push them in reverse order of desired exploration.

<img width="811" alt="image" src="https://github.com/user-attachments/assets/a7e55876-439f-4951-abb3-7cac47b639f3">

So even though C was pushed first we explore B before it .



Also slight change in the code we are moving  "visited[curr] = true;" otuside of the for loop :

 public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> s = new Stack<>();
 public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> s = new Stack<>();
        s.push(start);
        visited[start] = true;

        while (!s.isEmpty()) {
         public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        Stack<Integer> s = new Stack<>();
        s.push(start);
        visited[start] = true;

        while (!s.isEmpty()) {
            int curr = s.pop();
            visited[curr] = true;
            System.out.print(curr + " ");

            for (int neighbor : adjList.get(curr)) {
                if (!visited[neighbor]) {
                    s.push(neighbor);
                    
                }
            }
        }
    }

