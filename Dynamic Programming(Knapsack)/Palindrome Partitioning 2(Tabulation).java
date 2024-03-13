class Solution {
    public int minCut(String s) 
    {
        int[] dp = new int[s.length()];
         for(int j=0;j<=s.length()-1;j++)
           {
               dp[j]=-1;
           }
        return findMinCuts(s,dp);
    }

    public int findMinCuts(String s,int[] dp)
    {
        if(checkPalindrome(s,0,s.length()-1))
            return 0;

        
        dp[s.length()-1]=0;
        
        for(int start=s.length()-2;start>=0;start--)
        {
            
            int ans= Integer.MAX_VALUE;
            for(int i=start;i<s.length();i++)
            {
                
                
                if(checkPalindrome(s,start,i))
                {
                    int tempCuts=0;
                    if(i+1>s.length()-1)
                        tempCuts=0;
                    else
                        tempCuts=1+dp[i+1];
                                     
                    ans=Math.min(ans,tempCuts);
                    
                }
            }
            dp[start]=ans;

        }
        
        return dp[0];
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
