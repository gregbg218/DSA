
Note : Unlike Top K elements approach we dont use MaxHeap when top k elements are required or minHeap when smallest k elements are used.

Step 1:
for (int i = 0; i < matrix.length; i++)
        {
            if (matrix[i] != null)
            {
                minHeap.add(new Point(matrix[i][0],i,0));
            }


        }

Step 2:
1st step is to fill the heap with the smallest elements or k introductory elements that we will later pop

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
2nd step is to fill the heap with new elements while popping the old (maintaining k elements in heap)



How to identify?

If the problem gives K sorted arrays and asks us to perform a sorted traversal of all the elements of all arrays, we need to think about K-way Merge pattern.

In the context of the K-way Merge pattern and the problem it addresses, "sorted traversal" refers to the process of going through all the elements in K sorted 
arrays in such a way that you visit each element in a sorted order.

When you encounter a problem that involves dealing with multiple lists of sorted items (arrays in this case) and you need to combine them into a single,
sorted list, you should think about using the K-way Merge pattern. This pattern is handy in situations where you have K sorted arrays,
and you want to create a single sorted list that contains all the elements from these arrays.



