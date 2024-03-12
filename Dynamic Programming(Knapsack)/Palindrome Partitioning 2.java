class Solution {
    public int minCut(String s) 
    {
        return findMinCuts(s,0)-1;   // -1 becos base case stops at n but not at the last letter(n-1) and since last letter alone will 
                                     // always be a palindrome we will unecessarily add another 1 to the answer see video at 17:54
                                     // all alternatives to this like stopping at n-1 using if(start>=n-1) as base case fail
    }

    public int findMinCuts(String s,int start)
    {
        if(start==s.length())
            return 0;

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
