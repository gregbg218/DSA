# LOGIC:

<img width="800" alt="image" src="https://github.com/user-attachments/assets/1f297a04-168b-4221-8f50-82c24e1dd7f1" />





# EXPLAINATION: count += remainderCount.getOrDefault(remainder, 0);


## Let's say at some point:
remainder_count = {3: 4}  # We've seen remainder 3 four times before

# Then we get a number that gives remainder 3 again (for the 5th time):
cumsum = something
remainder = 3

# This line:
count += remainder_count.get(remainder, 0)
# means: count += 4 
# Because we've seen this remainder 4 times before, 
# we can make 4 new subarrays with each previous position

lets say the cum sum array was 
{4,5,6,7,8}
and all were with remainder 3
and the last element is the 5th cum sum where we get remainder 3 again
now we can for pairs like this

(4 TO 8) and (5 TO 8) and (6 TO 8) and (7 TO 8) thus showing that we have 4 subarrays with sum divisible by K

# Then we update the map:
remainder_count[3] = 5  # Increment it to 5

# Next time we get remainder 3:
count += remainder_count.get(remainder, 0)
# means: count += 5 
# Because now we've seen remainder  five times before now we will again add 5 to count because the new remainder 3 that we see will form 5 new pairs/subarrays with the previous sightings

remainder_count[3] = 6  # Increment it to 6

so thats why we add the whole count again and again becos new pairs are formed with each sighting


# EXPLAINATION: remainderCount.put(0, 1);
<img width="704" alt="image" src="https://github.com/user-attachments/assets/908b59e3-5107-4879-b399-d30830acda63" />

REMEMBER MAIN GOAL IS TO FIND SUBARRAYS WITH SUM DIVISIBLE BY K SO IF WE GET A PREFIX/CUM SUM DIVISIBLE BY K WITH REMAINDER 0 THAT MEANS IT SATISFIES OUR GOAL
