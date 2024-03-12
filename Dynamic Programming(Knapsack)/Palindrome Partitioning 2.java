class Solution {
    public int minCut(String s) 
    {
        return findMinCuts(s,0);
    }

    public int findMinCuts(String s, int start)
    {
        if(start>s.length()-1 || checkPalindrome(s,start,s.length()-1))
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
