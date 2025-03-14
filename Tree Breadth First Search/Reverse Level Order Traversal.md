Same as BFS only diiference is we are using a linked list and every new level is inserted as the 1st node.

Code difference:
List<List<Integer>> result = new LinkedList<List<Integer>>();
....
result.add(0, currentLevel);


<img width="900" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/d8cee446-fbc8-42ba-b9e7-9fe5a14c000f">
