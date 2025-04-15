<img width="900" alt="image" src="https://github.com/user-attachments/assets/a1b05235-9b7a-4a8b-a343-503d6a5c5f80" />

The hashmap here has following format

Key = Value of prefix sum encountered at different indices

Value = Count of the prefix sum values encountered

So basically we are using prefix sum which is another name for cumulative sum


At each element we have our cumulative sum called as prefix sum


So what we need is instances where:

current prefix sum - previous prefix sum = goal sum (and this gives us the subarray that satisfies the goal sum)

Example:

current prefix sum(from index 0 to 4)  -  previous prefix sum(from index 0 to 2) = goal sum

then the subarray from index 3 to 4 satisfies the goal sum

(previous prefix sum is any previous cumulative sum like if current prefix sum is for index range 0 to 4 previous can be from 0 to 1 or 0 to 3)

On further reframing the equation:

current prefix sum - goal sum  = previous prefix sum


So thats what we are doing we have a hashmap that stores the count of any prefix sum value that we encounter and  since we just need the count of sunch subarrays, we just add to total count
