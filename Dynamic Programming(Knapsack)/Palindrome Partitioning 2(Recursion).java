class Solution {
    public int minCut(String s) 
    {
        return findMinCuts(s,0);
    }

    public int findMinCuts(String s, int start)
    {
        if(start>s.length()-1 || checkPalindrome(s,start,s.length()-1))// stopping at last character becos it is always a palindrome
            return 0;                                                  // 2nd condition is checking if whole string is palindrome

        int ans= Integer.MAX_VALUE;
        for(int i=start;i<s.length();i++)
        {
            if(checkPalindrome(s,start,i))
            {
                int tempCuts=1+findMinCuts(s,i+1);
                ans=Math.min(ans,tempCuts);
            }
        }
        return ans;
    }


    public boolean checkPalindrome(String s, int start,int end)
    {
        
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}
// Our task is to find minimum number of partitions such that every substring created due to the partition is a palindrome

// Basically we are finding first palindrome and then leaving the remaining part for
// solving later
// example: aabaacdefghvn
// so first partition can have multiple possibilities:
// first possibility will be from "a" and solving remaining part
// second will be "aa" and solving remaining part
// third will be "aabaa" and solving remaining part
// from all 3 subproblems we will find the smallest number of partitions for first partition
// similarly for 2nd partition which will be 2nd subproblem we will repeat


// This problem could have been done by MCM or normal partition but instead this pattern "front partition" gives better time complexity
