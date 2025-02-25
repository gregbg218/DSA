Basically we need to find if the permutation exists as a single continuous substring(not with gaps of other letters in between)
<img width="900" alt="image" src="https://github.com/user-attachments/assets/f348cff6-3cef-4590-9cac-bdda80e2321e" />

Let's go through the code step by step:

1. The `findPermutation` method takes two strings, `str` and `pattern`, as input.

2. It initializes variables `windowStart` and `matched` to keep track of the starting index of the current window and the number of characters matched in the current window, respectively.

3. It creates a `charFrequencyMap` using a HashMap to store the frequency of each character in the `pattern`.

4. It iterates through the characters of `str` using the `windowEnd` variable.

5. For each character at `windowEnd`:
   - If the character is present in the `charFrequencyMap`, it decrements its frequency in the map.
   - If the frequency of the character becomes zero, it means the character is completely matched, so it increments the `matched` count.
   - If the `matched` count becomes equal to the size of `charFrequencyMap`, it means a permutation of the pattern is found in the current window, so it returns `true`.

6. If the window size (`windowEnd - windowStart + 1`) becomes equal to the length of the `pattern`, it shrinks the window by moving the `windowStart` pointer to the right:
   - It retrieves the character at `windowStart` and checks if it is present in the `charFrequencyMap`.
   - If the character's frequency in the map is zero, it means the character was completely matched, so it decrements the `matched` count.
   - It increments the character's frequency in the map to indicate that the character is no longer matched.

7. If no permutation of the pattern is found after iterating through all the characters of `str`, it returns `false`.




<img width="1003" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/d3c49f03-cd8a-44d1-aa16-626ed22db06a">

