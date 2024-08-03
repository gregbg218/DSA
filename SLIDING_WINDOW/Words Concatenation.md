words are of same length but different letters, also words can be in any order without overlapping
<img width="739" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/7caa7b3a-a679-4be6-9260-4c2ec43bbb3f">

find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once

<img width="591" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/2735d51c-ec7a-423e-b3d6-c0efb1799d83">
 


rememebr "i" is used for finding the concatenations from every index of the array whereas "j" is only for
checking if we have found all the words that we have seen i.e. wordcount


Now j+1==wordcount is for checking if all the reqd words are accounted for.
j+1 becos we start from 0

we could have let the for loop take care of that but we cant becos we need to add the index to result


wordFrequencyMap is the map for the words we require

wordsSeen is the map for the words in our current window of "i"


if (wordsSeen.get(word) > wordFrequencyMap.getOrDefault(word, 0))

                    break;

                    
this is for checking if the word matches the words we require













![image](https://github.com/user-attachments/assets/1defc64c-14f3-4d04-81f8-250d835b7135)


![image](https://github.com/user-attachments/assets/66ef87f1-765d-4f8a-bf80-95fc9fd1fce0)



![image](https://github.com/user-attachments/assets/4d0fca15-76c6-4d32-a844-f96384c654e5)

