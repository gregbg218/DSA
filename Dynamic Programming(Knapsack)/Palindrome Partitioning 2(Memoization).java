class Solution {
    public int minCut(String s) 
    {
        int[] dp = new int[s.length()];
         for(int j=0;j<=s.length()-1;j++)
           {
               dp[j]=-1;
           }
        return findMinCuts(s,0,dp);
    }

    public int findMinCuts(String s, int start,int[] dp)
    {
        if(start>s.length()-1 || checkPalindrome(s,start,s.length()-1))
            return 0;

        if(dp[start]!=-1)
            return dp[start];

        int ans= Integer.MAX_VALUE;
        for(int i=start;i<s.length();i++)
        {
            if(checkPalindrome(s,start,i))
            {
                int tempCuts=1+findMinCuts(s,i+1,dp);
                ans=Math.min(ans,tempCuts);
                
            }
        }
        return dp[start]=ans;
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
