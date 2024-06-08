words are of same length but different letters, also words can be in any order without overlapping
<img width="739" alt="image" src="https://github.com/gregbg218/DSA/assets/72642906/7caa7b3a-a679-4be6-9260-4c2ec43bbb3f">


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
