
(Note : Unlike Top K elements approach we use MaxHeap when top k elements are required or minHeap when smallest k elements are used.)










Step 1:



![image](https://github.com/gregbg218/DSA/assets/72642906/ab70c7dd-45a4-43e6-8f35-80b328b72a84)



1st step is to fill the heap with the smallest elements or k introductory elements that we will later pop

Step 2:



![image](https://github.com/gregbg218/DSA/assets/72642906/fd8c38cb-b094-46ee-89b6-f38dbf13a40b)

2nd step is to fill the heap with new elements while popping the old (maintaining k elements in heap)



How to identify?

If the problem gives K sorted arrays and asks us to perform a sorted traversal of all the elements of all arrays, we need to think about K-way Merge pattern.

In the context of the K-way Merge pattern and the problem it addresses, "sorted traversal" refers to the process of going through all the elements in K sorted 
arrays in such a way that you visit each element in a sorted order.

When you encounter a problem that involves dealing with multiple lists of sorted items (arrays in this case) and you need to combine them into a single,
sorted list, you should think about using the K-way Merge pattern. This pattern is handy in situations where you have K sorted arrays,
and you want to create a single sorted list that contains all the elements from these arrays.



