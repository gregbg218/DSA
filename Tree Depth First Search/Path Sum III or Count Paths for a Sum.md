MAIN APPROACH:

Create a cumulative sum variable and for each node add its value to the cumulative sum. and this variable is called "currSum"

Then at each node store the cumulative sum value at that node in the hash map.

Now to see if we have gotten a path that matches the target sum do this example:




So like if target sum is 11 and we have nodes like:


<img width="346" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/7d9299a0-516c-498a-b875-e34737a90101">

So we have cumulative sums of 4,10,16 and 21 along the arrow shown in the diagram

Then we do this:

cumulativePathSum.getOrDefault(currSum - targetSum, 0);

This checks if difference of currSum and target sum exists in the cumulative Sum hash map.

So if we are on node 5 with currSum 21 then when we do 21-11=10 we get 10 which has a frequency of 1 in the hash map
This means a path with sum 11 exisits in the tree


Now once we are done with the elft side we back track to do the same for the right side nodes


<img width="1160" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/4ef546b1-21a7-4989-b753-422f45e5da8b">


