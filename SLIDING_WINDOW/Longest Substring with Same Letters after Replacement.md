<img width="900" alt="image" src="https://github.com/user-attachments/assets/c9546927-4247-466c-91ed-cce8e6baa70e" />



k is number of characters we are allowed to replace
(windowEnd - windowStart + 1 - maxRepeatLetterCount )
which can be simplified as (window length-maxRepeatLetterCount) = number of non repeating characters

basically (window length-maxRepeatLetterCount) should be equal to k for a window to qualify and so the largest such qualifying window is the answer

if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k
then we shrink the window from the left as it means there's too many characters to replace




so we just move to the right character by character and for every new character check if its the max repeating character
