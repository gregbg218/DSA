class Solution {

    class Point
    {
        private int value;
        private int row;
        private int col;

        Point(int value,int row,int col)
        {
            this.value=value;
            this.row=row;
            this.col=col;
        } 
    }

    public int kthSmallest(int[][] matrix, int k) {


           Comparator<Point> pointComp = new Comparator<Point>() {
            @Override
            public int compare(Point node1, Point node2) {
                return node1.value - node2.value;
            }
        };

        PriorityQueue<Point> minHeap = new PriorityQueue<>(pointComp);
        for (int i = 0; i < matrix.length; i++)
        {
            if (matrix[i] != null)
            {
                minHeap.add(new Point(matrix[i][0],i,0));
            }


        }


        Point topPoint=null;
        while(k!=0)
        {
            topPoint = minHeap.poll();
            k--;
            int i=topPoint.row;
            int j=topPoint.col+1;
            
            if(j<matrix[i].length)
            {
                minHeap.add(new Point(matrix[i][j],i,j));
            }
        }

        return topPoint.value;
        
    }
}
