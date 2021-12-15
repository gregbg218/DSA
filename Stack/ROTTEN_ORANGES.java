class Solution {
    public int orangesRotting(int[][] grid) {
        int noOfRows = grid.length;
        int noOfColumns = grid[0].length;
        int noOfOranges = 0 ;
        Queue<Integer[]> q = new LinkedList<Integer[]>();
        
        for(int i = 0 ; i<noOfRows ; i++)
        {
            for(int j = 0 ; j<noOfColumns ; j++)
            {
                if(grid[i][j] == 2)
                    q.add(new Integer[] {i,j} );
                if(grid[i][j] != 0)
                    noOfOranges+=1;
            }
        }
        
        int time = 0 , visitedOranges = 0;
        int[] dx = {0,1,0,-1}; // FOR CHECKING IN 4 DIRECTIONS OF THE POINT
        int[] dy = {1,0,-1,0}; // FOR CHECKING IN 4 DIRECTIONS OF THE POINT
        
        while(!q.isEmpty())
        {
            int size = q.size();
            visitedOranges+=size;
            
            for(int b = 0 ; b<size ; b++)
            {
               Integer[] point = q.poll();
               for(int a = 0 ; a<dx.length ; a++ )
                {
                    int x = point[0] + dx[a];
                    int y = point[1] + dy[a];
                    if(x<0 || y<0 || x>=noOfRows || y>=noOfColumns || grid[x][y] != 1)
                        continue;
                    grid[x][y] = 2;
                    
                    q.add(new Integer[] {x,y});
                }
            }
            if(!q.isEmpty())
                time+=1;
        }
        
        System.out.println(visitedOranges);
        System.out.println(noOfOranges);
        
        if(visitedOranges == noOfOranges)
            return time;
        return -1;
    }
}
